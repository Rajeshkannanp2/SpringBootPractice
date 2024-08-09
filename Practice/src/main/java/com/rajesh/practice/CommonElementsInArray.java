package com.rajesh.practice;

import java.util.Arrays;

public class CommonElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {2,3,4};
		
//		Arrays.stream(arr1)
//		.filter(x->Arrays.stream(arr2).anyMatch(y->x==y))
//		.forEach(System.out::print);
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
