package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.StudentDao;
import com.cts.model.Student;

@Service
public class StudentService {

	@Autowired
	public StudentDao dao;
	public Student getDetails() {
		return dao.getOne(1);
	}
}
