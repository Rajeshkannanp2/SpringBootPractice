package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@RequestMapping("index")  
	public String index() {
		System.out.println("hello");
		return "index"; //separation of concerns so no need to provide the extension
	}
}
