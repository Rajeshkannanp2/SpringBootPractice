package com.rajesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.entity.Books;
import com.rajesh.service.BooksService;

@RestController
@RequestMapping("/api")
public class LibraryController {
	
	@Autowired
	private BooksService booksService;
	
	@GetMapping("/books")
	public List<Books> findAllBooks() {
		return booksService.findAll();
	}
	
	@GetMapping("/books/{id}")
	public Books findById(@PathVariable int id) {
		return booksService.findById(id);
	}
}
