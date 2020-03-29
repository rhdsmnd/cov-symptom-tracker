package com.rhdes.covid.controller;

import com.rhdes.covid.model.User;
import com.rhdes.covid.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable long id) {
		return userRepo.findById(id);
	}

	@PutMapping("/user")
	public Long createUser(@RequestBody User user) {
		return userRepo.save(user).getId();
	}

	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable long id) {
		userRepo.deleteById(id);
	}
}
