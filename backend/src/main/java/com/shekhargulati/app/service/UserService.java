package com.shekhargulati.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shekhargulati.app.entity.User;
import com.shekhargulati.app.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUser(){
		
		return userRepository.findAll();
	}
	
}
