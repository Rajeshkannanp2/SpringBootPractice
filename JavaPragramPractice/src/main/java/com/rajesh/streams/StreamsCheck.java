package com.rajesh.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsCheck {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "orange", "mango","banana","berry","guva");
		
		//use filter
		
		List<String> filterFruits = fruits.stream()
				.filter(c->c.startsWith("a"))
				.collect(Collectors.toList());
		System.out.println(filterFruits);
		
		//map function
		
		List<String> wordLength = fruits.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		System.out.println(wordLength);
		
		//limit
		
		List<String> limitedWords = fruits.stream()
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(limitedWords);
		
		// Remove duplicates
		
		List<String> nodiff = fruits.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(nodiff);
		
		List<String> sortedWords = fruits.stream()
                .sorted()
                .collect(Collectors.toList());
		System.out.println("Sorted words: " + sortedWords);
			
		//Count the number of words
		long wordCount = fruits.stream().count();
		System.out.println("Total number of words: " + wordCount);
		
		fruits.forEach(System.out::println);
	}
}
