package com.rabbitmq.rabbitmqdemo.sender;

import com.rabbitmq.rabbitmqdemo.config.RabbitMQTopicExchangeConfig;
import com.rabbitmq.rabbitmqdemo.message.SimpleMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;

@Component
public class RabbitMQMessageSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Scheduled(fixedDelay = 5000L)
    public void send(){
        SimpleMessage simpleMessage = new SimpleMessage("testSportsMessage","This is a test sports message!",new Timestamp(new Date().getTime()));
		//rabbitTemplate.convertAndSend("","MyQueue",simpleMessage);
        rabbitTemplate.convertAndSend(RabbitMQTopicExchangeConfig.TOPIC_EXCHANGE,RabbitMQTopicExchangeConfig.ROUTING_KEY,simpleMessage);
    }
}
