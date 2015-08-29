package com.hubble.hubbleservice.service;

import com.hubble.hubbleservice.model.beanExtensions.HubbleArchive;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import java.util.List;

import javax.inject.Named;

/**
 * This class provides following methods:
 * 1) All helper methods to create Neo4j graph
 * 2) All utility methods to read from Neo4j cache
 *
 * @author Harshit Mehrotra
 * Date: July 19, 2014
 */

@Named
public class Neo4jCacheService {
    private static final String SERVER_ROOT_URI = "http://localhost:7474/";
    public Neo4jCacheService(){}

    public static Neo4jCacheService getInstance(){
        return null;
    }

    private void addObjectsToNeo4jcache(List<HubbleArchive> archiveObjects){

    }
    public void addObjectsToCache(List<HubbleArchive> archiveObjects){
        addObjectsToNeo4jcache(archiveObjects);
    }


    public static void main(String args[]){
        WebResource resource = Client.create()
                .resource( SERVER_ROOT_URI );
        ClientResponse response = resource.get( ClientResponse.class );

        System.out.println( String.format( "GET on [%s], status code [%d]",
                SERVER_ROOT_URI, response.getStatus() ) );
        response.close();
    }
}
