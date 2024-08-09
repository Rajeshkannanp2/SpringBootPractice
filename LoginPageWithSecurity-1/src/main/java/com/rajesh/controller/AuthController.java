package com.rajesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.entity.Users;
import com.rajesh.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String login(@RequestParam String username,@RequestParam String password) {
		Users users = userService.authenticate(username, password);
		if(users != null) {
			return "authentication success";
		}else {
			return "authentication failed";
		}
	}
	
}
