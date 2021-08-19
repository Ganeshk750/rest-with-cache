package com.ganesh.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ganesh.entity.User;
import com.ganesh.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public User addUser(User user) {
		return repo.save(user);
	}

	@Override
	@CachePut(cacheNames = "users", key = "#user.id")
	public User UpdateUser(User user) {
		logger.info("==========Update User============");
		return repo.updateAddress(user.getId(), user.getName());
	}

	@Override
	@Cacheable(cacheNames = "users", key = "#id")
	public User getUser(Long id) {
		logger.info("===========User Gets================");
		Optional<User> user = repo.findById(id);
		if(user.isPresent()) {
			return user.get();
		}else {
			return new User();
		}
	}

	@Override
	@CacheEvict(cacheNames = "users", key = "#id")
	public String deleteUser(Long id) {
		logger.info("===========User Delete ============");
		repo.deleteById(id);
		return "User deleted!!";
	}

}
