package com.rajesh.main;

import java.util.*;
import com.rajesh.main.data.*;

public class ComparableCheck{

	public static void main(String[] args) {
		
		List<Employee> employeeDetails = new ArrayList<>();
		employeeDetails.add(new Employee("Rajesh",25,28000));
		employeeDetails.add(new Employee("Ajay",27,32000));
		employeeDetails.add(new Employee("Vijay",28,30000));
		employeeDetails.add(new Employee("Sathish",23,35000));
		
		Comparator<Employee> employeeDetails2=Comparator.comparing(Employee::getAge);
		
		Collections.sort(employeeDetails, employeeDetails2);

		
		Comparator<Employee> employeeDetails1 = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getAge()>o2.getAge()) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		
		
		
		Comparator<Employee> emp2 = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getAge()>o2.getAge()) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		
		Collections.sort(employeeDetails, employeeDetails2);
		
		for (Employee  emp : employeeDetails) {
			System.out.println(emp);
		}
	}
}
