package com.rajesh.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class InterviewQuestions {

	public static void main(String[] args) {
		/*You have a list of Employee objects. Each Employee has attributes such as name, age, 
		 * department, and salary. Your task is to write a Java program using Java 8 streams 
		 * to find the average salary of employees who belong to the "Engineering" department 
		 * and are aged between 25 and 35 years (inclusive). Additionally, print the names of 
		 * these employees.
		 */
		List<EmployeeDetails> empDetails = new ArrayList<>();
		empDetails.add(new EmployeeDetails("Rajesh", 25, "engineering", 45000));
		empDetails.add(new EmployeeDetails("Kannan", 27, "common", 34000));
		empDetails.add(new EmployeeDetails("Karpagam", 35, "engineering", 55000));
		empDetails.add(new EmployeeDetails("Vijay", 32, "common", 25000));
		empDetails.add(new EmployeeDetails("Venky", 21, "engineering", 35000));
		
		
		//calculate the average salary
		empDetails.stream()
		.filter(employee -> employee.getDepartment().equals("engineering"))
		.filter(age -> age.getAge()>=25 && age.getAge()<=35)
		.mapToDouble(EmployeeDetails::getSalary)
		.average()
		.ifPresent(
				average -> System.out.println("average salary"+ average)
				);
		
		empDetails.stream()
		.filter(emp-> emp.getDepartment().equals("engineering"))
		.filter(empage -> empage.getAge()>=25 && empage.getAge()<=35)
		.map(EmployeeDetails::getName)
		.distinct()
		.forEach(c->System.out.println(c));
	}
}
