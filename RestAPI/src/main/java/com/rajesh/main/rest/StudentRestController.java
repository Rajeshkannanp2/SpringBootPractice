package com.rajesh.main.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.main.entity.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;	
	
	@PostConstruct
	public void loadData() {
		theStudents = new ArrayList<Student>();
		theStudents.add(new Student("Rajesh", "kannan"));
		theStudents.add(new Student("Ramesh", "kannan"));
		theStudents.add(new Student("Ranish", "kannan"));
		theStudents.add(new Student("Rakesh", "kannan"));
	}
	
	@GetMapping("/students")
	public List<Student> studentDetails() {
		return theStudents;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		//to check the studentId against the student size
		if((studentId>=theStudents.size()) || studentId<0) {
			throw new StudentNotFoundException("the student id not found - "+studentId);
		}
		
		return theStudents.get(studentId);
	}
	
	//Add an exception handler using @ExceptionHanlder
	
	
}
