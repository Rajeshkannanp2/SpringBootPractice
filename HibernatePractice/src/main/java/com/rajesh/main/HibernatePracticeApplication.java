package com.rajesh.main;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rajesh.main.dao.StudentDAO;
import com.rajesh.main.entity.Student;

@SpringBootApplication
public class HibernatePracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernatePracticeApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			
			//createStudent(studentDAO);
			
			//queryForStudent(studentDAO);
			
			//getStudentByLastName(studentDAO);
			
			//updateTheLastName(studentDAO);
			
			//deleteById(studentDAO);
			
			deleteAll(studentDAO);
			
		};
	}

	private void deleteAll(StudentDAO studentDAO) {
		int noOfRowDeleted = studentDAO.deleteAll();
		System.out.println(noOfRowDeleted);
	}

	private void deleteById(StudentDAO studentDAO) {
		// TODO Auto-generated method stub
		studentDAO.deleteById(4);
		
	}

	private void updateTheLastName(StudentDAO studentDAO) {

		int studentid = 1;
		
		Student myStudent = studentDAO.findById(studentid);
		
		myStudent.setLastName("SoftwareDeveloper");
		
		studentDAO.updateLastName(myStudent);
	}

	private void getStudentByLastName(StudentDAO studentDAO) {
		List<Student> listOfStudents = studentDAO.findByLastName("Pandiyan");
		for(Student listOfStudent:listOfStudents) {
			System.out.println(listOfStudent);
		}
	}

	private void queryForStudent(StudentDAO studentDAO) {
		// get the list of students
		List<Student> listOfStudents = studentDAO.findAll();
		
		//display the list of students
		
		for(Student listOfStudent:listOfStudents) {
			System.out.println(listOfStudent);
		}
	}

	private void createStudent(StudentDAO studentDAO) {
		//create a student object
		
		System.out.println("Creating new student object....");
		Student tempStudent = new Student("Vijay", "Pandiyan", "vijay@gmail.com");
		Student tempStudent1 = new Student("Sai", "Ram", "sai@gmail.com");
		Student tempStudent2 = new Student("Padma", "Raj", "Padma@gmail.com");		
		//save the student object
		System.out.println();
		studentDAO.save(tempStudent);
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		
		//display the id of saved student
		System.out.println("the student id is : "+tempStudent.getId());
	}
}
