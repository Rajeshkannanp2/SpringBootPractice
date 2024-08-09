package com.rajesh.singletoncheck;

import java.io.Serializable;

public class Singleton implements Cloneable{
	//declare a private static member to hold instance
	private static Singleton instance;
	
	//declare a private constructor
	private Singleton() {}
	
	//declare a static method to get instance
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	@Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
