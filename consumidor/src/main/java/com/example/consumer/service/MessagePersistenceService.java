package com.example.consumer.service;

import org.springframework.stereotype.Service;
import com.example.consumer.model.Message;
import com.example.consumer.repository.MessageRepository;

@Service
public class MessagePersistenceService {

    private final MessageRepository messageRepository;

    public MessagePersistenceService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message saveMessage(String content) {
        Message message = new Message(content);
        return messageRepository.save(message);
    }
} 