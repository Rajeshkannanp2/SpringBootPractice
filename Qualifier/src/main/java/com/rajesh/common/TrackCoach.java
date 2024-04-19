package com.rajesh.common;

import org.springframework.stereotype.Component;

@Component //if we mention this it is available for DI
public class TrackCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Track Coach";
	}
	
}
