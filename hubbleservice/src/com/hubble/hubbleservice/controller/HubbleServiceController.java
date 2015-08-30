package com.hubble.hubbleservice.controller;

import com.hubble.hubbleservice.service.RawDatabaseService;
import com.hubble.hubbleservice.service.SegmentService;
import javax.inject.Inject;
import javax.ws.rs.Produces;

/**
 * Created by haughty on 11/26/14.
 */
@Produces()
public class HubbleServiceController {
    @Inject SegmentService segmentservice;
    @Inject RawDatabaseService rawdatabaseService;
}
