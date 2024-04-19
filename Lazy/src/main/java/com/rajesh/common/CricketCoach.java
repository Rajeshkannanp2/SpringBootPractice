package com.rajesh.common;

import org.springframework.stereotype.Component;

@Component //if we mention this it is available for DI
public class CricketCoach implements Coach{

	public CricketCoach() {
		System.out.println("In constructor" + getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 min!!!!!";
	}
	
}
