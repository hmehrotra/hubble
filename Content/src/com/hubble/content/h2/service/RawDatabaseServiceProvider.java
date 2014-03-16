package com.hubble.content.h2.service;

import com.hubble.content.h2.beanExtensions.ArchiveDump;
import com.hubble.content.h2.beanExtensions.HubbleArchive;
import com.hubble.content.hibernate.HibernateUtil;
import com.hubble.service.RawDatabaseService;
import com.hubble.utilities.ObjectUtilities;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.List;

/**
 * Service provider class for reading and writing processed or un-processed database dumps
 * @author Harshit Mehrotra
 * Date Feb 6, 2014
 */
public class RawDatabaseServiceProvider implements RawDatabaseService{

    private static RawDatabaseServiceProvider _rawDatabaseServiceProvider;

    private RawDatabaseServiceProvider(){
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
    /**
     * Fetches and returns all records in raw dump.
     * This method should only be used for processing raw dump
     */
    public List<ArchiveDump> fetchArchiveDump(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("from ArchiveDump order by archiveDumpId");

        query.setMaxResults(10);
        List results = query.list();

        session.close();
        return results;
    }

    /**
     * Receives a list of processed objects from the dump processor and persists them in database
     * @param processedObjects A list of processed records corresponding to one alliance
     */
    public void saveHubbleArchiveProcessedObjects(List <HubbleArchive> processedObjects){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        for (HubbleArchive processedObject : processedObjects){
            try{
                session.save(processedObject);
                System.out.println("Persisted : " + processedObject.getArchiveDumpId());

                session.flush();
                session.evict(processedObject);
            }
            catch (Exception e){
                System.out.println("Following exception occurred in persisting this object : " + e.getMessage());
            }
        }

        /* Transaction.commit will close the session */
        session.getTransaction().commit();
    }
}
