package com.annotationBasedApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com")
@PropertySource(value = "classpath:application.properties")
public class Configurations {
	@Bean("department")
	public Department getDepartment() {
		return new Department();
	}

}
