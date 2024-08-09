package com.rajesh.stream;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class StreamCheck {
	public static void main(String[] args) {
		List<HotelMenu> hotel = new ArrayList<HotelMenu>();
		
		hotel.add(new HotelMenu("Briyani", "non-veg", 120));
		hotel.add(new HotelMenu("Veg Briyani", "veg", 80));
		hotel.add(new HotelMenu("Rice", "veg", 40));
		hotel.add(new HotelMenu("Fish", "non-veg", 140));
		hotel.add(new HotelMenu("sea food", "non-veg", 240));
		hotel.add(new HotelMenu("Duck", "non-veg", 110));
		
		List<String> s = hotel.stream()
				.filter(a->a.getPrice()<50)
				.sorted(Comparator.comparing(HotelMenu::getPrice).reversed())
				.map(HotelMenu::getDish)
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		System.out.println("s"+s);
		
	List<String> sss=hotel.stream()
		.filter((a)->a.getType().equals("non-veg"))
		.sorted(Comparator.comparing(HotelMenu::getPrice).reversed())
		.map(dish->dish.getDish())
		.collect(Collectors.toList());
	System.out.println(sss);
	
	
	 List<List<String>> listOfLists = Arrays.asList(
	            Arrays.asList("a", "b", "c"),
	            Arrays.asList("d", "e", "f"),
	            Arrays.asList("g", "h", "i")
	        );

	        List<String> flattenedList = listOfLists.stream()
	        		.flatMap(List::stream)
	        		.collect(Collectors.toList());

	        System.out.println(flattenedList);
	ArrayList<Integer> check = new ArrayList<>();
	check.add(1);
	check.add(2);
	check.add(3);
	check.add(4);
	check.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	System.out.println("large"+check.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst());
	
	}
}
