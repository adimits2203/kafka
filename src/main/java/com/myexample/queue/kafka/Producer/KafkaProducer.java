package com.myexample.queue.kafka.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducer
{
    @Autowired
    private  KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topic, String msg){
        kafkaTemplate.send(topic, msg);
    }



}
