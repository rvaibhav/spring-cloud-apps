package com.vaibhavr.ucp.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	@GetMapping("/list")
	public String listPayments() {
		return "payments";
	}
	
}
