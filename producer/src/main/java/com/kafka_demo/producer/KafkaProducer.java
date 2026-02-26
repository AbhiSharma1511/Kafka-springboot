package com.kafka_demo.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaProducer {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message){
        kafkaTemplate.send("my-topic-new", message);
        return "Message sent: "+message;
    }
    
}
