package com.rabbitmq.rabbitmqdemo.listener;


import com.rabbitmq.rabbitmqdemo.message.SimpleMessage;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQListener {

    private static final String MY_QUEUE = "MyQueue";

    @RabbitListener(queues = {MY_QUEUE})
    public void receiveMessage(final SimpleMessage simpleMessage){
        System.out.println("simpleMessage1>>= " + simpleMessage.toString());
    }

    @RabbitListener(queues = {MY_QUEUE})
    public void receiveMessage(final Message message){
        System.out.println("simpleMessage2>>= " + message);
    }
}
