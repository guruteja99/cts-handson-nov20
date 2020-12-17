package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.cts.model.Student;
import com.cts.model.Task;
import com.cts.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	public StudentService service;
	
	
	@GetMapping("/")
	public String myProfile(ModelMap modelMap) {
		Student student = service.getDetails();
		modelMap.put("student", student);
		List<Task> tasks = service.getTasks();
		modelMap.put("tasks", tasks);
		return "studentprofile";
	}
}
