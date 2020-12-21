package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.StudentDao;
import com.cts.dao.TaskDao;
import com.cts.model.Student;
import com.cts.model.Task;

@Service
public class StudentService {

	@Autowired
	public StudentDao dao;
	
	@Autowired
	public TaskDao taskDao;
	
	public Student getDetails(int id) throws Exception {
		Optional<Student> student = dao.findById(id);
		if(student.isPresent())
			return student.get();
		else
			 throw new Exception("Oops! Details not found");
	}
	public List<Task> getTasks(int id) {
		List<Task> tasks =taskDao.findAllByStudentId(id);
		return tasks;
	}
}
