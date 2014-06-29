package com.hubble.rabbitmq.consumer;

import com.google.gson.*;
import com.hubble.content.h2.beanExtensions.HubbleArchive;
import com.hubble.serviceprovider.SolrCache;
import com.hubble.utilities.DateTypeAdapter;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;

import java.util.Date;

/**
 * Consumer of the processed hubble archive. The consumer reads messages containing alliance information from the producer,
 * process the records and insert processed records into the database
 *
 * @author Harshit Mehrotra
 * Date May 17, 2014
 */
public class ProcessedHubbleArchiveConsumer {
    private final static String QUEUE_NAME = "ProcessedHubbleArchiveQueue";
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

            ProcessedHubleArchiveConsumerDelegate delegate = new ProcessedHubleArchiveConsumerDelegate(message);
            delegate.extractHubbleArchiveObjects();

            channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
        }
    }
}

/**
 * This method extracts each object of {@link HubbleArchive} from the list of objects forming an alliance
 * and adds each object to SolrCache
 */
class ProcessedHubleArchiveConsumerDelegate{

    String data;
    ProcessedHubleArchiveConsumerDelegate(String data){
         this.data = data;
    }

    public void extractHubbleArchiveObjects(){
        Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateTypeAdapter()).create();

        JsonParser parser = new JsonParser();
        JsonArray jsonArray = parser.parse(data).getAsJsonArray();

        for (JsonElement json : jsonArray){
            HubbleArchive archiveObject = gson.fromJson(json, HubbleArchive.class);
            SolrCache.getInstance().addObjectToSolrCache(archiveObject);
        }
    }
}
