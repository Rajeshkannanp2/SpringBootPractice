package com.example.practicesecurity.service;

import com.example.practicesecurity.entity.User;

public interface UserService {
	public User saveUser(User user);
	public boolean isUserValid(String username, String password);
}
