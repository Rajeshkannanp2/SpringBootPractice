package com.rajesh.practice;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1234;
		int result=0;
		int remain=0;
		while (i!=0) {
			remain=i%10;
			i=i/10;
			result=result*10+remain;
		}
		System.out.println(result);
	}

}

