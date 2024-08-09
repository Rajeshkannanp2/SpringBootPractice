package com.rajesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rajesh.service.UserService;

@Controller
public class LoginController {
	
	private UserService userService;
	
	public LoginController() {
		super();
	}

	public LoginController(UserService theUserService) {
		userService = theUserService;
	}

	@GetMapping("/MyLoginPage")
	public String showLoginPage() {
		return "loginPage";
	}
	
	@GetMapping("/signup")
	public String showSignUpPage(Model model) {
		 //model.addAttribute("user", new User());
		return ("/signup");
	}
	
	@PostMapping("/signup")
	public String processSignUp() {
		return ("redirect:/login");
	}
	
	@PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        if (userService.authenticate(username, password)) {
            return "redirect:/home";
        } else {
            return "redirect:/login?error";
        }
    }
	@GetMapping("/access-denied")
    public String showAccessDenied() {

        return "access-denied";
    }
}
