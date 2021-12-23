package com.test.child_consumer.engine;

import com.test.child_consumer.repo.ChildRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ChildConsumer {

    private final Logger logger = LoggerFactory.getLogger(ChildConsumer.class);

    @Autowired
    private ChildRepo childRepo;


    @KafkaListener(topics = "axem2bct-children", groupId = "group_id")
    public void consume(String message) {
        logger.info(String.format("#### -> Consumed message -> %s", message));

        //save message to database
//        Child child = new Gson().fromJson(message, Child.class);

//        childRepo.save(child);


    }
}
