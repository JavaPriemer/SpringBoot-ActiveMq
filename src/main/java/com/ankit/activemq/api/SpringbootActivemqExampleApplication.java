package com.ankit.activemq.api;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

@SpringBootApplication
@EnableJms
public class SpringbootActivemqExampleApplication {
    //@EnableJMS annotation is used to trigger search for method annotated with @JMSListener,
    // hence to create JMS listener in the background.
    public static void main(String[] args) {
        SpringApplication.run(SpringbootActivemqExampleApplication.class, args);
    }
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("javapriemerankit.queue");
    }
}
