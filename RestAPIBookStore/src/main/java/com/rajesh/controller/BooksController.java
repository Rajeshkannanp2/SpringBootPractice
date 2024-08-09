package com.rajesh.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.entity.Books;
import com.rajesh.service.BookService;

@RestController
public class BooksController {
	private BookService bookService;

	public BooksController(BookService theBookService) {
		bookService = theBookService;
	}
	
	@GetMapping("/books")
	public List<Books> booksList(Books theBooks) {
		return bookService.findAll();
	}
	
	@GetMapping("/books/{bookId}")
	public Books bookById(@PathVariable int bookId) {
		Books result = bookService.findById(bookId);
		if(result == null) {
			throw new RuntimeException("Book id not found in the database : " +bookId);
		}
		return result;
	}
	
	@PostMapping("books")
	public Books addBooks(@RequestBody Books theBooks){
		theBooks.setId(0);
		Books result = bookService.save(theBooks);
		return result;
	}
	
	@PutMapping("books")
	public Books updateBooks(@RequestBody Books theBooks){
		Books result = bookService.save(theBooks);
		return result;
	}
	
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable int bookId) {
		bookService.deleteById(bookId);
	}
}
