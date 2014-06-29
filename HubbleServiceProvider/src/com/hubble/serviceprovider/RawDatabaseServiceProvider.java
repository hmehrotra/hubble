package com.hubble.serviceprovider;

import com.hubble.content.h2.beanExtensions.ArchiveDump;
import com.hubble.content.h2.beanExtensions.HubbleArchive;
import com.hubble.content.hibernate.HibernateUtil;
import com.hubble.service.RawDatabaseService;
import com.hubble.service.Service;
import com.hubble.utilities.ObjectUtilities;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

/**
 * Service provider class for reading and writing processed or un-processed database dumps
 * @author Harshit Mehrotra
 * Date Feb 6, 2014
 */
public class RawDatabaseServiceProvider implements RawDatabaseService, HubbleServiceProvider {

    private static RawDatabaseServiceProvider _rawDatabaseServiceProvider;

    private RawDatabaseServiceProvider(){
    }

    @Override
    public String serviceName(){
        return "RawDatabaseService";
    }

    public static RawDatabaseServiceProvider getInstance(){
       /* Double checked singleton pattern to make sure that only a single service provider instance exists */
        if (ObjectUtilities.isNull(_rawDatabaseServiceProvider)){
            synchronized (RawDatabaseServiceProvider.class) {
                if (ObjectUtilities.isNull(_rawDatabaseServiceProvider)){
                    _rawDatabaseServiceProvider = new RawDatabaseServiceProvider();
                }
            }
        }
        return _rawDatabaseServiceProvider;
    }

    @Override
    public Service getService(){
        return this;
    }

    /**
     * Fetches and returns all records in raw dump.
     * This method should only be used for processing raw dump
     */
    public List<ArchiveDump> fetchArchiveDump(){
        /* Session in hibernate is not thread-safe.
           getCurrentSession() returns the session object tied to current context.
           Each thread gets a different session object and there is no need to
           close this session
         */
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx;
        List results = null;

        try{
            tx = session.beginTransaction();
            Query query = session.createQuery("from ArchiveDump order by archiveDumpId");
            results = query.list();

            tx.commit();
        }
        catch (HibernateException he){
            /* Since this transaction involves read-only operation, there is no need of rollback*/
            he.printStackTrace();
        }

        return results;
    }

    /**
     * Fetches and returns all records in processed hubble archive.
     * This method should only be used for processed hubble archive
     */
    public List<HubbleArchive> fetchHubbleArchive(){
        /* Session in hibernate is not thread-safe.
           getCurrentSession() returns the session object tied to current context.
           Each thread gets a different session object and there is no need to
           close this session
         */
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx;
        List results = null;

        try{
            tx = session.beginTransaction();
            Query query = session.createQuery("from HubbleArchive order by archiveDumpId");
            query.setMaxResults(100);

            results = query.list();

            tx.commit();
        }
        catch (HibernateException he){
            /* Since this transaction involves read-only operation, there is no need of rollback*/
            he.printStackTrace();
        }

        return results;
    }

    /**
     * Receives a list of processed objects from the dump processor and persists them in database
     * @param processedObjects A list of processed records corresponding to one alliance
     */
    public void saveHubbleArchiveProcessedObjects(List <HubbleArchive> processedObjects){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            for (HubbleArchive processedObject : processedObjects){
                session.save(processedObject);
                System.out.println("Persisted : " + processedObject.getArchiveDumpId());
            }

            /* Flush a batch of inserts at a go instead of flushing one object at a time */
            session.flush();
            session.clear();

            /* Transaction.commit will close the session */
            tx.commit();
        }
        catch(HibernateException he){
            if (tx != null){
                /* Since this transaction involves writing to database, we need to rollback
                   in case of failure to avoid putting database in in-consistent state
                 */
                tx.rollback();
            }
            he.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Following exception occurred in persisting this object : " + e.getMessage());
        }
    }
}