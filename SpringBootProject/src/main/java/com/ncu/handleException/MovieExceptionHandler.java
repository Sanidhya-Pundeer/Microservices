package com.ncu.handleException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


class MyError{
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}

@ControllerAdvice
public class MovieExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity handleExceptionHandler(RuntimeException e) {
		System.out.println("Exception Occurred");
		return ResponseEntity.status(500).body(e.getMessage());
	}
}
