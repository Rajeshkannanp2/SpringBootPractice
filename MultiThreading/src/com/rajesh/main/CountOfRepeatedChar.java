package com.rajesh.main;

import java.util.HashMap;

public class CountOfRepeatedChar {

	public static void main(String[] args) {
		String str = "ammaappa";
		
		HashMap<Character, Integer> check = new HashMap<Character, Integer>();
		char[] splitCont=str.toCharArray();
		
		for(char content : splitCont) {
			if(check.containsKey(content)) {
				check.put(content, check.get(content)+1);
			}else {
				check.put(content, 1);
			}
		}
		System.out.println(check);
	}

}
