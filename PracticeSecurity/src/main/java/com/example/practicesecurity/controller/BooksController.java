package com.example.practicesecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practicesecurity.entity.Books;
import com.example.practicesecurity.service.BooksService;

@RestController
@RequestMapping("/api")
public class BooksController {
	
	@Autowired
	private BooksService booksService;
	
	@GetMapping("/books")
	public List<Books> findAllBooks(){
		return booksService.findAllBooks();
	}
}
