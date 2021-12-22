//package com.test.parent_producer.engine;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ParentConsumer {
//
//    private final Logger logger = LoggerFactory.getLogger(ParentConsumer.class);
//
//
//    @KafkaListener(topics = "parents", groupId = "group_id")
//    public void consume(String message) {
//        logger.info(String.format("#### -> Consumed message -> %s", message));
//        System.out.println(message);
//        //save message to database
////        Parent parent = new Gson().fromJson(message, Parent.class);
//
////        parentRepo.save(parent);
//
//
//    }
//}
