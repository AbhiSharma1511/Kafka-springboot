package com.kafka_demo.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic-new", groupId = "my-new-group")
    public void listen(String message){
        System.out.println("Message received 1: "+message);
    }

//    @KafkaListener(topics = "my-topic", groupId = "my-new-group")
//    public void listen1(String message){
//        System.out.println("Message received 2: "+message);
//    }

}
