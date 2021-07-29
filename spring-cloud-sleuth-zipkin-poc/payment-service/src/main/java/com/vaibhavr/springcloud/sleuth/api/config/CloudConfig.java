package com.vaibhavr.springcloud.sleuth.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CloudConfig {
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
