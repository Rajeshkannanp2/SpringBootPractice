package com.rajesh.practice;

import java.util.*;

import javax.print.attribute.standard.RequestingUserName;
public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string want to check");
		String toCheck = s.nextLine();
		String reverse = new StringBuilder(toCheck).reverse().toString();
		
//		String reverse = "";
		
//		char[] stingToArray = toCheck.toCharArray();
//		
//		for(int i=stingToArray.length;i>=0;i--) {
//			reverse += stingToArray[i];
//		}
		if(toCheck.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println("this is palindrom");
		}else {
			System.out.println("not palindorm");
		}
	}

}
