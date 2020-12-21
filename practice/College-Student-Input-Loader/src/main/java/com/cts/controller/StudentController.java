package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ResponseMessage;
import com.cts.Exception.ApplicationException;
import com.cts.model.Student;
import com.cts.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping
	public Student createStudentAPI(@RequestBody Student student) {
		Student createdStudent = studentService.addStudent(student);
		return createdStudent;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteStudentById(@PathVariable("id") int id) {
		ResponseEntity<Object> response = null;
		try {
			studentService.deleteStudent(id);
			ResponseMessage success = new ResponseMessage();
			success.setStatusCode(200);
			success.setDescription("Deleted successfully");
			response = ResponseEntity.status(200).body(success);
		} catch (ApplicationException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error); 
		}
		return response;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateStudent(@RequestBody Student student,@PathVariable("id") int id) {
		ResponseEntity<Object> response = null;
		Student updatedStudent;
		try {
			updatedStudent = studentService.updateStudent(id,student);
			response=ResponseEntity.status(200).body(updatedStudent);
		} catch (ApplicationException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error); 
		}
		return response;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getStudentById(@PathVariable("id") int id) {
		ResponseEntity<Object> response = null;
		try {
			Student student = studentService.getStudent(id);
			response = ResponseEntity.status(200).body(student);
		} catch (ApplicationException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error); 
		}
		return response;
	}
	
	@GetMapping
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
}