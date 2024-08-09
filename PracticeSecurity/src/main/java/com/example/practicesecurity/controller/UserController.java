package com.example.practicesecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practicesecurity.entity.User;
import com.example.practicesecurity.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		System.out.println("check");
        User savedUser = userService.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }
	
	@GetMapping("/login")
	public String checkUser(@RequestBody User user) {
		boolean checkUser = userService.isUserValid(user.getUsername(), user.getPassword());
		if(checkUser) {
			return "success...";
		}else {
			return "failed...";
		}
	}
}
