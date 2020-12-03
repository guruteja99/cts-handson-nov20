package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AccountMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMicroServiceApplication.class, args);
	}

}
