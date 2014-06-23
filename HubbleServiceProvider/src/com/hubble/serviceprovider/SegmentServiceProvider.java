package com.hubble.serviceprovider;

import com.hubble.content.h2.beanExtensions.SicCodeSegmentMapping;
import com.hubble.content.hibernate.HibernateUtil;
import com.hubble.service.SegmentService;
import com.hubble.service.Service;
import com.hubble.utilities.ObjectUtilities;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Service provider class for Market Segments related query
 * @author Harshit Mehrotra
 * Date May 18, 2014
 */
public class SegmentServiceProvider implements SegmentService, HubbleServiceProvider{
    private static SegmentServiceProvider _segmentServiceProvider;
    private static Map <String, List<String>> _sicCodeSegmentNameMap;
    private static Map <String, List<String>>_segmentNameSicCodeMap;

    private SegmentServiceProvider(){}

    @Override
    public String serviceName(){
        return "SegmentService";
    }

    public static SegmentServiceProvider getInstance(){
        /* Double checked singleton pattern to make sure only one segment service exists */
        if (ObjectUtilities.isNull(_segmentServiceProvider)){
            synchronized(SegmentServiceProvider.class){
                if (ObjectUtilities.isNull(_segmentServiceProvider)){
                    _segmentServiceProvider = new SegmentServiceProvider();
                }
            }
        }
        return _segmentServiceProvider;
    }

    public Service getService(){
        return this;
    }

    private List <SicCodeSegmentMapping> fetchSicCodeSegmentNameMap(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx;
        List <SicCodeSegmentMapping> results = null;

        try{
            tx = session.beginTransaction();
            Query query = session.createQuery("from SicCodeSegmentMapping order by segmentName");
            results = query.list();

            tx.commit();
        }
        catch (HibernateException he){
            /* Since this transaction involves read-only operation, there is no need of rollback*/
            he.printStackTrace();
        }
        return results;
    }

    public List <String> sicCodesForSegmentName(String segmentName){
        if (ObjectUtilities.isNull(_segmentNameSicCodeMap)){
            List <SicCodeSegmentMapping> results = fetchSicCodeSegmentNameMap();

            if (results != null && results.size() > 0){

                _segmentNameSicCodeMap = new HashMap<>();
                for (SicCodeSegmentMapping mapping : results){
                    if (_segmentNameSicCodeMap.containsKey(mapping.getSegmentName())){
                        _segmentNameSicCodeMap.get(mapping.getSegmentName()).add(mapping.getSicCode());
                    }
                    else{
                        List <String> sicCodeList = new ArrayList<>();
                        sicCodeList.add(mapping.getSicCode());
                        _segmentNameSicCodeMap.put(mapping.getSegmentName(), sicCodeList);
                    }
                }
            }
        }
        return _segmentNameSicCodeMap.get(segmentName);
    }

    public List <String> segmentNamesForSicCode(String sicCode){
        if (ObjectUtilities.isNull(_sicCodeSegmentNameMap)){
            List <SicCodeSegmentMapping> results = fetchSicCodeSegmentNameMap();
            if (results != null && results.size() > 0){

                _sicCodeSegmentNameMap = new HashMap<>();
                for (SicCodeSegmentMapping mapping : results){
                    if (_sicCodeSegmentNameMap.containsKey(mapping.getSicCode())){
                        _sicCodeSegmentNameMap.get(mapping.getSicCode()).add(mapping.getSegmentName());
                    }
                    else{
                        List <String> segmentList = new ArrayList<>();
                        segmentList.add(mapping.getSegmentName());
                        _sicCodeSegmentNameMap.put(mapping.getSicCode(), segmentList);
                    }
                }
            }
        }
        return _sicCodeSegmentNameMap.get(sicCode);
    }

    public static void main(String args[]){
        SegmentServiceProvider p = new SegmentServiceProvider();

        System.out.println(p.segmentNamesForSicCode("7372"));
        System.out.println(p.sicCodesForSegmentName("Gaming Providers"));
    }
}
