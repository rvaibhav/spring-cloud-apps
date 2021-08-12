package com.vaibhavr.springcloud.payment.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentApi {
	
	@GetMapping("/pay")
	public String paymentProcess() {
		return "Payment service called....";
	}
	
}
