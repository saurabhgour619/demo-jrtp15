package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public class UserDao {

	public boolean saveUser(User user) {
		// TO DO -- db logic
		System.out.println("UserDao :: saveUser() called.");
		System.out.println("UserDao :: " + user + " saved.");
		return true;
	}
}
