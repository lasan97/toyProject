package com.toy.app.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.toy.app.exception.CustomException;
import com.toy.app.model.common.CustomResponse;

@RestControllerAdvice
public class CustomControllerAdvice {

	@ExceptionHandler(CustomException.class)
	public CustomResponse custom(CustomException e) {
		
		return new CustomResponse("400" , e.getMessage() , e.getDetails());
	}

}
