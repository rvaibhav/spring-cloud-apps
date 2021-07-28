package com.vaibhavr.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/shop")
	public String shop(@RequestParam Double price) {
		String response = restTemplate.getForObject("http://PAYMENT-SERVICE/list?price="+price, String.class);
		return response;
	}
	
	
	
}
