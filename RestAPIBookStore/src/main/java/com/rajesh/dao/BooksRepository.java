package com.rajesh.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajesh.entity.Books;

public interface BooksRepository  extends JpaRepository<Books, Integer>{

}
