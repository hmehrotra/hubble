package com.hubble.content.test;

/**
 * Created by haughty on 2/4/14.
 */
import com.hubble.content.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.List;

public class HibernateSetupTest {
    public static void main(String args[]){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("from _ArchiveDump");

        List results = query.list();
        System.out.println(results.size());

        session.close();
    }
}
