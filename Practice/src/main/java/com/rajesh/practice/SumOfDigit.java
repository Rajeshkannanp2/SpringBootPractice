package com.rajesh.practice;

import java.util.stream.IntStream;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1234; //6
		int result = 0;
		int remainder;
		while (number!=0) {
			remainder = number%10;
			result+=remainder;
			number = number/10;
		}
		System.out.println(result);
	}

}
