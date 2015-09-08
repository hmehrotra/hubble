package com.hubble.hubblebackend.indexbuilder;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hubble.hubblebackend.postgressql.model.ArtistType;

/**
 * Reads from the Postgres music brainz database server and generates payload
 * which will be consumed by various index builder
 * 
 * @author harshitmehrotra
 **/
public class PostgresIndexReader {
	
	/* 
	 * <p>
	 * 	Reads artist name from postgres server and publishes payload to kafka.
	 * 	Conusmers process the payload and add the entitie to the index
	 * </p>
	 */
	public static void artistNameReader(){
		
	}
	
	public static void artistTypeReader(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx;
		
		try{
			tx = session.beginTransaction();
			Query query = session.createQuery("from ArtistType order by name");
			
			List <ArtistType> artistTypes = query.list();
			artistTypes.stream().forEach(artistType -> {
				System.out.println("Artits type is: " + artistType.getName());
			});
			
			tx.commit();
		}
		catch(HibernateException he){
			/* Since this transaction involves read-only operation, there is no need of rollback*/
            he.printStackTrace();
		}
	}
	
	public static void main(String args[]){
		PostgresIndexReader.artistTypeReader();
	}
}
