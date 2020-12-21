package com.cts;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.service.StudentService;

@SpringBootTest
class CollegeStudentDashboardApplicationTests {

	@Autowired
	StudentService studentService;
	
	@Test
	public void gettingStudent() throws Exception {
		assertTrue(studentService.getDetails(1).id==1);
	}
	
	@Test
	public void gettingTasks() throws Exception {
		assertTrue(studentService.getTasks(1).get(1).getClass().getCanonicalName().contains("Task"));
	}
	

}
