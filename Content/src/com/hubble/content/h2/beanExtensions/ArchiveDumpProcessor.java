package com.hubble.content.h2.beanExtensions;

import com.hubble.utilities.DateUtilities;
import com.hubble.utilities.StringUtilities;
import java.util.Date;

/**
 * Processor enum contains helper methods to process all fields of raw dump archive
 * @author Harshit Mehrotra
 * Date Feb 13, 2014.
 */
public enum ArchiveDumpProcessor {
    archiveDumpId(){
      public Long processObject(String value){
          return StringUtilities.isNullOrEmpty(value) ? null : Long.parseLong(value.trim());
      }
    },
    dateAllianceTerminated(){
        public Date processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? null : DateUtilities.stringToDate(value);
        }
    },
    dateExpired(){
        public Date processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? null : DateUtilities.stringToDate(value);
        }
    },
    dateEffective(){
        public Date processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? null : DateUtilities.stringToDate(value);
        }
    },
    dateAnnounced(){
        public Date processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? null : DateUtilities.stringToDate(value);
        }
    },

    participantName(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    participantBusinessDescription(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    participantPrimarySicCode(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? null : value.trim();
        }
    },
    participantStateCode(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    participantCity(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    participantCusip(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    participantStockExchange(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    participantStockExchangeCode(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    participantWebsite(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    participantNation(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    participantNationCode(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    participantPublicStatus(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    participantSicCodes(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    participantTickerSymbol(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    ultimateParentName(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    ultimateParentNation(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    ultimateParentPrimarySicCode(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    ultimateParentCusip(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    ultimateParentStatus(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    parentCusip(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    parentName(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },

    status(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    dealText(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    isJointVenture(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    participantOwnerShip(){
        public Float processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? null : Float.parseFloat(value.trim());
        }
    },
    dealNumber(){
        public Long processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? null : Long.parseLong(value.trim());
        }
    },
    isExclusiveLicensingAgreement(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    isExplorationAgreement(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    isFundingAgreement(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    isLicensingAgreement(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    isMarketingAgreement(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    isManufacturingAgreement(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    isRAndDAgreement(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    isStrategicAgreement(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    isSupplyAgreement(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    allianceNation(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    participantCount(){
        public Integer processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? null : Integer.parseInt(value.trim());
        }
    },
    alliancePrimarySicCode(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? null : value.trim();
        }
    },
    allianceAllSicCodes(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },

    jointVentureCusip(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    jointVentureName(){
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    },
    jointVentureType(){
        @Override
        public String processObject(String value){
            return StringUtilities.isNullOrEmpty(value) ? value : value.trim();
        }
    };

    public <T extends Object> T processObject (String value){
        return (T)value;
    }
}
