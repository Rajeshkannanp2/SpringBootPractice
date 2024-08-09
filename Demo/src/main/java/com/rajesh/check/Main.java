package com.rajesh.check;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, String> data = new HashMap();
		data.put(1, "test1");
		data.put(2, "test2");
		data.put(3, "test3");
		data.put(4, "test4");
		data.put(5, "test5");	
		
		for(Map.Entry<Integer, String> s:data.entrySet()) {
			System.out.println(s.getKey()+s.getValue());
		}
		
		data.entrySet().stream().filter(a->a>4).map(a->a.getValue()).forEach(System.out.println());
		Check.add();
}
static Interface Check{
	static add();
}
