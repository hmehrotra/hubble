package com.hubble.content.solr;

import com.hubble.content.h2.beanExtensions.HubbleArchive;

/**
 * Created by haughty on 5/18/14.
 */
public class SolrCache {

    public static void addObjectToSolrCache(HubbleArchive archiveObject){
        System.out.println("Added object with Id to Solr Cache:" + archiveObject.getArchiveDumpId());
    }
}
