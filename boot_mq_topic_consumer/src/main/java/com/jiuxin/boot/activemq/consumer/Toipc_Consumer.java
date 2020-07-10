package com.jiuxin.boot.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class Toipc_Consumer {
    @JmsListener(destination = "${myTopic}")
    public void receive(TextMessage textMessage) throws JMSException {  //Java消息服务异常
        System.out.println("-----------消费者受到丁页主题-"+ textMessage.getText());
    }
}
