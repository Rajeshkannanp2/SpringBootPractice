package com.rajesh.practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		
		int first=0;
		int second=1;
		
		for(int i=0;i<number;i++) {
			System.out.print(first+", ");
			int next=first+second;
			first=second;
			second=next;
		}
	}

}
