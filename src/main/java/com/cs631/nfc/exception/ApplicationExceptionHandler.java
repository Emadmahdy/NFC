package com.cs631.nfc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;

@ControllerAdvice
public class ApplicationExceptionHandler {

	@ExceptionHandler(ApplicationException.class)
	public String handelException() {
		System.out.println("in globale exception handeller"); 
		return "error";
	}
	
	@ExceptionHandler(LoginFailureException.class)
	public ResponseEntity handelLoginFailure(LoginFailureException ex) {
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ex.getMessage());
	}
}
