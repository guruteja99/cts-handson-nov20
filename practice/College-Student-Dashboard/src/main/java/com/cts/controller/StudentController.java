package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.model.Student;
import com.cts.model.Task;
import com.cts.service.StudentService;

@Controller
@RequestMapping("/dashboard")
public class StudentController {

	@Autowired
	public StudentService service;
	
	@GetMapping
	public String home() {
		return "home";
	}
	
	@PostMapping
	public String myProfile(ModelMap modelMap,@RequestParam int id) {
		Student student;
		try {
			student = service.getDetails(id);
			modelMap.put("student", student);
			List<Task> tasks = service.getTasks(id);
			modelMap.put("tasks", tasks);
			modelMap.put("size", tasks.size());
			return "studentprofile";

		} catch (Exception e) {
			modelMap.put("error", e.getMessage());
			return "exception";
		}
		
	}
}
