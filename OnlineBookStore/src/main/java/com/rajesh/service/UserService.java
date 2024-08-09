package com.rajesh.service;

import com.rajesh.entity.Users;

public interface UserService {
	public boolean authenticate(String username, String password);
	public Users saveUser(Users users);
}
