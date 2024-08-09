package com.rajesh.practice;

import java.util.*;
import java.util.stream.Collectors;

public class LargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,100,7,8,10};
		int largestNumber=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largestNumber) {
				largestNumber=arr[i];
			}
		}
		
		Optional<Integer> larNum = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		if(larNum.isPresent()) {
			System.out.println(larNum);
		}
		
		Optional<Integer> larger = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
		System.out.println(largestNumber);
	}

}
