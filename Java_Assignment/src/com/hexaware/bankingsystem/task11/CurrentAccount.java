package com.hexaware.bankingsystem.task11;

public class CurrentAccount extends Account {

	 private float overdraftLimit;

	    public CurrentAccount(Customer customer, float accountBalance, float overdraftLimit) {
	        super(customer, "Current", accountBalance);
	        this.overdraftLimit = overdraftLimit;
	    }

	    public float getOverdraftLimit() {
	        return overdraftLimit;
	    }

	    public void setOverdraftLimit(float overdraftLimit) {
	        this.overdraftLimit = overdraftLimit;
	    }

}
