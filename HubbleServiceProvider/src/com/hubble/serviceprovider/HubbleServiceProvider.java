package com.hubble.serviceprovider;

import com.hubble.service.*;

/**
 * This interface represents an abstract implementation of a Service Provider which provides a service
 */
public interface HubbleServiceProvider{

    /* Service to be provided */
    public Service getService();
}
