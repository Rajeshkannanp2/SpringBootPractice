package com.rajesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rajesh.dao.BooksRepository;
import com.rajesh.entity.Books;

@Service
public class BookServiceImpl implements BookService{
	
	private BooksRepository booksRepository;
	
	public BookServiceImpl(BooksRepository booksRepository) {
		super();
		this.booksRepository = booksRepository;
	}

	@Override
	public List<Books> findAll() {
		return booksRepository.findAll();
	}

	@Override
	public Books findById(int theId) {
		Optional<Books> result = booksRepository.findById(theId);
		Books theBooks=null;
		if(result.isPresent()) {
			theBooks = result.get();
		}else {
			throw new RuntimeException("Did not find book: "+ theId);
		}
		return theBooks;
	}

	@Override
	public Books save(Books theBooks) {
		booksRepository.save(theBooks);
		return null;
	}

	@Override
	public void deleteById(int theId) { 
		booksRepository.deleteById(theId);
	}

}
