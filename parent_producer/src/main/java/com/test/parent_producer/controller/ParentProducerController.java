package com.test.parent_producer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/parents")
public class ParentProducerController {
    private static final Logger logger = LoggerFactory.getLogger(ParentProducerController.class);
    private static final String TOPIC = "axem2bct-default";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping(value = "")
    public void sendMessageToTopic(@RequestParam("message") String message) {
        logger.info(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send(TOPIC, message);
    }
}
