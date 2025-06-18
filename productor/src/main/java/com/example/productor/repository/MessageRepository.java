package com.example.productor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productor.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
} 