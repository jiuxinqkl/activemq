package com.jiuxin.activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.messaging.core.MessagePostProcessor;
import org.springframework.stereotype.Component;

import javax.jms.Destination;
import java.util.Queue;
import java.util.UUID;

@Component
public class Queue_Produce {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue queue;

    void produceMsg(){
        jmsMessagingTemplate.convertAndSend((Destination) queue,"--------"+UUID.randomUUID().toString().substring(0,6));
    }
}
