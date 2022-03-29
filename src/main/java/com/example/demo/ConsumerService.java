package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics="test", containerFactory = "listenerFactory")
    public void listener(@Payload String msg){
        System.out.print(msg);
    }
}
