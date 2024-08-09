package com.rajesh.practice;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string want to check");
		int number = s.nextInt();
		
		int n = number/2;
		boolean prime = true;
		if(number<2) {
			System.out.println("not prime");
		}else {
			for(int i = 0 ; i < n ; i++) {
				if(number%i==0) {
					System.out.println("not prime");
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.println("prime");
			}
		}
		
	}

}
