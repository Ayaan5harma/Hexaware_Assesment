package com.hexaware.bankingsystem.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
	private int customerId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String address;
	public Customer() {
		super();
	}
	public Customer(int customerId, String firstName, String lastName, String emailAddress, String phoneNumber,
			String address) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void printCustomerInfo() {
		
		System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);

		
	}
	
	 public static boolean isValidEmail(String email) {
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
	                "[a-zA-Z0-9_+&*-]+)*@" +
	                "(?:[a-zA-Z0-9-]+\\.)+[a-z]" +
	                "{2,7}$";
	        Pattern emailPattern = Pattern.compile(emailRegex);
	        Matcher emailMatcher = emailPattern.matcher(email);
	        return emailMatcher.matches();
	    }
     
	 public static boolean isValidPhoneNumber(String phoneNumber) {
	        String phoneRegex = "^\\d{10}$";
	        Pattern phonePattern = Pattern.compile(phoneRegex);
	        Matcher phoneMatcher = phonePattern.matcher(phoneNumber);
	        return phoneMatcher.matches();
	    }

    

}
