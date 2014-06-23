package com.hubble.serviceprovider;

import com.hubble.service.Service;
import com.hubble.utilities.ObjectUtilities;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * This class registers all the service providers in Hubble SPI
 * @author Harshit Mehrotra
 * @date June 21, 2014
 */
public class HubbleServiceProviderRegistration {

    /* Registration class should never be instantiated */
    private void HubbleServiceProviderRegistration(){ };

    private static final Map<String, HubbleServiceProvider> providers = new ConcurrentHashMap<String, HubbleServiceProvider>();

    public static void registerProvider(String name, HubbleServiceProvider provider){
        providers.put(name, provider);
    }

    public static void registerProviders(){
        registerProvider("RawDatabaseServiceProvider", RawDatabaseServiceProvider.getInstance());
        registerProvider("SegmentServiceProvider", SegmentServiceProvider.getInstance());
    }

    public static Service getServiceProvider(String name){
        if (providers.size() <= 0){
            registerProviders();
        }

        HubbleServiceProvider provider = providers.get(name);
        if (ObjectUtilities.isNull(provider)){
            throw new IllegalArgumentException("No provider registered with name " + name);
        }
        return provider.getService();
    }
}
