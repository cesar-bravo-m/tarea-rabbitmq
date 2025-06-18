package com.example.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.consumer.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
} 