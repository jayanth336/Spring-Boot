package com.application.SpringBootCrudJpaH2db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.SpringBootCrudJpaH2db.entity.User;
import com.application.SpringBootCrudJpaH2db.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return service.createUser(user);
	}

	@PostMapping("/addUsers")
	public List<User> addUsers(@RequestBody List<User> users) {
		return service.createUsers(users);
	}

	@GetMapping("/getUser/{id}")
	public User getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}

	@GetMapping("/getUsers")
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}

	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);		
	}

}
