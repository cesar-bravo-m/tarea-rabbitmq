package com.example.productor.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String QUEUE_NAME = "cola_de_prueba";

    @Bean
    public Queue queue() {
        return QueueBuilder.durable(QUEUE_NAME)
                .build();
    }
} 