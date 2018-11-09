package com.cloudos.kafka.beans;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by iriwen on 2018/7/4.
 */
@Component
public class KafkaReceiver {


    @KafkaListener(topics = {"mytest"})
    public void listen(ConsumerRecord<?, ?> record) {

        Optional<?> kafkaMessage = Optional.ofNullable(record.value());

        if (kafkaMessage.isPresent()) {

            Object message = kafkaMessage.get();

            System.out.println("----------------- record =" + record);
            System.out.println("----------------- message =" + message);


            //log.info("----------------- record =" + record);
            //log.info("------------------ message =" + message);
        }

    }
}
