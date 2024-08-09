package com.rajesh.practice;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0, 0, 1, 2
		
		
		int first = 0;
		int second = 1;
		
		for(int i=0;i<10;i++) {
			int nextNumber=first+second;
			System.out.println(first);
			first=second;
			second=nextNumber;
		}
	}

}
