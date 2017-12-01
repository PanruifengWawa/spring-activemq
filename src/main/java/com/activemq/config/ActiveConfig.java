package com.activemq.config;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActiveConfig {
	@Bean  
	public Queue queue(){  
		return new ActiveMQQueue("foo.bar");  
	}  

}
