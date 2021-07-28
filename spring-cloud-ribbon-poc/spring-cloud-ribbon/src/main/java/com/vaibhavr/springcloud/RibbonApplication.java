package com.vaibhavr.springcloud;

import com.vaibhavr.springcloud.configuration.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RibbonClient(name="chatbook", configuration=RibbonConfiguration.class)
public class RibbonApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}
	
	@Bean(name="myRestTemplate")
	@LoadBalanced
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
