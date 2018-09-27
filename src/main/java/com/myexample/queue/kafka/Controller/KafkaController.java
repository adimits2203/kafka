package com.myexample.queue.kafka.Controller;


import com.myexample.queue.kafka.Producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController
{

    @Autowired
    private KafkaProducer producer;

    @GetMapping("/test/{msg}")
    public void getTest(@PathVariable String msg){
        producer.sendMessage("test",msg);
    }


}
