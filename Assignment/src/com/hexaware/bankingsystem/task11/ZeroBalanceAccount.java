package com.hexaware.bankingsystem.task11;

public class ZeroBalanceAccount extends Account {
	 public ZeroBalanceAccount(Customer customer) {
	        super(customer, "ZeroBalance", 0);
	    }

}
