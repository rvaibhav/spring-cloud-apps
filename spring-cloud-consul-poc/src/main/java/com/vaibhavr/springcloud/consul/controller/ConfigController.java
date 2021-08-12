package com.vaibhavr.springcloud.consul.controller;

import com.vaibhavr.springcloud.consul.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	@Autowired
	private MyConfig config;
	
	
	
	@GetMapping("/config")
	public MyConfig getConfiguration() {
		return config;
	}
	
}
