package com.jiuxin.activemq.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ConfigBean {
    @Value("${myTopic}")
    private String topicName;

    @Bean
    public ActiveMQTopic topic(){
        return new ActiveMQTopic(topicName);
    }
}
