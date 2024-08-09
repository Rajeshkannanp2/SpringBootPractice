package com.rajesh.markerinterface;

public class MarkerInterface {
	public static void main(String[] args) {
		Rajesh rajesh = new Rajesh();
		if(rajesh instanceof ThemePark) {
			System.out.println("okay");
		}else {
			System.out.println("not okay");
		}
	}
}
