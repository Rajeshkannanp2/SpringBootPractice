package com.rajesh.practice;

import java.util.*;
import java.util.stream.IntStream;

import javax.xml.bind.helpers.ParseConversionEventImpl;
public class AmstrongNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int number = 153, remainder, result = 0;
		int originalNumber = number;
		int numberSize = count(number);
		while(number!=0) {
			remainder = number%10;
			number = number/10;
			result+=Math.pow(remainder, numberSize);
		}
		if(result == originalNumber) {
			System.out.println("arm");
		}else {
			System.out.println("not");
		}
		
	}
	public static int count(int num) {
		String s = Integer.toString(num);
		return s.length();
	}

}
