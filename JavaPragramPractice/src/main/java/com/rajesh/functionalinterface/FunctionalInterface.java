package com.rajesh.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FunctionalInterface {

	public static void main(String[] args) {
		//consumer();
		supplier();
	}
	
	private static void supplier() {
		 // Define a Supplier which supplies a random integer
        Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 100);

        // Get a random integer from the Supplier
        int randomNumber = randomSupplier.get();
        System.out.println("Random number: " + randomNumber);
	}
	private static void consumer() {
		Consumer<String> con = a ->System.out.println(a);
		con.accept("sss");
	}
	
	private void predicteFucntion() {
		Predicate <String> eligible = a -> a.equals("sss");
		
		System.out.println(eligible.test("sss"));
	}
	
	private void functionInterface() {
		Function<Integer, Double> sf = (a)-> a*3.14;
		sf.apply(5);
	}
	
	

}
