package com.hubble.serviceprovider;

import com.hubble.content.h2.beanExtensions.HubbleArchive;
import com.hubble.utilities.ObjectUtilities;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;

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
  public void addParticipantToSolrCache(HubbleArchive archiveObject){
     SolrInputDocument doc = new SolrInputDocument();

     doc.setField("id", archiveObject.getArchiveDumpId().toString());
     doc.addField("participantCusip", archiveObject.getParticipantCusip());
     doc.addField("participantName", archiveObject.getParticipantName());
     doc.addField("participantBusinessDescription", archiveObject.getParticipantBusinessDescription());
     doc.addField("participantPrimarySicCode", archiveObject.getParticipantPrimarySicCode());

     SegmentServiceProvider serviceProvider = (SegmentServiceProvider) HubbleServiceProviderRegistration.getServiceProvider("SegmentServiceProvider");
     doc.addField("participantMarketSegments", serviceProvider.segmentNamesForSicCode(archiveObject.getParticipantPrimarySicCode()));

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
     doc.addField("ultimateParentPrimarySicCode", archiveObject.getUltimateParentPrimarySicCode());
     doc.addField("ultimateParentMarketSegments", serviceProvider.segmentNamesForSicCode(archiveObject.getUltimateParentPrimarySicCode()));
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

  public void addObjectToSolrCache(HubbleArchive archiveObject){
    addParticipantToSolrCache(archiveObject);

    /* if (!ObjectUtilities.isNull(archiveObject.getDealNumber())){
        addAllianceToSolrCache(archiveObject);
    }*/
  }

  /**
   * This method will wipe both alliance and participant cores
   */
  public static void main(String[] args){
     /* try{
          getParticipantSolrServer().deleteByQuery("*:*");
          getAllianceSolrServer().deleteByQuery("*:*");
     }
     catch(Exception e){
        System.out.println(e.getMessage());
     }*/

     System.out.print("Testing");
  }
}
