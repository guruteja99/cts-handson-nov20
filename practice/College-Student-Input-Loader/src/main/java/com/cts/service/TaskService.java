package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Exception.ApplicationException;
import com.cts.dao.TaskDao;
import com.cts.model.Task;

@Service
public class TaskService {

	@Autowired
	TaskDao dao;
	
	public Task addTask(Task task) {
		Task createdTask = dao.save(task);
		return createdTask;
	}

	public void deleteTask(int id) throws ApplicationException {
		Optional<Task> task = dao.findById(id);
		if(task.isPresent())
			dao.deleteById(id);
		else 
			throw new ApplicationException("Task with id "+id+" not found");
	}

	public Task updateTask(Task task, int id) throws ApplicationException {
		Optional<Task> task1 = dao.findById(id);
		Task updatedTask = null;
		if(task1.isPresent())
			updatedTask = dao.save(task);		
		else 
			throw new ApplicationException("Task with id "+id+" not found");
		return updatedTask;
	}

	public Task getTaskById(int id) throws ApplicationException {
		Optional<Task> task = dao.findById(id);
		if(task.isPresent())
			return task.get();
		else 
			throw new ApplicationException("Task with id "+id+" not found");
	}

	public List<Task> getTasks() {
		return dao.findAll();
	}
}
