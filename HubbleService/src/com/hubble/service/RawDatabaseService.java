package com.hubble.service;

import java.util.List;

/**
 * This service interface lists all the services for reading a un-processed database dump or
 * reading and writing a processed database dump
 *
 * @author Harshit Mehrotra
 * Date Feb 6, 2014.
 */
public interface RawDatabaseService {
    public <T extends Object> List <T> fetchArchiveDump();
}
