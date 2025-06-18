package com.example.consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.example.consumer.config.RabbitMQConfig;
import com.example.consumer.model.Message;

@Service
public class MessageConsumer {

    private final MessagePersistenceService messagePersistenceService;

    public MessageConsumer(MessagePersistenceService messagePersistenceService) {
        this.messagePersistenceService = messagePersistenceService;
    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void receiveMessage(String message) {
        System.out.println("Mensaje recibido: " + message);
        Message savedMessage = messagePersistenceService.saveMessage(message);
        System.out.println("Mensaje guardado: " + savedMessage);
    }
}