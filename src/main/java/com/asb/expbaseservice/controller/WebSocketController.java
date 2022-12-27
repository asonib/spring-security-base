package com.asb.expbaseservice.controller;

import com.asb.expbaseservice.constants.TextConstants;
import com.asb.expbaseservice.model.LogModel;
import com.asb.expbaseservice.model.dto.TextMessageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@Slf4j
public class WebSocketController {

    @Autowired
    SimpMessagingTemplate template;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/send")
    @Scheduled(fixedDelay = 5000)
    public void sendMessage() {
        ResponseEntity<List<LogModel>> logModelList = null;
        try{
            logModelList = restTemplate.exchange("http://localhost:8082/api/v1/logs",
                    HttpMethod.GET, null,new ParameterizedTypeReference<List<LogModel>>() {});
            log.info("WS :: sendMessage call for LOGS :: SUCCESS");
            Collections.reverse(logModelList.getBody());
            template.convertAndSend("/topic/message", logModelList.getBody());
        }catch (Exception ex){
            log.info("WS :: sendMessage call for LOGS :: FAILED");
        }
    }

    @MessageMapping("/sendMessage")
    public void receiveMessage(@Payload TextMessageDTO textMessageDTO) {
        // receive message from client
    }


    @SendTo("/topic/message")
    public TextMessageDTO broadcastMessage(@Payload TextMessageDTO textMessageDTO) {
        return textMessageDTO;
    }
}