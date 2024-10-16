package com.hexaware.bankingsystem.task11;

public class Account {
	   protected static long lastAccNo = 1001;
	    protected long accountNumber;
	    protected String accountType;
	    protected float accountBalance;
	    protected Customer customer;
	    
	   
		public Account(long accountNumber, String accountType, float accountBalance, Customer customer) {
			super();
			this.accountNumber = accountNumber;
			this.accountType = accountType;
			this.accountBalance = accountBalance;
			this.customer = customer;
		}
		
		
		public static long getLastAccNo() {
			return lastAccNo;
		}
		public static void setLastAccNo(long lastAccNo) {
			Account.lastAccNo = lastAccNo;
		}
		public long getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public float getAccountBalance() {
			return accountBalance;
		}
		public void setAccountBalance(float accountBalance) {
			this.accountBalance = accountBalance;
		}
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		

		

}
