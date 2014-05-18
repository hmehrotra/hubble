package com.hubble.service;

import java.util.List;

/**
 * This service interface lists all the services that a Market Segment Service provider
 * should implement or delegate to other service provider
 * @author Harshit Mehrotra
 * Date Feb 6, 2014.
 */
public interface SegmentService {
    public List<String> segmentNamesForSicCode(String sicCode);

    public List <String> sicCodesForSegmentName(String segmentName);
}
