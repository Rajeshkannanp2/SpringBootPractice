package com.rajesh.practice;

import java.util.*;

public class anagram {

	public static void main(String[] args) {
		String str1 = "angle";
		String str2 = "angel";
		
		char[] str1toarr=str1.toCharArray();
		char[] str2toarr=str2.toCharArray();
		
		Arrays.sort(str1toarr);
		Arrays.sort(str2toarr);
		
		String s1 = new String(str1toarr);
		String s2 = new String(str2toarr);
		
		if(str1toarr.length!=str2toarr.length) {
			System.out.println("not anagram");
		}else if(s1.equals(s2)) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
	}

}
