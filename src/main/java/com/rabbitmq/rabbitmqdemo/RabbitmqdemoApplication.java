package com.rabbitmq.rabbitmqdemo;

import com.rabbitmq.rabbitmqdemo.message.SimpleMessage;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.sql.Timestamp;
import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class RabbitmqdemoApplication {

//	@Autowired
//	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqdemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
////		rabbitTemplate.convertAndSend("TestExchange","","Hello from our first message");
////		rabbitTemplate.convertAndSend("TestExchange","news.sport","Hello from our first sports message");
////		rabbitTemplate.convertAndSend("TopicExchange","topic.name.b","Hello from topic exchange!");
//
//		SimpleMessage simpleMessage = new SimpleMessage("testSimpleMessage","This is a test simple message!",new Timestamp(new Date().getTime()));
//		rabbitTemplate.convertAndSend("TestExchange","",simpleMessage);
//	}
}
