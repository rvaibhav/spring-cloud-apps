package com.vaibhavr.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class InvokeController {
	
	@Autowired
	@Qualifier(value="myRestTemplate")
	private RestTemplate restTemplate;
	
	@GetMapping("/invoke")
	public String invokeCharbook() {
		return restTemplate.getForObject("http://chatbook/chatbook-application/chat" , String.class);
	}
}
