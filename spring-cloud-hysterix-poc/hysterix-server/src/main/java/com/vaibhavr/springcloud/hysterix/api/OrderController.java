package com.vaibhavr.springcloud.hysterix.api;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
	
	private final static Logger log = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "shopFallBack")
	@GetMapping("/shop")
	public String shop() {
		String payResponse = restTemplate.getForObject("http://localhost:8282/payment/pay", String.class);
		String emailResponse = restTemplate.getForObject("http://localhost:8181/email/send", String.class);
		return payResponse + "\n" + emailResponse;
	}
	
	@GetMapping("/shopWitoutHystrix")
	public String bookShowWitoutHystrix() {
		String payResponse = restTemplate.getForObject("http://localhost:8282/payment/pay", String.class);
		String emailResponse = restTemplate.getForObject("http://localhost:8181/email/send", String.class);
		return payResponse + "\n" + emailResponse;
	}
	
	public String shopFallBack(Throwable e) {
		log.info("Exeption is " + e.getMessage());
		e.printStackTrace();
		return "Something bad happened!";
	}
	
}
