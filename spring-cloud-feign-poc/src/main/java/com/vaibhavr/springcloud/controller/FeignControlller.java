package com.vaibhavr.springcloud.controller;

import com.vaibhavr.springcloud.client.UserClient;
import com.vaibhavr.springcloud.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignControlller {
	
	@Autowired
	private UserClient client;
	
	@GetMapping("/findAllUser")
	public List<UserResponse> getAllUser() {
		return client.getUsers();
	}
	
}
