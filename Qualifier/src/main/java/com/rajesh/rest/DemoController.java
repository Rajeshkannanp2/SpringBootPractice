package com.rajesh.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.common.Coach;

@RestController
public class DemoController {
	//define private field for the dependency
	private Coach myCoach;
	
	@Autowired
	public DemoController(@Qualifier("baseballCoach") Coach myCoach) {
		this.myCoach = myCoach;
	}
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
}
