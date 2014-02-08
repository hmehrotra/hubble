package com.hubble.rabbitmq.producer;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.hubble.serviceprovider.HubbleServiceProvider;
import com.hubble.content.h2.beanExtensions.ArchiveDump;
import java.util.List;

/**
 * Producer of raw database dump messages. The producer calls {@link HubbleServiceProvider}
 * to fetch a list of archive dump objects and sends them as message to consumers
 */
public class RawDumpProducer {
    private final static String QUEUE_NAME = "RawDumpQueue";

    public static void main(String[] argv) throws java.io.IOException {

        List <ArchiveDump> archiveDumpList = HubbleServiceProvider.getInstance().fetchArchiveDump();
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        String message = "Hello World!";
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        System.out.println(" [x] Sent '" + message + "'");

        channel.close();
        connection.close();
    }
}

