package com.hexaware.bankingsystem.task7;




public class Bank {
     
	 public static void main(String[] args) {
	        // Create customer object
	        Customer customer = new Customer(1, "John", "Doe", "john.doe@example.com", "1234567890", "123 Main St");

	        // Create account object
	        Account account = new Account(12345, "Savings", 1000.0);

	        // Print customer and account information
	        customer.printCustomerInfo();
	        account.printAccountInfo();

	        // Deposit amount
	        account.deposit(500.0);

	        // Withdraw amount
	        account.withdraw(200.0);

	        // Calculate interest
	        account.calculateInterest();

	        // Print updated account information
	        account.printAccountInfo();
	    }




}


	
		 
