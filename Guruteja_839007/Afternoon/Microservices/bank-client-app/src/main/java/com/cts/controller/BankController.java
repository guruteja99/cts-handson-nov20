package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.CustomerRepository;

@RestController
@RequestMapping("/bank")
public class BankController {

	@Value("{spring.datasource.url: this is url}")
	private String msg;
	
	@Autowired
	private CustomerRepository dao;
	
	@GetMapping
	public String getMessage() {
		return msg;
	}
	
}
