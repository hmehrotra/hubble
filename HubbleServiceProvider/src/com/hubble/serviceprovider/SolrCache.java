package com.hubble.serviceprovider;

import com.hubble.content.h2.beanExtensions.HubbleArchive;
import com.hubble.utilities.ObjectUtilities;
import com.hubble.utilities.StringUtilities;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haughty on 5/18/14.
 */

public class SolrCache {
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

  private SolrCache(){}
  private static SolrCache _solrCache;

  public static SolrCache getInstance(){

      /* Double checked singleton pattern */
      if (ObjectUtilities.isNull( _solrCache )){
          synchronized (SolrCache.class) {
            if (ObjectUtilities.isNull( _solrCache )){
                _solrCache = new SolrCache();
            }
          }
      }

      return _solrCache;
  }

  /**
   * Adds information about participant to solr cache
   */
  public void addParticipantToSolrCache(HubbleArchive archiveObject, String alliancePrimarySicCode, List <String> allianceAllSicCodes){
     SolrInputDocument doc = new SolrInputDocument();

     doc.setField("id", archiveObject.getArchiveDumpId().toString());
     doc.addField("participantCusip", archiveObject.getParticipantCusip());
     doc.addField("participantName", archiveObject.getParticipantName());
     doc.addField("participantBusinessDescription", archiveObject.getParticipantBusinessDescription());

     SegmentServiceProvider serviceProvider = (SegmentServiceProvider) HubbleServiceProviderRegistration.getServiceProvider("SegmentServiceProvider");

     // Market segments of ultimate parent
     doc.addField("ultimateParentPrimarySicCode", archiveObject.getUltimateParentPrimarySicCode());
     List<String> ultimateParentPrimarySegments = serviceProvider.segmentNamesForSicCode(archiveObject.getUltimateParentPrimarySicCode());
     doc.addField("ultimateParentMarketSegments", ultimateParentPrimarySegments );

     // Market segments of participant
     doc.addField("participantPrimarySicCode", archiveObject.getParticipantPrimarySicCode());
     List <String> marketSegments = serviceProvider.segmentNamesForSicCode(archiveObject.getParticipantPrimarySicCode());

     /* If not found, use market segments of ultimate parent */
     marketSegments = (!ObjectUtilities.isNull(marketSegments) && marketSegments.size() > 0) ?
                       marketSegments :
                       ultimateParentPrimarySegments;

     /* Still not found, use primary sic code of alliance to find market segments */
     marketSegments = (!ObjectUtilities.isNull(marketSegments) && marketSegments.size() > 0) ?
                      marketSegments :
                      (!StringUtilities.isNullOrEmpty(alliancePrimarySicCode)) ?
                      serviceProvider.segmentNamesForSicCode(archiveObject.getParticipantPrimarySicCode()) :
                      null;

     /* Still not found, use all sic codes of alliance to find market segments */
     marketSegments = (!ObjectUtilities.isNull(marketSegments) && marketSegments.size() > 0) ?
                      marketSegments :
                      serviceProvider.segmentNamesForSicCodes(allianceAllSicCodes);

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
         server.commit();
     }
     catch(Exception e){
        System.out.println(e.getMessage());
     }
  }

  /**
   * Adds information about participant to solr cache
   */
  public void addAllianceToSolrCache(HubbleArchive archiveObject){
      SolrInputDocument doc = new SolrInputDocument();

      doc.addField("dealNumber", archiveObject.getDealNumber());
      doc.addField("dealNumber", archiveObject.getDealNumber());
  }

   /**
    * Takes a list of processed objects corresponding to an alliance and adds it to solr core
    * @param archiveObjects
    */
  public void addObjectsToSolrCache(List <HubbleArchive> archiveObjects){

    String primarySicCodeOfAlliance = null;
    List <String> allSicCodesOfAlliance = new ArrayList<>();

    /* Find primary and all sic codes of alliance */
    for (HubbleArchive archiveObject : archiveObjects){
        if (archiveObject.getAlliancePrimarySicCode() != null){
            primarySicCodeOfAlliance = archiveObject.getAlliancePrimarySicCode();
        }
        if (archiveObject.getAllianceAllSicCodes() != null){
            allSicCodesOfAlliance.add(archiveObject.getAllianceAllSicCodes());
        }
    }

    /* Cache all the objects */
    for (HubbleArchive archiveObject : archiveObjects){
        addParticipantToSolrCache(archiveObject, primarySicCodeOfAlliance, allSicCodesOfAlliance);

        /*if (!ObjectUtilities.isNull(archiveObject.getDealNumber())){
            addAllianceToSolrCache(archiveObject);
        }*/
    }
  }

  /**
   * This method will wipe both alliance and participant cores
   */
  public static void main(String[] args){
     /* try{
          getParticipantSolrServer().deleteByQuery("*:*");
          getParticipantSolrServer().commit();

          getAllianceSolrServer().deleteByQuery("*:*");
          getAllianceSolrServer().commit();
     }
     catch(Exception e){
        System.out.println(e.getMessage());
     }*/

     System.out.print("Testing");
  }
}
