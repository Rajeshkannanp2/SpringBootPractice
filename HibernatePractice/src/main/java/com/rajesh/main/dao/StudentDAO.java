package com.rajesh.main.dao;

import java.util.List;

import com.rajesh.main.entity.Student;

public interface StudentDAO {
	
	void save(Student theStudent);
	
	Student findById(Integer id);
	
	List<Student> findAll();
	
	List<Student> findByLastName(String LastName);
	
	void updateLastName(Student theStudent);
	
	void deleteById(Integer id);
	
	int deleteAll();

}
