package com.vaibhavr.ucp.payment.controller;
		
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
		import org.springframework.web.bind.annotation.RequestParam;
		import org.springframework.web.bind.annotation.RestController;
		
		import java.util.Date;

@RestController
public class PaymentController {
	
	@Value("${server.port}")
	private String serverPort;
	
	@GetMapping("/list")
	public String listPayments(@RequestParam Double price) {
		System.out.println("Hitting the Payment Service via Shopping Service at " + new Date());
		return new StringBuilder("Price is ").append(price).append(" on port ").append(serverPort).toString();
	}
	
}
