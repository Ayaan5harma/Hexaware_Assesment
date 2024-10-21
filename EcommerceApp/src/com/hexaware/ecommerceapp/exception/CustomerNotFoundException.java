package com.hexaware.ecommerceapp.exception;

/**
 * Custom exception class for customer not found scenarios.
 * 
 * Extends the built-in Exception class to provide a specific exception type.
 * 
 * 
 *  Date : 18/10/24
 * 
 */


public class CustomerNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String message;
	public CustomerNotFoundException(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}