package com.rajesh.main;

public class RotationOfString {

	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CDAB";
		
		String str3 = str1+str1;
		if(str3.contains(str2)) {
			System.out.println("given string is rotation of str1");
		}else {
			System.out.println("given string is not rotation of str1");
		}
	}

}
