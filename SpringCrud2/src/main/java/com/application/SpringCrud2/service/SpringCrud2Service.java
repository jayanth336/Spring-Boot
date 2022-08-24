package com.application.SpringCrud2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.SpringCrud2.entity.User;
import com.application.SpringCrud2.repository.SpringCrud2Repository;

@Service
public class SpringCrud2Service {
	
	@Autowired
	private SpringCrud2Repository repo;
	
	public User addUser(User user) {
		return repo.save(user);
	}
	public List<User> addUsers(List<User> users) {
		return repo.saveAll(users);
	}
	public User getUser(int id) {
		return repo.findById(id).get();
	}
	public List<User> getUsers() {
		return repo.findAll();
	}
	public User updateUser(User user) {
		User oldUser = null;
		Optional<User> optionalUser = repo.findById(user.getId());
		if(optionalUser.isPresent()) {
			oldUser = optionalUser.get();
			oldUser.setName(user.getName());
			oldUser.setAddress(user.getAddress());
			oldUser.setNumber(user.getNumber());
			repo.save(oldUser);
		}
		else {
			return new User();
		}
		return oldUser;
	}
	public String deleteUser(int id) {
		repo.deleteById(id);
		return "RECORD DELETED!";
	}
	public String deleteAll() {
		repo.deleteAll();
		return "ALL RECORDS DELETED!!";
	}
	
}