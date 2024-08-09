package com.ace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ace.dao.UserRepository;
import com.ace.model.User;

@Controller
public class UserController {
	
	@Autowired
    private UserRepository userRepository;
    
    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Return the login page template name
    }
    
    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            // Successful login
            model.addAttribute("username", username);
            return "home"; // Return the home page template name
        } else {
            // Failed login
            model.addAttribute("error", "Invalid username or password");
            return "login"; // Return the login page template name
        }
    }
}
