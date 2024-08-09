package com.rajesh.streams;

import java.util.*;
public class StockCheck {

	public static void main(String[] args) {
		List<StockDetails> stock = new ArrayList<>();
		stock.add(new StockDetails("Nokia", "Mobile", 15000, 10));
		stock.add(new StockDetails("Sony", "Headset", 5000, 20));
		stock.add(new StockDetails("Samsung", "Mobile", 50000, 15));
		stock.add(new StockDetails("Mac", "Headset", 6000, 25));
		stock.add(new StockDetails("Iwatch", "Mobile", 44000, 30));
		stock.add(new StockDetails("Iphone", "Headset", 15000, 11));
	
		double check = stock.stream()
		.filter(category -> category.getCategory().equals("Mobile"))
		.mapToDouble(StockDetails::getPrice)
		.sum();
		System.out.println(check);
		
		stock.stream()
		.filter(category -> category.getCategory().equals("Mobile"))
		//.map(StockDetails::getName)
		.sorted(Comparator.comparing(StockDetails::getName).reversed())
		.forEach(c->System.out.println(c));
		
		stock.stream()
		.mapToDouble(StockDetails::getPrice)
		.sorted()
		.forEach(c->System.out.println(c));
		
		StockDetails checkd = stock.stream()
		.min((p1, p2)->Double.compare(p1.getPrice(), p2.getPrice()))
		.orElse(null);
		
		
//		Product cheapestProduct = products.stream()
//                .min((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
//                .orElse(null);
	}
}
