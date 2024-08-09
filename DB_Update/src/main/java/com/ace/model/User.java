package com.ace.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity  //sent data to db as model
public class User {
	
	@Id //used to create table once we provide this table will create in database
	private int id;
	private String name;
	
	public String toString() {
		return name + ":" + id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
