package test;

import com.hubble.serviceprovider.HubbleServiceProviderRegistration;
import com.hubble.serviceprovider.SegmentServiceProvider;
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
        SegmentServiceProvider serviceProvider = (SegmentServiceProvider)HubbleServiceProviderRegistration.getServiceProvider("SegmentServiceProvider");
        List<String> sicCodes = serviceProvider.sicCodesForSegmentName("System Integrator");

        assert(sicCodes.contains("7375"));
        assert(sicCodes.contains("8742"));

        assertTrue("Verifying size of sicCode list", sicCodes.size() == 2);
    }

    @Test
    public void testSegmentNameForSicCode(){
        System.out.println("Running test SegmentNameForSicCode");
        SegmentServiceProvider serviceProvider = (SegmentServiceProvider) HubbleServiceProviderRegistration.getServiceProvider("SegmentServiceProvider");
        List <String> segmentNames = serviceProvider.segmentNamesForSicCode("2711");

        assert(segmentNames.contains("Content Providers"));
        assert(segmentNames.contains("Media & Entertainment Providers"));
    }
}
