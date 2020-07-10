package com.jiuxin.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;


@Component
public class Queue_Consumer {
    @JmsListener(destination = "${myqueue}")
    public void receive(TextMessage TextMessage) throws JMSException {

        System.out.println("*******消費者收到消息********" +TextMessage.getText());
    }
}
