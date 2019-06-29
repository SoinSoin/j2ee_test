package com.api.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		// SpringApplication.build(BackendApplication.class, args);
		SpringApplication.run(BackendApplication.class, args);
	}
}