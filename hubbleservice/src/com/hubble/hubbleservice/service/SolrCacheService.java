package com.hubble.hubbleservice.service;

import com.hubble.hubbleservice.model.beanExtensions.HubbleArchive;
import com.hubble.utilities.ObjectUtilities;
import com.hubble.utilities.StringUtilities;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * This class provides following methods:
 * 1) All helper methods to create Solr participant and alliance cores
 * 2) All utility methods to read from Solr cores
 *
 * @author Harshit Mehrotra
 * Date: July 19, 2014
 */

@Named
public class SolrCacheService {
	
	@Inject SegmentService segmentService;
	
    private static final String _participantSolrUrl = "http://localhost:8983/solr/participant";
    private static final String _allianceSolrUrl = "http://localhost:8983/solr/alliance";

  /**
   *  HttpSolrServer is thread-safe and if you are using the following constructor,
   *  you MUST re-use the same instance for all requests.
   *  If instances are created on the fly, it can cause a connection leak.
   **/
  private static final SolrServer _participantSolrServer = new HttpSolrServer(_participantSolrUrl);
  private static final SolrServer _allianceSolrServer = new HttpSolrServer(_allianceSolrUrl);

  /**
   * A JVM instance should reuse the solr server instance to avoid connection leak
   */
  public static SolrServer getParticipantSolrServer(){
      return _participantSolrServer;
  }

  public static SolrServer getAllianceSolrServer(){
     return _allianceSolrServer;
  }

  /********************************************************************************************
                              ALL APIS FOR CACHE CONSTRUCTION GO HERE
  ********************************************************************************************/
  /**
   * Adds information about participant to solr cache.
   * This api is a utility method for cache construction and is not visible to external client
   */
  private void addParticipantToSolrCache(HubbleArchive archiveObject, String alliancePrimarySicCode, List <String> allianceAllSicCodes){
     SolrInputDocument doc = new SolrInputDocument();

     doc.setField("id", archiveObject.getArchiveDumpId().toString());
     doc.addField("participantCusip", archiveObject.getParticipantCusip());
     doc.addField("participantName", archiveObject.getParticipantName());
     doc.addField("participantBusinessDescription", archiveObject.getParticipantBusinessDescription());

     // Market segments of ultimate parent
     doc.addField("ultimateParentPrimarySicCode", archiveObject.getUltimateParentPrimarySicCode());
     List<String> ultimateParentPrimarySegments = segmentService.segmentNamesForSicCode(archiveObject.getUltimateParentPrimarySicCode());
     doc.addField("ultimateParentMarketSegments", ultimateParentPrimarySegments );

     // Market segments of participant
     doc.addField("participantPrimarySicCode", archiveObject.getParticipantPrimarySicCode());
     List <String> marketSegments = segmentService.segmentNamesForSicCode(archiveObject.getParticipantPrimarySicCode());

     /* If not found, use market segments of ultimate parent */
     marketSegments = (!ObjectUtilities.isNull(marketSegments) && marketSegments.size() > 0) ?
                       marketSegments :
                       ultimateParentPrimarySegments;

     /* Still not found, use primary sic code of alliance to find market segments */
     marketSegments = (!ObjectUtilities.isNull(marketSegments) && marketSegments.size() > 0) ?
                      marketSegments :
                      (!StringUtilities.isNullOrEmpty(alliancePrimarySicCode)) ?
                      segmentService.segmentNamesForSicCode(archiveObject.getParticipantPrimarySicCode()) :
                      null;

     /* Still not found, use all sic codes of alliance to find market segments */
     marketSegments = (!ObjectUtilities.isNull(marketSegments) && marketSegments.size() > 0) ?
                      marketSegments :
                      segmentService.segmentNamesForSicCodes(allianceAllSicCodes);

     /* If still not found, use NA */
     if (ObjectUtilities.isNull(marketSegments) || marketSegments.size() == 0){
         marketSegments = new ArrayList<>();
         marketSegments.add("NA");
     }

     doc.addField("participantMarketSegments", marketSegments);

     doc.addField("participantStateCode", archiveObject.getParticipantStateCode());
     doc.addField("participantCity", archiveObject.getParticipantCity());
     doc.addField("participantStockExchange", archiveObject.getParticipantStockExchange());
     doc.addField("participantStockExchangeCode", archiveObject.getParticipantStockExchangeCode());
     doc.addField("participantWebsite", archiveObject.getParticipantWebsite());
     doc.addField("participantNation", archiveObject.getParticipantNation());
     doc.addField("participantNationCode", archiveObject.getParticipantNationCode());
     doc.addField("participantPublicStatus", archiveObject.getParticipantPublicStatus());
     doc.addField("participantTickerSymbol", archiveObject.getParticipantTickerSymbol());
     doc.addField("ultimateParentCusip", archiveObject.getUltimateParentCusip());
     doc.addField("ultimateParentName", archiveObject.getUltimateParentName());

     doc.addField("ultimateParentStatus", archiveObject.getUltimateParentStatus());
     doc.addField("parentCusip", archiveObject.getParentCusip());
     doc.addField("parentName", archiveObject.getParentName());

     try{
         SolrServer server = getParticipantSolrServer();
         server.add(doc);
     }
     catch(Exception e){
        System.out.println(e.getMessage());
     }
  }

  /**
   * Adds information about participant to solr cache
   * This api is a utility method for cache construction and should not be visible to external clients
   */
  private void addAllianceToSolrCache(HubbleArchive archiveObject, List<String> allSicCodes, List<String> participantName, List<String> participantCusip, List<Float> participantOwnership){
      SolrInputDocument doc = new SolrInputDocument();

      doc.setField("id", archiveObject.getArchiveDumpId().toString());
      doc.addField("dealNumber", archiveObject.getDealNumber());
      doc.addField("dateAllianceTerminated", archiveObject.getDateAllianceTerminated());
      doc.addField("dateExpired", archiveObject.getDateExpired());
      doc.addField("dateEffective", archiveObject.getDateEffective());
      doc.addField("dateAnnounced", archiveObject.getDateAnnounced());
      doc.addField("status", archiveObject.getStatus());
      doc.addField("dealText", archiveObject.getDealText());

      doc.addField("participantName", participantName);
      doc.addField("participantCusip", participantCusip);
      doc.addField("participantOwnership", participantOwnership);

      doc.addField("isJointVenture", archiveObject.getIsJointVenture());
      doc.addField("isExclusiveLicensingAgreement", archiveObject.getIsExclusiveLicensingAgreement());
      doc.addField("isExplorationAgreement", archiveObject.getIsExplorationAgreement());
      doc.addField("isFundingAgreement", archiveObject.getIsFundingAgreement());
      doc.addField("isLicensingAgreement", archiveObject.getIsLicensingAgreement());
      doc.addField("isMarketingAgreement", archiveObject.getIsMarketingAgreement());
      doc.addField("isManufacturingAgreement", archiveObject.getIsManufacturingAgreement());
      doc.addField("isRAndDAgreement", archiveObject.getIsRAndDAgreement());
      doc.addField("isStrategicAgreement", archiveObject.getIsStrategicAgreement());
      doc.addField("isSupplyAgreement", archiveObject.getIsSupplyAgreement());

      doc.addField("allianceNation", archiveObject.getAllianceNation());
      doc.addField("participantCount", archiveObject.getParticipantCount());
      doc.addField("alliancePrimarySicCode", archiveObject.getAlliancePrimarySicCode());
      doc.addField("allianceAllSicCodes", allSicCodes);

      if ( !ObjectUtilities.isNull(archiveObject.getAlliancePrimarySicCode())){
          allSicCodes.add(archiveObject.getAlliancePrimarySicCode());
      }
      doc.addField("allianceMarketSegments", segmentService.segmentNamesForSicCodes(allSicCodes));

      doc.addField("jointVentureCusip", archiveObject.getIsJointVenture());
      doc.addField("jointVentureName", archiveObject.getJointVentureName());
      doc.addField("jointVentureType", archiveObject.getJointVentureType());

      try{
          SolrServer server = getAllianceSolrServer();
          server.add(doc);
      }
      catch(Exception e){
          System.out.println(e.getMessage());
      }
  }

   /**
    * Takes a list of processed objects corresponding to an alliance and adds it to solr core
    * @param archiveObjects
    */
  private void addObjectsToSolrCache(List <HubbleArchive> archiveObjects){

    String primarySicCodeOfAlliance = null;
    List <String> allSicCodesOfAlliance = new ArrayList<>();

    List <String> participantName = new ArrayList<>();
    List <String> participantCusip = new ArrayList<>();
    List <Float> participantOwnership = new ArrayList<>();

    /* Find primary and all sic codes of alliance */
    for (HubbleArchive archiveObject : archiveObjects){
        if (archiveObject.getAlliancePrimarySicCode() != null){
            primarySicCodeOfAlliance = archiveObject.getAlliancePrimarySicCode();
        }
        if (archiveObject.getAllianceAllSicCodes() != null){
            allSicCodesOfAlliance.add(archiveObject.getAllianceAllSicCodes());
        }

        // Add participant names for this alliance
        if ( !ObjectUtilities.isNull(archiveObject.getParticipantName()) ){
            participantName.add(archiveObject.getParticipantName());
        }
        else{
            participantName.add("NA");
        }

        // Add participant cusips for this alliance
        if ( !ObjectUtilities.isNull(archiveObject.getParticipantCusip()) ){
            participantCusip.add(archiveObject.getParticipantCusip());
        }
        else{
            participantCusip.add("NA");
        }

        // Add participant ownership for this alliance
        if ( !ObjectUtilities.isNull(archiveObject.getParticipantOwnerShip()) ){
            participantOwnership.add(archiveObject.getParticipantOwnerShip());
        }
        else{
            participantOwnership.add(0.0f);
        }
    }

    /* Cache all the objects */
    for (HubbleArchive archiveObject : archiveObjects){
        addParticipantToSolrCache(archiveObject, primarySicCodeOfAlliance, allSicCodesOfAlliance);

        if (!ObjectUtilities.isNull(archiveObject.getDealNumber())){
            addAllianceToSolrCache(archiveObject, allSicCodesOfAlliance, participantName, participantCusip, participantOwnership);
        }
    }

    try {
        /* Hard commit once per alliance */
        //getParticipantSolrServer().commit();
        //getAllianceSolrServer().commit();
    }
    catch (Exception e){
        System.out.println(e.getMessage());
    }
  }

   public void addObjectsToCache(List <HubbleArchive> archiveObjects){
        addObjectsToSolrCache(archiveObjects);
   }

   /********************************************************************************************
                            ALL EXTERNAL APIS FOR CLIENT GO HERE
   ********************************************************************************************/

  /**
   * This method will wipe both alliance and participant cores
   */
  public static void main(String[] args){
     try{
          //getParticipantSolrServer().deleteByQuery("*:*");
          getParticipantSolrServer().commit();

          //getAllianceSolrServer().deleteByQuery("*:*");
          getAllianceSolrServer().commit();

     }
     catch(Exception e){
        System.out.println(e.getMessage());
     }

     System.out.print("Testing");
  }
}
