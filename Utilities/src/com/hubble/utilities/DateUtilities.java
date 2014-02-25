package com.hubble.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * General utility class for String
 * @author Harshit Mehrotra
 * Date Feb 10, 2014
 */

public class DateUtilities {

    /**
     * Converts date in string in format 'dd/MM/yy' into java Date
     * @param dateInString
     * @return
     */
    public static Date stringToDate(String dateInString){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Date date = null;

        try {
            date = formatter.parse(dateInString);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static void main (String [] args){
        System.out.print(DateUtilities.stringToDate("01/05/04"));
    }
}
