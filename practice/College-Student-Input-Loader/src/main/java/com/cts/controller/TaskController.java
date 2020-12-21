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
import com.cts.model.Task;
import com.cts.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	TaskService taskService;
	
	@PostMapping
	public Task createCustomerAPI(@RequestBody Task task) {
		Task craetedtask = taskService.addTask(task);
		return craetedtask;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteTask(@PathVariable("id") int id) {
		ResponseEntity<Object> response=null;
		try {
			taskService.deleteTask(id);
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
	public ResponseEntity<Object> updateTask(@RequestBody Task task,@PathVariable("id") int id) {
		ResponseEntity<Object> response=null;
		try {
			Task updatedTask = taskService.updateTask(task,id);
			response = ResponseEntity.status(200).body(updatedTask);
		} catch (ApplicationException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error); 	
		}
		return response;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getTaskById(@PathVariable("id") int id) {
		ResponseEntity<Object> response=null;
		try {
			Task task = taskService.getTaskById(id);
			response = ResponseEntity.status(200).body(task);
		} catch (ApplicationException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error); 
		}
		return response;
	}
	
	@GetMapping
	public List<Task> getTasks(){
		return taskService.getTasks();
	}

}
