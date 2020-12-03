package com.example.mysecondtrainingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.EmbeddedDataSourceConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@SpringBootApplication(exclude = {WebMvcAutoConfiguration.class})
public class MySecondTrainingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySecondTrainingAppApplication.class, args);
	}

}
