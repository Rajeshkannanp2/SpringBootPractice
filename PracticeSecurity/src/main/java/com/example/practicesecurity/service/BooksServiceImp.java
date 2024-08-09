package com.example.practicesecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practicesecurity.entity.Books;
import com.example.practicesecurity.repository.BooksRepository;

@Service
public class BooksServiceImp implements BooksService{
	
	@Autowired
	private BooksRepository booksRepository;

	public List<Books> findAllBooks(){
		return booksRepository.findAll();
	}
}
