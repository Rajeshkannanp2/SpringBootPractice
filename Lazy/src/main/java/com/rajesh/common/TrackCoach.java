package com.rajesh.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component //if we mention this it is available for DI
@Lazy
public class TrackCoach implements Coach{

	public TrackCoach() {
		System.out.println("In constructor" + getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Track Coach";
	}
	
}