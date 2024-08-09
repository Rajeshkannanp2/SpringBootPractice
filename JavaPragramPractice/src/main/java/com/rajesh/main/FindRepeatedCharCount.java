package com.rajesh.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepeatedCharCount {

	public static void main(String[] args) {
		String word = "ammaappa";
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		word.chars().forEach(c -> charCount.put((char) c, charCount.getOrDefault((char) c, 0) + 1));
//		char[] splitWord = word.toCharArray();
//		for(int i=0;i<splitWord.length;i++) {
//			if(charcount.containsKey(splitWord[i])) {
//				charcount.put(splitWord[i], charcount.get(splitWord[i])+1);
//			}else {
//				charcount.put(splitWord[i], 1);
//			}
//		}
		word.chars().forEach(c-> System.out.println(c));
		System.out.println(charCount);
		Map<Character, Long> sss = word.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(a->a, Collectors.counting()));
		
		String s = "welcome to code decode code decode welcome you";
		
		List<String> ss = Arrays.asList(s.split(" "));
		
		System.out.println(ss.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println(ss.stream().map(a->a).collect(Collectors.groupingBy(a->a, Collectors.counting())));
		
	}

}
