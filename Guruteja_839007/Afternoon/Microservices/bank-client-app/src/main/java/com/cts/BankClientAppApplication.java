package com.cts;


import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BankClientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankClientAppApplication.class, args);
	}

}
