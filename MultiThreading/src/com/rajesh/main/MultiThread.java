package com.rajesh.main;

public class MultiThread extends Thread {
	
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				sleep(1000);
				System.out.println("thread: "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
