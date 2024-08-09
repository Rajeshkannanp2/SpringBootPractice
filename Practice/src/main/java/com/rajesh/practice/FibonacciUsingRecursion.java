package com.rajesh.practice;

public class FibonacciUsingRecursion {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(check(n));

	}
	private static int check(int num) {
		if(num<=1) {
			return num;
		}else {
			return check(num-1)+check(num-2);
		}
	}

}
