package com.rajesh.common;

import org.springframework.stereotype.Component;

@Component //if we mention this it is available for DI
public class TennisCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "tennis coach";
	}
	
}
