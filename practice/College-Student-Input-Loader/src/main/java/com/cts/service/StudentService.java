package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Exception.ApplicationException;
import com.cts.dao.StudentDao;
import com.cts.model.Student;

@Service
public class StudentService {

	@Autowired
	public StudentDao dao;
	
	public Student addStudent(Student student) {
		return dao.save(student);
	}

	public void deleteStudent(int id) throws ApplicationException {
		Optional<Student> student = dao.findById(id);
		if(student.isPresent())
			dao.deleteById(id);
		else 
			throw new ApplicationException("student with "+id+" not found");
	}

	public Student updateStudent(int id, Student student) throws ApplicationException {

		Optional<Student> student1 = dao.findById(id);
		Student createdStudent = null;
		if(student1.isPresent())
			createdStudent=dao.save(student);
		else 
			throw new ApplicationException("Student with id "+id+" not found");
		return createdStudent;
	}

	public Student getStudent(int id) throws ApplicationException {
		Optional<Student> student = dao.findById(id);
		if(student.isPresent())
			return student.get();
		else 
			throw new ApplicationException("Student with "+id+"not found");	
	}

	public List<Student> getStudents() {
		return dao.findAll();
	}
	
	
}
