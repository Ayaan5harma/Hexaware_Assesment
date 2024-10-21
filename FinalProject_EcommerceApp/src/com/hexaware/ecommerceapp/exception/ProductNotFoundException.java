package com.hexaware.ecommerceapp.exception;

/**
 * Custom exception class for product not found scenarios.
 * 
 * Extends the built-in Exception class to provide a specific exception type.
 * 
 * 
 *  Date : 18/10/24
 * 
 */

public class ProductNotFoundException extends RuntimeException{
	private String message;
	public ProductNotFoundException(String message) {
		super();
		this.message = message;
		
	}
	
	public  String getMessage() {
		return message;
	}

}