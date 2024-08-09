package com.rajesh.practice;
import java.util.*;
import java.util.stream.Collectors;
public class Java8DuplicateElements {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,6,5);
		
		Set<Integer> num = new HashSet<>();
		
		number.stream().filter(a->!num.add(a)).collect(Collectors.toSet()).forEach(a->System.out.println(a));
		
		String s = "welcome to code decode and code decode welcome you";
		
		List<String> ss = Arrays.asList(s.split(" ")); 
		HashMap<String, Integer> sss = new HashMap<>();
		//ss.stream().filter(a->sss.put(a, 1));
		
		for(String c:ss) {
			if(sss.keySet().contains(c)) {
				sss.put(c, sss.get(c)+1);
			}else {
				sss.put(c, 1);
			}
		}
		System.out.println(sss);
		
		ss.stream().filter(c->sss.keySet().contains(c));
		
		
//		HashMap<String, Integer> check = new HashMap<>();
//		
//		check.put("Rajesh", 1);
//		check.put("Ra", 2);
//		check.put("Raje", 3);
//		check.put("Raj", 4);
//		
//		for(Map.Entry<String, Integer> c:check.entrySet()) {
//			if(c.getValue()>2) {
//				System.out.println(c.getKey());
//			}
//		}
	}

}
