package com.rajesh.service;

import java.util.List;

import com.rajesh.entity.Books;
import com.rajesh.entity.Users;

public interface BooksService {
	public List<Books> findAll();
	Books findById(int id);
	Books save(Books theBooks);
	void deleteById(int id);
}
