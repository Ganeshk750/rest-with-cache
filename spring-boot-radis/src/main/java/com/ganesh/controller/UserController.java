package com.ganesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.entity.User;
import com.ganesh.service.UserService;


@RestController
@RequestMapping("api")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/user")
	public User crateUser(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") Long id) {
		return service.getUser(id);
	}
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return service.UpdateUser(user);
	}
	
	
	@DeleteMapping("/user/{id}")
	public String delete(@PathVariable("id") Long id) {
		return service.deleteUser(id);
	}

}
