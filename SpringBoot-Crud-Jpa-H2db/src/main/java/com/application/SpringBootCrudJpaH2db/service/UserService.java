package com.application.SpringBootCrudJpaH2db.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.SpringBootCrudJpaH2db.dao.UserRepository;
import com.application.SpringBootCrudJpaH2db.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public User createUser(User user) {
		return repo.save(user);
	}
	
	public List<User> createUsers(List<User> users) {
		return repo.saveAll(users);
	}
	
	public User getUserById(int id) {
		return repo.findById(id).get();
	}
	
	public List<User> getAllUsers() {
		return repo.findAll();
	}
	
	public User updateUser(User user) {
		User oldUser = null;
		Optional<User> optionalUser = repo.findById(user.getId());
		if(optionalUser.isPresent()) {
			oldUser = optionalUser.get();
			oldUser.setName(user.getName());
			oldUser.setAddress(user.getAddress());
			repo.save(oldUser);
		}
		else {
			return new User();
		}
		return oldUser;
	}
	
	public String deleteUser(int id) {
		repo.deleteById(id);
		return "User got deleted!";
	}
}
