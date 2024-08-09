package com.rajesh.main;

import java.util.HashMap;

public class SpecialCharacterInString {

	public static void main(String[] args) {
		String password = "Rajesh@*#1234";
		
		int countOfSpecialCharacter = 0;
		String letters = "";
		for(int i=0; i<password.length();i++) {
			if(!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i)) && !Character.isWhitespace(password.charAt(i))) {
				countOfSpecialCharacter++;
			}else if (Character.isLetter(password.charAt(i))){
				letters = letters + password.charAt(i);
			}
		}
		System.out.println(letters);
		System.out.println("count of special character: " + countOfSpecialCharacter);
	}

}
