package com.test.parent_consumer.engine;

import com.test.parent_consumer.repo.ParentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ParentConsumer {

    private final Logger logger = LoggerFactory.getLogger(ParentConsumer.class);

    @Autowired
    private ParentRepo parentRepo;


    @KafkaListener(topics = "axem2bct-default", groupId = "group_id")
    public void consume(String message) {
        logger.info(String.format("#### -> Consumed message -> %s", message));
        System.out.println(message);
        //save message to database
//        Parent parent = new Gson().fromJson(message, Parent.class);

//        parentRepo.save(parent);


    }
}
