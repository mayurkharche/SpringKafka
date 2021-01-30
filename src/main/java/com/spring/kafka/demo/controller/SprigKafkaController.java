package com.spring.kafka.demo.controller;

import com.spring.kafka.demo.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/kafka")
public class SprigKafkaController {

    @Autowired
    private Producer producer;

    @GetMapping("/produce-msg/{msg}")
    public String produceMsg(@PathVariable String msg){

        //Create Topic code here
        producer.sendMessage(msg);
        return "Message Sent";
    }
}
