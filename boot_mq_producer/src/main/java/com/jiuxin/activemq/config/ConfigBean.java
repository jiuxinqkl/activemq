package com.jiuxin.activemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import java.util.Queue;


@Component
@EnableJms
public class ConfigBean {

    @Value("${myqueue}")
   private String myQueue;

    @Bean
    public Queue queue(){
        return (Queue) new ActiveMQQueue(myQueue);
    }
}
