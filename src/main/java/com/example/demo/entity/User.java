package com.example.demo.entity;

public class User {
	private Integer userId;
	private String userName;

	public User(Integer userId, String userName) {
		System.out.println("parameterized contr called");
		this.userId = userId;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}

}
