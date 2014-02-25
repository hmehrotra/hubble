package com.hubble.rabbitmq.consumer;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hubble.content.h2.beanExtensions.ArchiveDump;
import com.hubble.content.h2.beanExtensions.ArchiveDumpProcessor;
import com.hubble.content.h2.beanExtensions.HubbleArchive;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;
import org.jboss.cache.util.BeanUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
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
        Type archiveDumpListType = new TypeToken<ArchiveDump>() {}.getType();
        List<ArchiveDump> dumpObjects = gson.fromJson(rawData, archiveDumpListType);
        HubbleArchive archive;

        for (ArchiveDump archiveDump : dumpObjects){
            Field[] fields = archiveDump.getClass().getFields();
            archive = new HubbleArchive();

            for (Field field : fields){
                // BeanUtils.setProperty(archive, field.toString(), ArchiveDumpProcessor.valueOf(field.toString()).processObject(BeanUtils.getProperty(archiveDump, field.toString())));
            }
        }
    }
}
