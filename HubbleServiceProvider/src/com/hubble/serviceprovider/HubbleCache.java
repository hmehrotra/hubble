package com.hubble.serviceprovider;

import com.hubble.content.h2.beanExtensions.HubbleArchive;
import java.util.List;

/**
 * This interface consists of all functions to be implemented by
 * a Hubble Cache.
 *
 * @author Harshit Mehrotra
 * Date: July 19, 2014
 */

public interface HubbleCache {

    /* Handles addition of new objects to this cache */
    public void addObjectsToCache(List<HubbleArchive> archiveObjects);
}
