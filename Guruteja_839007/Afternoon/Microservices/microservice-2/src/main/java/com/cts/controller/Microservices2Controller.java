package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.service.Microservice2Service;

@RestController
@RequestMapping("/m2")
public class Microservices2Controller {

	@Autowired
	Microservice2Service service;
	
	@GetMapping
	public String Method2() {
		return service.greets();
	}
}
