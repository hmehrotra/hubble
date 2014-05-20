package com.hubble.content.h2.test;

import com.hubble.content.h2.service.SegmentServiceProvider;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertTrue;

/**
 * This class contains all JUnit tests for Segment Service Provider
 * @author Harshit Mehrotra
 * Date: May 19, 2014
 */
public class H2ServiceTest {

    @Test
    public void testSicCodeForSegmentName(){
        System.out.println("Running test SicCodeForSegmentName");
        List<String> sicCodes = SegmentServiceProvider.getInstaance().sicCodesForSegmentName("System Integrator");

        assert(sicCodes.contains("7375"));
        assert(sicCodes.contains("8742"));
        
        assertTrue("Verifying size of sicCode list", sicCodes.size() == 2);
    }

    @Test
    public void testSegmentNameForSicCode(){
        System.out.println("Running test SegmentNameForSicCode");
        List <String> segmentNames = SegmentServiceProvider.getInstaance().segmentNamesForSicCode("2711");

        assert(segmentNames.contains("Content Providers"));
        assert(segmentNames.contains("Media & Entertainment Providers"));
    }
}
