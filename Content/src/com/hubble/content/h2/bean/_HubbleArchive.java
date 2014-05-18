package com.hubble.content.h2.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Bean class for _HubbleArchive table
 * This bean represents a completely formatted database row
 * @author Harshit Mehrotra
 * Date Feb 2, 2014
 */
public class _HubbleArchive implements Serializable {
    protected Long archiveDumpId;
    protected Date dateAllianceTerminated;
    protected Date dateExpired;
    protected Date dateEffective;
    protected Date dateAnnounced;

    protected String participantName;
    protected String participantBusinessDescription;
    protected String participantPrimarySicCode;
    protected String participantStateCode;
    protected String participantCity;
    protected String participantCusip;
    protected String participantStockExchange;
    protected String participantStockExchangeCode;
    protected String participantWebsite;
    protected String participantNation;
    protected String participantNationCode;
    protected String participantPublicStatus;
    protected String participantSicCodes; /* Do not add this to db */
    protected String participantTickerSymbol;

    protected String ultimateParentName;
    protected String ultimateParentNation;
    protected String ultimateParentPrimarySicCode;
    protected String ultimateParentCusip;
    protected String ultimateParentStatus;

    protected String parentCusip;
    protected String parentName;

    protected String status;
    protected String dealText;
    protected Float participantOwnerShip;
    protected Long dealNumber;
    protected String isJointVenture;
    protected String isExclusiveLicensingAgreement;
    protected String isExplorationAgreement;
    protected String isFundingAgreement;
    protected String isLicensingAgreement;
    protected String isMarketingAgreement;
    protected String isManufacturingAgreement;
    protected String isRAndDAgreement;
    protected String isStrategicAgreement;
    protected String isSupplyAgreement;
    protected String allianceNation;
    protected Integer participantCount;
    protected String alliancePrimarySicCode;
    protected String allianceAllSicCodes; /* Do not add this to db */

    protected String jointVentureCusip;
    protected String jointVentureName;
    protected String jointVentureType;

    /* Public constructor */
    public _HubbleArchive(){

    }

    public Long getArchiveDumpId(){
        return archiveDumpId;
    }

    public void setArchiveDumpId(Long archiveDumpId){
        this.archiveDumpId = archiveDumpId;
    }

    public Date getDateAllianceTerminated() {
        return dateAllianceTerminated;
    }

    public void setDateAllianceTerminated(Date dateAllianceTerminated) {
        this.dateAllianceTerminated = dateAllianceTerminated;
    }

    public Date getDateExpired() {
        return dateExpired;
    }

    public void setDateExpired(Date dateExpired) {
        this.dateExpired = dateExpired;
    }

    public Date getDateEffective() {
        return dateEffective;
    }

    public void setDateEffective(Date dateEffective) {
        this.dateEffective = dateEffective;
    }

    public Date getDateAnnounced() {
        return dateAnnounced;
    }

    public void setDateAnnounced(Date dateAnnounced) {
        this.dateAnnounced = dateAnnounced;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getParticipantBusinessDescription() {
        return participantBusinessDescription;
    }

    public void setParticipantBusinessDescription(String participantBusinessDescription) {
        this.participantBusinessDescription = participantBusinessDescription;
    }

    public String getParticipantPrimarySicCode() {
        return participantPrimarySicCode;
    }

    public void setParticipantPrimarySicCode(String participantPrimarySicCode) {
        this.participantPrimarySicCode = participantPrimarySicCode;
    }

    public String getParticipantStateCode() {
        return participantStateCode;
    }

    public void setParticipantStateCode(String participantStateCode) {
        this.participantStateCode = participantStateCode;
    }

    public String getParticipantCity() {
        return participantCity;
    }

    public void setParticipantCity(String participantCity) {
        this.participantCity = participantCity;
    }

    public String getParticipantCusip() {
        return participantCusip;
    }

    public void setParticipantCusip(String participantCusip) {
        this.participantCusip = participantCusip;
    }

    public String getParticipantStockExchange() {
        return participantStockExchange;
    }

    public void setParticipantStockExchange(String participantStockExchange) {
        this.participantStockExchange = participantStockExchange;
    }

    public String getParticipantStockExchangeCode() {
        return participantStockExchangeCode;
    }

    public void setParticipantStockExchangeCode(String participantStockExchangeCode) {
        this.participantStockExchangeCode = participantStockExchangeCode;
    }

    public String getParticipantWebsite() {
        return participantWebsite;
    }

    public void setParticipantWebsite(String participantWebsite) {
        this.participantWebsite = participantWebsite;
    }

    public String getParticipantNation() {
        return participantNation;
    }

    public void setParticipantNation(String participantNation) {
        this.participantNation = participantNation;
    }

    public String getParticipantNationCode() {
        return participantNationCode;
    }

    public void setParticipantNationCode(String participantNationCode) {
        this.participantNationCode = participantNationCode;
    }

    public String getParticipantPublicStatus() {
        return participantPublicStatus;
    }

    public void setParticipantPublicStatus(String participantPublicStatus) {
        this.participantPublicStatus = participantPublicStatus;
    }

    public String getParticipantSicCodes() {
        return participantSicCodes;
    }

    public void setParticipantSicCodes(String participantSicCodes) {
        this.participantSicCodes = participantSicCodes;
    }

    public String getParticipantTickerSymbol() {
        return participantTickerSymbol;
    }

    public void setParticipantTickerSymbol(String participantTickerSymbol) {
        this.participantTickerSymbol = participantTickerSymbol;
    }

    public String getUltimateParentName() {
        return ultimateParentName;
    }

    public void setUltimateParentName(String ultimateParentName) {
        this.ultimateParentName = ultimateParentName;
    }

    public String getUltimateParentNation() {
        return ultimateParentNation;
    }

    public void setUltimateParentNation(String ultimateParentNation) {
        this.ultimateParentNation = ultimateParentNation;
    }

    public String getUltimateParentPrimarySicCode() {
        return ultimateParentPrimarySicCode;
    }

    public void setUltimateParentPrimarySicCode(String ultimateParentPrimarySicCode) {
        this.ultimateParentPrimarySicCode = ultimateParentPrimarySicCode;
    }

    public String getUltimateParentCusip() {
        return ultimateParentCusip;
    }

    public void setUltimateParentCusip(String ultimateParentCusip) {
        this.ultimateParentCusip = ultimateParentCusip;
    }

    public String getUltimateParentStatus() {
        return ultimateParentStatus;
    }

    public void setUltimateParentStatus(String ultimateParentStatus) {
        this.ultimateParentStatus = ultimateParentStatus;
    }

    public String getParentCusip() {
        return parentCusip;
    }

    public void setParentCusip(String parentCusip) {
        this.parentCusip = parentCusip;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDealText() {
        return dealText;
    }

    public void setDealText(String dealText) {
        this.dealText = dealText;
    }

    public Float getParticipantOwnerShip() {
        return participantOwnerShip;
    }

    public void setParticipantOwnerShip(Float participantOwnerShip) {
        this.participantOwnerShip = participantOwnerShip;
    }

    public Long getDealNumber() {
        return dealNumber;
    }

    public void setDealNumber(Long dealNumber) {
        this.dealNumber = dealNumber;
    }

    public String getIsJointVenture() {
        return isJointVenture;
    }

    public void setIsJointVenture(String isJointVenture) {
        this.isJointVenture = isJointVenture;
    }

    public String getIsExclusiveLicensingAgreement() {
        return isExclusiveLicensingAgreement;
    }

    public void setIsExclusiveLicensingAgreement(String isExclusiveLicensingAgreement) {
        this.isExclusiveLicensingAgreement = isExclusiveLicensingAgreement;
    }

    public String getIsExplorationAgreement() {
        return isExplorationAgreement;
    }

    public void setIsExplorationAgreement(String isExplorationAgreement) {
        this.isExplorationAgreement = isExplorationAgreement;
    }

    public String getIsFundingAgreement() {
        return isFundingAgreement;
    }

    public void setIsFundingAgreement(String isFundingAgreement) {
        this.isFundingAgreement = isFundingAgreement;
    }

    public String getIsLicensingAgreement() {
        return isLicensingAgreement;
    }

    public void setIsLicensingAgreement(String isLicensingAgreement) {
        this.isLicensingAgreement = isLicensingAgreement;
    }

    public String getIsMarketingAgreement() {
        return isMarketingAgreement;
    }

    public void setIsMarketingAgreement(String isMarketingAgreement) {
        this.isMarketingAgreement = isMarketingAgreement;
    }

    public String getIsManufacturingAgreement() {
        return isManufacturingAgreement;
    }

    public void setIsManufacturingAgreement(String isManufacturingAgreement) {
        this.isManufacturingAgreement = isManufacturingAgreement;
    }

    public String getIsRAndDAgreement() {
        return isRAndDAgreement;
    }

    public void setIsRAndDAgreement(String isRAndDAgreement) {
        this.isRAndDAgreement = isRAndDAgreement;
    }

    public String getIsStrategicAgreement() {
        return isStrategicAgreement;
    }

    public void setIsStrategicAgreement(String isStrategicAgreement) {
        this.isStrategicAgreement = isStrategicAgreement;
    }

    public String getIsSupplyAgreement() {
        return isSupplyAgreement;
    }

    public void setIsSupplyAgreement(String isSupplyAgreement) {
        this.isSupplyAgreement = isSupplyAgreement;
    }

    public String getAllianceNation() {
        return allianceNation;
    }

    public void setAllianceNation(String allianceNation) {
        this.allianceNation = allianceNation;
    }

    public Integer getParticipantCount() {
        return participantCount;
    }

    public void setParticipantCount(Integer participantCount) {
        this.participantCount = participantCount;
    }

    public String getAlliancePrimarySicCode() {
        return alliancePrimarySicCode;
    }

    public void setAlliancePrimarySicCode(String alliancePrimarySicCode) {
        this.alliancePrimarySicCode = alliancePrimarySicCode;
    }

    public String getAllianceAllSicCodes() {
        return allianceAllSicCodes;
    }

    public void setAllianceAllSicCodes(String allianceAllSicCodes) {
        this.allianceAllSicCodes = allianceAllSicCodes;
    }

    public String getJointVentureCusip() {
        return jointVentureCusip;
    }

    public void setJointVentureCusip(String jointVentureCusip) {
        this.jointVentureCusip = jointVentureCusip;
    }

    public String getJointVentureName() {
        return jointVentureName;
    }

    public void setJointVentureName(String jointVentureName) {
        this.jointVentureName = jointVentureName;
    }

    public String getJointVentureType() {
        return jointVentureType;
    }

    public void setJointVentureType(String jointVentureType) {
        this.jointVentureType = jointVentureType;
    }
}
