package com.rajesh.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajesh.entity.Books;
import com.rajesh.repository.BookRepository;
import com.rajesh.service.BooksService;

@Service
public class BookServiceImp implements BooksService{
	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Books> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Books findById(int id) {
		// TODO Auto-generated method stub
		Optional<Books> books = bookRepository.findById(null);
		Books theBooks = null;
		if(books.isPresent()) {
			theBooks = books.get(); 
		}else {
			//throw error
		}
		return theBooks;
	}

	@Override
	public Books save(Books theBooks) {
		return bookRepository.save(theBooks);
	}

	@Override
	public void deleteById(int id) {
		bookRepository.deleteById(id);
	}
	

	
}
