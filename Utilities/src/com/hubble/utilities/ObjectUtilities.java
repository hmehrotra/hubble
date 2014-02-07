package com.hubble.utilities;

/**
 * General utility class for Object
 * @author Harshit Mehrotra
 * Date Feb 6, 2014
 */
public class ObjectUtilities {

    /**
     * Checks if the object is null
     * @param value
     */
    public static <T extends Object> boolean  isNull(T value){
        return value == null;
    }
}
