package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public User addUser(User user) {
		
		return userRepository.save(user);
		
	}

	public List<User> getAllUserDetails() {
		List<User> allUserDetails=(List<User>) userRepository.findAll();
		return allUserDetails;
	}

}
