package com.rajesh.main.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<StudentErrorReponse> handleException(StudentNotFoundException exc){
		//create student error response
		StudentErrorReponse error = new StudentErrorReponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		
		//return the respose
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<StudentErrorReponse> handleException(Exception exc){
		//create student error response
		StudentErrorReponse error = new StudentErrorReponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exc.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		
		//return the respose
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
