package com.hubble.utilities;

/**
 * General utility class for String
 * @author Harshit Mehrotra
 * Date Feb 10, 2014
 */
public class StringUtilities {
    public static boolean isNull(String val){
        return val == null;
    }

    public static boolean isNullOrEmpty(String val){
        return val == null || val.length() == 0;
    }
}
