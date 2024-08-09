package com.rajesh.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReduceFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using reduce() to find the sum of elements	
        int sum = numbers.stream()
                        .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of elements: " + sum); // Output: Sum of elements: 15
        
        List<Integer> a=Arrays.asList(1,2,3);
    	//int sum2 = a.stream().reduce(0, (x,y)->a+b);
    	int sum1 = a.stream().reduce(1, (x,y)->x*y);
    	System.out.println("product of elements: " + sum1);
    	
    	
    	
	}
	
	

}
