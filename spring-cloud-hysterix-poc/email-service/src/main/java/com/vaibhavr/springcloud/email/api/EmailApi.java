package com.vaibhavr.springcloud.email.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailApi {
	
	@GetMapping("/send")
	public String sendEmail() {
		return "Email service called....";
	}
}
