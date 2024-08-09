package com.rajesh.practice;

import java.util.*;
public class ReverseLinkedList {
	
	public static void main(String[] arg) {
		LinkedList<Integer> check= new LinkedList<>();
		
		check.add(1);
		check.add(2);
		check.add(3);
		LinkedList<Integer> check1= new LinkedList<>();
		check.descendingIterator().forEachRemaining(check1::add);
		System.out.println(check1);
	}
}
