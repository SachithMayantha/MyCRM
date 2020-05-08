package com.im.mycrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.im.mycrm.entities.Task;
import com.im.mycrm.repositories.TaskRepository;

public class TaskController {
	@Autowired
	TaskRepository taskRepository;
	
	@GetMapping("/task")
	public List<Task> getTask(){
		return taskRepository.findAll();
	}
	@GetMapping("/task/{id}")
	public Task getTask(@PathVariable Long id) {
		return taskRepository.findById(id).get();
	}
	@PostMapping("/task")
	public Task createTask(Task task){
	return taskRepository.save(task);
	}

	@PutMapping("/task")
	public Task updateTask(Task task){
	return taskRepository.save(task);
	}

	@DeleteMapping("/task/{id}")
	public boolean deleteTask(@PathVariable Long id){
	taskRepository.deleteById(id);
	return true;
	}
}
