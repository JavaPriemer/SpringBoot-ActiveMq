package com.ankit.activemq.api.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class MessageSender implements CommandLineRunner {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    public void run(String... arg0) throws Exception {
        // This will put text message to queue
        this.jmsMessagingTemplate.convertAndSend(this.queue, "Hello JavaPriemer!!");
        System.out.println("Message has been put to queue by sender");
    }
}
