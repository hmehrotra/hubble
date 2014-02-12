package com.hubble.utilities;

import java.util.List;

/**
 * General utility class for Arrray
 * @author Harshit Mehrotra
 * Date Feb 10, 2014
 */
public class ArrayUtilities {
    public static <T extends Object> boolean  isNullOrEmpty(List<T> list){
        return list == null || list.size() == 0;
    }
}
