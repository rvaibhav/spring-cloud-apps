package com.vaibhavr.springcloud.consul;

import com.vaibhavr.springcloud.consul.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = MyConfig.class)
public class ConsulApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConsulApplication.class, args);
	}
}
