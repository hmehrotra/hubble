package com.hubble.rabbitmq.consumer;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.hubble.hubbleservice.model.beanExtensions.ArchiveDump;
import com.hubble.hubbleservice.model.beanExtensions.ArchiveDumpProcessor;
import com.hubble.hubbleservice.model.beanExtensions.HubbleArchive;
import com.hubble.hubbleservice.service.RawDatabaseService;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Consumer of the raw database dump. The consumer reads messages containing alliance information from the producer,
 * process the records and insert processed records into the database
 *
 * @author Harshit Mehrotra
 * Date Feb 7, 2014
 */
public class RawDumpConsumer {
    private final static String QUEUE_NAME = "RawDumpQueue";
    private static int messagesReceived =  0;
    private static final boolean autoAck = false;

    /* Do not send messages to a consumer who has 5 unacknowledged messages  */
    private static final int prefetchCount = 5;

    public static void main(String[] argv)throws java.io.IOException,java.lang.InterruptedException {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.basicQos(prefetchCount);

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        QueueingConsumer consumer = new QueueingConsumer(channel);
        channel.basicConsume(QUEUE_NAME, autoAck, consumer);

        while (true) {
            QueueingConsumer.Delivery delivery = consumer.nextDelivery();
            String message = new String(delivery.getBody());
            System.out.println(" [x] Message '" + ++messagesReceived + " : " + message + "'");

            RawDumpProcessorDelegate processorDelegate = new RawDumpProcessorDelegate(message);
            processorDelegate.processRawDumpObjects();

            channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
        }
    }
}

/**
 * This class takes in a message from {@link RawDumpConsumer} and extracts list of {@link com.hubble.content.h2.beanExtensions.ArchiveDump}
 * objects from it, processes the objects and persists processed objects into database
 */
class RawDumpProcessorDelegate {
    String rawData;

    public RawDumpProcessorDelegate(String rawData){
        this.rawData = rawData;
    }

    public void processRawDumpObjects(){
        Gson gson = new Gson();

        JsonParser parser = new JsonParser();
        JsonArray jsonArray = parser.parse(rawData).getAsJsonArray();

        List <ArchiveDump> dumpObjects = new ArrayList<ArchiveDump>();
        for (JsonElement json : jsonArray){
            ArchiveDump dumpObject = gson.fromJson(json, ArchiveDump.class);
            dumpObjects.add(dumpObject);

        }
        HubbleArchive archive;
        List <HubbleArchive> processedObjects = new ArrayList <HubbleArchive> ();

        for (ArchiveDump archiveDump : dumpObjects){
            Field[] fields = archiveDump.getClass().getSuperclass().getDeclaredFields();
            archive = new HubbleArchive();

            for (Field field : fields){
                try{
                    PropertyUtils.setProperty(archive, field.getName(), ArchiveDumpProcessor.valueOf(field.getName()).processObject(BeanUtils.getProperty(archiveDump, field.getName())));
                }
                catch(Exception e){
                    System.out.println("Exception occurred in accessing field " + field.getName() + " for ArchiveDump object :" + archiveDump.getArchiveDumpId());
                }
            }
            processedObjects.add(archive);
        }

        /* Persist processed objects into database */
        rawDatabaseservice().saveHubbleArchiveProcessedObjects(processedObjects);
    }
    
    private RawDatabaseService _rawDatabaseService;
    private RawDatabaseService rawDatabaseservice(){
    	if (_rawDatabaseService == null){
    		_rawDatabaseService = new RawDatabaseService();
    	}
    	return _rawDatabaseService;
    }
}
