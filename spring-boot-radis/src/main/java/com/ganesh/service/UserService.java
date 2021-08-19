package com.ganesh.service;

import com.ganesh.entity.User;

public interface UserService {
	
	User addUser(User user);
	User UpdateUser(User user);
	User getUser(Long id);
	String deleteUser(Long id);
	

}
