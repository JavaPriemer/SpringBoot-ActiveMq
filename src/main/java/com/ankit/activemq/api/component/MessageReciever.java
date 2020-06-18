package com.ankit.activemq.api.component;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReciever {
    //@JMSListner:This Annotation is actually used to mark a method to be the target of a JMS message listener on the specified destination().
    @JmsListener(destination = "javapriemerankit.queue")
    public void receiveQueue(String text) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Message Received: "+text);
    }
}
