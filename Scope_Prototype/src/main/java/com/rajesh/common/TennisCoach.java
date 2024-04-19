package com.rajesh.common;

import org.springframework.stereotype.Component;

@Component //if we mention this it is available for DI
public class TennisCoach implements Coach{
	public TennisCoach() {
		System.out.println("In constructor" + getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "tennis coach";
	}
	
}
