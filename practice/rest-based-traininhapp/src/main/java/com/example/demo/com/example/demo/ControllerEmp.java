package com.example.demo.com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEmp {

	@GetMapping(value="/getEmployee",produces= {MediaType.APPLICATION_XML_VALUE})
	public Employee getEmployee() {
		Employee employee = new Employee(23,"Guru",45);

		return employee;
	}

}
