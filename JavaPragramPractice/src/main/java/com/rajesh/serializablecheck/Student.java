package com.rajesh.serializablecheck;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private int mark;
	public Student(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", mark=" + mark + "]";
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
}
