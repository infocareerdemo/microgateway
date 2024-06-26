package com.example.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

	@Bean
//	@LoadBalanced //If loadbalanced annotation is used, then you won't be able to call Api using localhost
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
