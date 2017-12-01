package com.activemq.message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@JmsListener(destination="foo.bar")  
	public void receiveQueue(String message){  
		System.out.println(message);  
	} 
	
	

}
