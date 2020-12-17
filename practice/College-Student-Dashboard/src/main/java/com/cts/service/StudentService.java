package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Task;
import com.cts.dao.StudentDao;
import com.cts.dao.TaskDao;
import com.cts.model.Student;

@Service
public class StudentService {

	@Autowired
	public StudentDao dao;
	
	@Autowired
	public TaskDao taskDao;
	
	public Student getDetails() {
		Optional<Student> student = dao.findById(1);
		if(student.isPresent())
			return dao.getOne(1);
		else
			return null;
	}
	public List<Task> getTasks() {

		List<Task> tasks =taskDao.findAllByStudentId(1);
		return tasks;
	}
}
