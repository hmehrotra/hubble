package com.hubble.rabbitmq.producer;

import com.google.gson.Gson;
import com.hubble.hubbleservice.model.beanExtensions.HubbleArchive;
import com.hubble.hubbleservice.service.RawDatabaseService;
import com.hubble.utilities.ArrayUtilities;
import com.hubble.utilities.StringUtilities;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Producer of processed hubble archive messages. The producer calls {@link HubbleServiceProvider}
 * to fetch a list of processed hubble archive objects and sends them as message to consumers
 * @author Harshit Mehrotra
 * Date May 17, 2014
 */
public class ProcessedHubbleArchiveProducer {
    private final static String QUEUE_NAME = "ProcessedHubbleArchiveQueue";

    private static Channel _channel;
    private static int sentMessageCount = 0;
    private static List<HubbleArchive> _beanHolderList;

    public void flushCaches(){
        _beanHolderList = null;
    }

    public void initializeCache(){
        _beanHolderList = new ArrayList<HubbleArchive>();
    }

    /**
     * Sends message to consumer and returns the status of message send
     * @return
     */
    public boolean processAndSendMessage() throws java.io.IOException{
        StringBuilder message = new StringBuilder("[");

        if (!ArrayUtilities.isNullOrEmpty(_beanHolderList)){
            Gson gson = new Gson();

            for (int index = 0; index < _beanHolderList.size(); index++){
                /* Only include record which have non null participant names */
                /* Overflowing columns - ParticipantSicCodes and AllianceAllSicCodes */
                if (!StringUtilities.isNullOrEmpty(_beanHolderList.get(index).getParticipantName()))
                    message.append(gson.toJson(_beanHolderList.get(index))).append(",");
            }

            /* Substitute last ' with closing array */
            message.setCharAt(message.length() - 1, ']');
            _channel.basicPublish("", QUEUE_NAME, null, message.toString().getBytes());
            System.out.println(" [x] Sent '" + message + "'");
        }

        return true;
    }

    public static void main(String args[]){
        ProcessedHubbleArchiveProducer producer = new ProcessedHubbleArchiveProducer();
        
        List <HubbleArchive> hubbleArchiveList = rawDatabaseService().fetchHubbleArchive();
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");

        try{
            Connection connection = factory.newConnection();
            _channel = connection.createChannel();
            _channel.queueDeclare(QUEUE_NAME, false, false, false, null);

            for (HubbleArchive record : hubbleArchiveList){
                if (record.getDealNumber() != null){
                    /* Process and send the message to consumer */
                    producer.processAndSendMessage();
                    sentMessageCount++;
                    producer.flushCaches();
                    producer.initializeCache();
                }
                _beanHolderList.add(record);
            }

            /* Process the last alliance */
            producer.processAndSendMessage();
            producer.flushCaches();

            _channel.close();
            connection.close();
            System.out.println("Total messages sent : " + sentMessageCount);
        }
        catch(IOException e){
            System.out.println("Sending message failed" + e);
        }
    }
    
    private static RawDatabaseService _rawDatabaseService;
    private static RawDatabaseService rawDatabaseService(){
    	if (_rawDatabaseService == null){
    		_rawDatabaseService = new RawDatabaseService();
    	}
    	return _rawDatabaseService;
    }
}
