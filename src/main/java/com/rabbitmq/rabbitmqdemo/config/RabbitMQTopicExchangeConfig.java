package com.rabbitmq.rabbitmqdemo.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQTopicExchangeConfig {

    private static final String TOPIC_QUEUE_1 = "topicQueue1";
    private static final String TOPIC_QUEUE_2 = "topicQueue2";
    public static final String TOPIC_EXCHANGE = "ExampleTopicExchange";
    public static final String ROUTING_KEY = "generic.sports";

    @Bean
    public Queue topicQueue(){
        return QueueBuilder.durable(TOPIC_QUEUE_1)
                .build();
    }

    @Bean
    public Queue topic2ndQueue(){
        return QueueBuilder.durable(TOPIC_QUEUE_2)
                .build();
    }

    @Bean
    public TopicExchange newExchange(){
        return ExchangeBuilder.topicExchange(TOPIC_EXCHANGE)
                .durable(true)
                .build();
    }

    @Bean
    public Binding binding(){
        return BindingBuilder.bind(topicQueue()).to(newExchange()).with(ROUTING_KEY);
    }

    @Bean
    public Binding binding2nd(){
        return BindingBuilder.bind(topic2ndQueue()).to(newExchange()).with(ROUTING_KEY);
    }
}
