package com.rajesh.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rajesh.dao.UserRepository;
import com.rajesh.entity.Users;

@Service
public class UserServiceImp implements UserService{
	private UserRepository userRepository;
	private PasswordEncoder passwordEncoder;
	
	public UserServiceImp() {
		super();
	}

	public UserServiceImp(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public UserServiceImp(PasswordEncoder passwordEncoder) {
		super();
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public boolean authenticate(String username, String password) {
		Users user = userRepository.findByUsername(username);
        if (user != null) {
            // Compare hashed password
            return passwordEncoder.matches(password, user.getPassword());
        }
        return false;
	}

	@Override
	public Users saveUser(Users users) {
		// TODO Auto-generated method stub
		return null;
	}

}
