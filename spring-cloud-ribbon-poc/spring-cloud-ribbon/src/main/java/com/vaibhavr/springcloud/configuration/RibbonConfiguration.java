package com.vaibhavr.springcloud.configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class RibbonConfiguration {
	
	@Autowired
	IClientConfig ribbonClientConfig;
	
	@Bean
	public IPing ribbonPing(IClientConfig config) {
		return new PingUrl(false, "/actuator/health");
	}
	
	@Bean
	public IRule ribbonRule(IClientConfig config) {
		return new AvailabilityFilteringRule();
	}
	
}
