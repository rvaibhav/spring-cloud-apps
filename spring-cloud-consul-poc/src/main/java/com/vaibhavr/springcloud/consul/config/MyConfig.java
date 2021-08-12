package com.vaibhavr.springcloud.consul.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="poc")
@Data
public class MyConfig {
	
	private String username;
	private String password;
	
	public MyConfig() {
	
	}
	
}
