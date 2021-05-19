package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserDao;

@Service
public class UserService {

	private UserDao userDao = null;

	@Autowired
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}

	public void registerUser(User user) {
		// TO DO -- service logic
		System.out.println("UserService :: registerUser() called.");
		boolean isUserSaved = userDao.saveUser(user);
		if (isUserSaved) {
			System.out.println("UserService :: User registered.");
		} else {
			System.out.println("UserService :: User not registered.");
		}
	}
}
