package com.rajesh.practice;

import java.util.*;

public class Isogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "check";
	
	}
	private boolean checkIsogram(String s) {
		boolean isogram = true;
		char[] charc=s.toCharArray();
		Set<Character> c = new HashSet<>();
		for(char cc:charc) {
			if(c.contains(cc)) {
				isogram=false;
			}else {
				c.add(cc);
			}
		}
		return isogram;
		
	}

}
