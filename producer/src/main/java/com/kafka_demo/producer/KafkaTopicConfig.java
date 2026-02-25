package com.kafka_demo.producer;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class KafkaTopicConfig {

    @Bean
    public NewTopic myTopic(){
        return new  NewTopic("my-topic-new1", 3,  (short) 1);
    }
}
