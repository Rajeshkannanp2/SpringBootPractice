/*package com.rajesh.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.rajesh.entity.Users;
import com.rajesh.repository.UserRepository;
import com.rajesh.service.UserService;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public Users authenticate(String username, String password) {
		Users users = userRepository.findByUsername(username);
		if(users != null && bCryptPasswordEncoder.matches(password, users.getPassword())) {
			return users;
		}
		return null;
	}
	
	public Users saveUser(Users users) {
		users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
		return userRepository.save(users);
	}
}*/
