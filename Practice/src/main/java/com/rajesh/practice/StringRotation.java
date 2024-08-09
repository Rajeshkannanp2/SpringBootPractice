package com.rajesh.practice;

import java.util.regex.Pattern;

public class StringRotation {

	public static void main(String[] args) {
		// Check if one String is rotation of another String (input 1 = ABCD , input 2 = CDAB) answer true
		String input1="ABCDEF"; 
		String input2="EFABCD";
		
		String out = input1+input1;
		if(Pattern.compile(input2).matcher(out).find()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
