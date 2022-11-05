package com.asb.expbaseservice.utils;

import com.asb.expbaseservice.constants.TextConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class KafkaProducerUtil {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public void sendStringMessage(String evt) {
        log.info(evt);
        kafkaTemplate.send(TextConstants.KAFKA_TOPIC_LOGS, evt);
    }

}
