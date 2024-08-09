package com.rajesh.practice;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.*;

interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }
    
    static int subtract(int a, int b) {
        return a - b;
    }
}

class Calculator implements MathOperations {
    // Implement other methods required by the interface
}

public class StaticInInterface {
    public static void main(String[] args) {
        System.out.println(MathOperations.add(5, 3)); // Output: 8
        System.out.println(MathOperations.subtract(10, 4)); // Output: 6
        List<String> list = new ArrayList<String>();
        
        list.add("a");
        list.add("b");
        list.add("c");
        
       Function<Integer, Double> h = (a)-> a*3.1;
       h.apply(4);
       Predicate<Integer> i = (a)-> a>18;
       i.test(10);
       Consumer<String> c = (x)-> System.out.print(x);
       c.accept("s");
       Supplier<List<String>> s = ()->list;
       System.out.println(s.get());
        
    }
}
