package com.hubble.rabbitmq.producer;

import com.google.gson.Gson;
import com.hubble.utilities.ArrayUtilities;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.hubble.serviceprovider.HubbleServiceProvider;
import com.hubble.content.h2.beanExtensions.ArchiveDump;
import com.hubble.utilities.StringUtilities;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Producer of raw database dump messages. The producer calls {@link HubbleServiceProvider}
 * to fetch a list of archive dump objects and sends them as message to consumers
 */
public class RawDumpProducer {
    private final static String QUEUE_NAME = "RawDumpQueue";

    private static Channel _channel;
    private static int sentMessageCount = 0;
    private static List <ArchiveDump> _beanHolderList;

    public void flushCaches(){
        _beanHolderList = null;
    }

    public void initializeCache(){
        _beanHolderList = new ArrayList <ArchiveDump> ();
    }

    /**
     * Sends message to consumer and returns the status of message send
     * @return
     */
    public boolean processAndSendMessage() throws java.io.IOException{
        String message = "Hello World!";
        if (!ArrayUtilities.isNullOrEmpty(_beanHolderList)){
            _channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            Gson gson = new Gson();
            message = gson.toJson(_beanHolderList.get(0));
            System.out.println(" [x] Sent '" + message + "'");
        }
        return true;
    }

    public static void main(String[] argv) {
        RawDumpProducer producer = new RawDumpProducer();

        List <ArchiveDump> archiveDumpList = HubbleServiceProvider.getInstance().fetchArchiveDump();
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");

        try {
            Connection connection = factory.newConnection();
            _channel = connection.createChannel();
            _channel.queueDeclare(QUEUE_NAME, false, false, false, null);

            for (ArchiveDump record : archiveDumpList){
                if (!StringUtilities.isNull(record.getDealNumber())){
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
}

