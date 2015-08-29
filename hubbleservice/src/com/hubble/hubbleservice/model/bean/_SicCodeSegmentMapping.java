package com.hubble.hubbleservice.model.bean;

import java.io.Serializable;

/**
 * Bean class for Market_segment_Sic table
 * This bean represents mapping of sic code to market segment
 * @author Harshit Mehrotra
 * Date May 18, 2014
 */
public class _SicCodeSegmentMapping implements Serializable {
    protected String sicCode;
    protected String segmentName;

    public String getSicCode(){
        return sicCode;
    }

    public void setSicCode(String sicCode){
        this.sicCode = sicCode;
    }

    public String getSegmentName(){
        return segmentName;
    }

    public void setSegmentName(String segmentName){
        this.segmentName = segmentName;
    }

    /* Public constructor */
    public _SicCodeSegmentMapping(){

    }
}
