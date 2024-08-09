package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class InternetConnection {
	private int ipaddress;
	private String name;
	public int getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(int ipaddress) {
		this.ipaddress = ipaddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void connection() {
		System.out.println("Internet");
	}
}
