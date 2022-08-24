package com.application.SpringCrud2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.SpringCrud2.entity.User;
import com.application.SpringCrud2.service.SpringCrud2Service;

@RestController
public class SpringCrud2Controller {

	@Autowired
	private SpringCrud2Service service;

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return service.addUser(user);
	}

	@PostMapping("/addUsers")
	public List<User> addUsers(@RequestBody List<User> users) {
		return service.addUsers(users);
	}

	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable int id) {
		return service.getUser(id);
	}

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return service.getUsers();
	}

	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}

	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}

	@DeleteMapping("/deleteAll")
	public String deleteAll() {
		return service.deleteAll();
	}
}