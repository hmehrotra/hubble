package com.hubble.serviceprovider;

import com.hubble.content.h2.beanExtensions.ArchiveDump;
import com.hubble.content.h2.beanExtensions.HubbleArchive;
import com.hubble.content.h2.service.SegmentServiceProvider;
import com.hubble.service.RawDatabaseService;
import com.hubble.utilities.ObjectUtilities;
import com.hubble.service.ParticipantService;
import com.hubble.service.AllianceService;
import com.hubble.service.SegmentService;
import com.hubble.content.h2.service.RawDatabaseServiceProvider;

import java.util.List;

/**
 * This service class is the service provider for all client queries and delegates the query to
 * appropriate service provider
 * @author Harshit Mehrotra
 * Date Feb 6, 2014.
 */
public class HubbleServiceProvider implements ParticipantService, AllianceService, SegmentService, RawDatabaseService {
    private static HubbleServiceProvider _hubbleServiceProvider;

    private HubbleServiceProvider(){
    }

    public static HubbleServiceProvider getInstance(){

        /* Double checked singleton pattern to make sure that only a single service provider instance exists */
        if (ObjectUtilities.isNull(_hubbleServiceProvider)){
            synchronized (HubbleServiceProvider.class) {
                if (ObjectUtilities.isNull(_hubbleServiceProvider)){
                    _hubbleServiceProvider = new HubbleServiceProvider();
                }
            }
        }
        return _hubbleServiceProvider;
    }

    /********* Participant service provider methods *************/


    /********* Alliance service provider methods ****************/


    /********* Segment service provider methods *****************/
    public List <String> segmentNamesForSicCode(String sicCode){
        return SegmentServiceProvider.getInstaance().segmentNamesForSicCode(sicCode);
    }

    public List <String> sicCodesForSegmentName(String segmentName){
        return SegmentServiceProvider.getInstaance().sicCodesForSegmentName(segmentName);
    }

    /********* Raw Database Services ***************************/
    public List<ArchiveDump> fetchArchiveDump(){
        return RawDatabaseServiceProvider.getInstance().fetchArchiveDump();
    }

    public List <HubbleArchive> fetchHubbleArchive(){
        return RawDatabaseServiceProvider.getInstance().fetchHubbleArchive();
    }

    public void saveHubbleArchiveProcessedObjects(List <HubbleArchive> processedObjects){
        RawDatabaseServiceProvider.getInstance().saveHubbleArchiveProcessedObjects(processedObjects);
    }
}
