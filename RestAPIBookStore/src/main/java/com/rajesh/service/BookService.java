package com.rajesh.service;

import java.util.List;

import com.rajesh.entity.Books;

public interface BookService {
	
	List<Books> findAll();
	
	Books findById(int theId);
	
	Books save(Books theBooks);
	
	void deleteById(int theId);
	
	
/*List<Employee> findAll();
	
	Employee findById(int theId);
	
	Employee save(Employee theEmployee);
	
	void deleteById(int theId);*/
}
