package com.rajesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajesh.entity.Books;

public interface BookRepository extends JpaRepository<Books, Integer>{

}
