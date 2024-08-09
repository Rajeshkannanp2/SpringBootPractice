package com.rajesh.practice;

import java.util.*;
import java.util.stream.IntStream;
public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("enter the number");
		//int number = scanner.nextInt();
		//int result = IntStream.rangeClosed(1, number)
		//		.reduce(1, (x,y) -> x*y);
//		int result = 1;
//		for(int i=number;i>0;i--) {
//			result = result *i;
//		}
		//System.out.println("Factorial of the number is:"+result);
		
		
		int numbers=3;
		
		int num = IntStream.rangeClosed(1, numbers).reduce(1, (x,y)->x*y);
		System.out.println("===="+num);
		
		List<Integer> a = Arrays.asList(1, 2, 3, 4, 5);
		
		a.stream().reduce((c,b)->c+b);
		System.out.println("cc"+a.stream().reduce((c,b)->c+b));
		
		String s = "checl";
		
		int result = IntStream.rangeClosed(1, 5).reduce(1, (x,y)->x*y);
		
		
		
		
		
		int resu = IntStream.rangeClosed(1, numbers).reduce(1, (x,y)->x*y);
		
		System.out.println(resu);
		
	}

}
