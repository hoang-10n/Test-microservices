package com.test.child_producer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/children")
public class ChildProducerController {
    private static final Logger logger = LoggerFactory.getLogger(ChildProducerController.class);
    private static final String TOPIC = "children";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping(value = "")
    public void sendMessageToTopic(@RequestParam("message") String message) {
        logger.info(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send(TOPIC, message);
    }
}
