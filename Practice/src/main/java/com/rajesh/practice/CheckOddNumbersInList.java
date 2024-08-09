package com.rajesh.practice;

import java.util.*;

public class CheckOddNumbersInList {

	public static void main(String[] args) {
		//list 2,4,6,8
		
		
		List<Integer> number = new ArrayList<Integer>();
		
		number.add(1);
		number.add(2);
		number.add(5);
		number.add(7);
		
		boolean checkOdd=false;
		for(Integer num:number) {
			if(num%2==0) {
				checkOdd=true;
				break;
			}
		}
		if(checkOdd) {
			System.out.println("not odd");
		}else {
			System.out.println("odd");
		}
		
		boolean checked = number.stream()
		.anyMatch(x->x%2!=0);
		
		System.out.println(checked);
		
	}

}
