package com.rajesh.service;

import com.rajesh.entity.Users;

public interface UserService {
	public Users authenticate(String username, String password);
	public Users saveUser(Users users);
}
