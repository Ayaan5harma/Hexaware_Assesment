package com.hexaware.ecommerceapp.exception;


/**
 * Custom exception class for Order not found scenarios.
 * 
 * Extends the built-in Exception class to provide a specific exception type.
 * 
 * 
 *  Date : 18/10/24
 * 
 */
public class OrderNotFoundException extends RuntimeException{
	private String message;
	public OrderNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}

