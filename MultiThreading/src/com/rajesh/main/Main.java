package com.rajesh.main;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		MultiThread mt = new MultiThread();
		System.out.println(mt.getState());
		mt.setPriority(1);
		mt.start(); //you are starting new thread it will create new stack in memory area
		mt.join();
		for(int i=0;i<10;i++) {
			System.out.println("normal: "+i);
		}
	}
}
