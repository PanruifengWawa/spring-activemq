package com.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.activemq.message.Producer;

@Controller
@RequestMapping(value="api")
public class TestController {
	@Autowired
	Producer producer;
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	@ResponseBody
	public String testJMS(
			@RequestParam(name="message") String message ) {
		producer.send(message);
		return "success";
		
	}

}
