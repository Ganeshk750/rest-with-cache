package com.ganesh.service;

import java.util.List;

import com.ganesh.model.User;

public interface UserService {

	List<User> getAllUsers();
	User getUser(int id);
	User addUser(User user);
	User updateUser(User user);
	User deleteUser(int id);
}
