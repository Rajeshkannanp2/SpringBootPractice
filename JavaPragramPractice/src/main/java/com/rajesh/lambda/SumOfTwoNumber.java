package com.rajesh.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import com.rajesh.lambda.interfaces.SumOfTwoNumbers;

public class SumOfTwoNumber {
	public static void main(String[] args) {
		//addTwoNumbers(5, 6);
		//stringIsEmptyOrNot("check");
		//converStringToUpperCase("check");
		//converStringToLowerCase("CHECK");
		//findOddOrEven();
		//changeToAlphabeticalOrder();
		//AverageOfDoubles();
		//removeDuplicateFromList();
		//factorialOfNumber(3);
		AverageOfDoubles();
	}
	
	private static void factorialOfNumber(int n) {
		long num = LongStream.rangeClosed(1, n).reduce(1, (long x, long y) -> x*y);
		System.out.println(num);
	}

	private static void removeDuplicateFromList() {
		List<Integer> listOfNumber = Arrays.asList(1,2,3,4,5,1,1,2,2,3,3);
		List removeDuplicates = listOfNumber.stream().distinct().collect(Collectors.toList());
		System.out.println(removeDuplicates);
	}

	private static void AverageOfDoubles() {
		List<Double> listOfDoubles = Arrays.asList(2.343, 3.343, 3.343, 6.434, 7.4545);
		Double average = listOfDoubles.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
		System.out.println(average);
		
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		num.stream().mapToInt(Integer::intValue).min();
		System.out.println(num.stream().sorted(Comparator.reverseOrder()).skip(1).mapToInt(Integer::intValue).max());
	}

	private static void changeToAlphabeticalOrder() {
		List<Character> alphabets = Arrays.asList('m','z','b','f','a');
		List alphOrder = alphabets.stream().sorted().collect(Collectors.toList());
		System.out.println(alphOrder);
		
		List desc = alphabets.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}

	private static void findOddOrEven() {
		List<Integer> listOfNumber = Arrays.asList(1,2,3,4,5);
		List evenNumbers = listOfNumber.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers: "+evenNumbers);
		List oddNumbers = listOfNumber.stream().filter(num -> num % 2 !=0).collect(Collectors.toList());
		System.out.println("Odd numbers: "+oddNumbers);
		int[] num = {1,2,3,4,5};
		int[] numbers = Arrays.stream(num).filter(a->a%2==0).toArray();
	}
	private static void converStringToUpperCase(String string) {
		Function<String, String> toUpperCase = s -> s.toUpperCase();
		System.out.println(toUpperCase.apply(string));
		
	}
	private static void converStringToLowerCase(String string) {
		Function<String, String> toUpperCase = s -> s.toLowerCase();
		System.out.println(toUpperCase.apply(string));
		
	}

	private static void stringIsEmptyOrNot(String s) {
		//Write a Java program to implement a lambda expression to check if a given string is empty.
		Predicate<String> checkString = str -> !str.isEmpty();
		System.out.println(checkString.test(s));
	}
	private static void addTwoNumbers(int a, int b) {
		//Write a Java program to implement a lambda expression to find the sum of two integers.
		SumOfTwoNumbers add = (c,d) -> c+d;
		System.out.println(add.sum(a, b));
		
		BiFunction<Integer, Integer, Integer> d = (x,y)->x+y;
	}

}
