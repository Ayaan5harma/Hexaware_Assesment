package com.hexaware.bankingsystem.task14;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceProviderImpl implements ICustomerServiceProvider {
    private Map<Long, Account> accounts;

    public CustomerServiceProviderImpl() {
        this.accounts = new HashMap<>();
    }

   
    @Override
    public float getAccountBalance(long accountNumber) throws InvalidAccountException {
    Account account = accounts.get(accountNumber);
    if (account == null) {
    throw new InvalidAccountException("Account not found");
    }
    return account.getAccountBalance();
    }

    public float deposit(long accountNumber, float amount) throws InvalidAccountException {
    	Account account = accounts.get(accountNumber);
    	if (account == null) {
    	throw new InvalidAccountException("Account not found");
    	}
    	account.setAccountBalance(account.getAccountBalance() + amount);
    	return account.getAccountBalance();
    	}

    @Override
    public float withdraw(long accountNumber, float amount) throws InsufficientFundException, InvalidAccountException, OverDraftLimitExcededException {
    Account account = accounts.get(accountNumber);
    if (account == null) {
    throw new InvalidAccountException("Account not found");
    }
    if (account.getAccountBalance() < amount) {
    throw new InsufficientFundException("Insufficient funds");
    }
    if (account instanceof CurrentAccount) {
    CurrentAccount currentAccount = (CurrentAccount) account;
    if (currentAccount.getAccountBalance() - amount < -currentAccount.getOverdraftLimit()) {
    throw new OverDraftLimitExcededException("Overdraft limit exceeded");
    }
    }
    account.setAccountBalance(account.getAccountBalance() - amount);
    return account.getAccountBalance();
    }

     

@Override
public float transfer(long fromAccountNumber, long toAccountNumber, float amount) throws InsufficientFundException, InvalidAccountException, OverDraftLimitExcededException {
Account fromAccount = accounts.get(fromAccountNumber);
Account toAccount = accounts.get(toAccountNumber);
if (fromAccount == null || toAccount == null) {
throw new InvalidAccountException("Account not found");
}
if (fromAccount.getAccountBalance() < amount) {
throw new InsufficientFundException("Insufficient funds");
}
if (fromAccount instanceof CurrentAccount) {
CurrentAccount currentAccount = (CurrentAccount) fromAccount;
if (currentAccount.getAccountBalance() - amount < -currentAccount.getOverdraftLimit()) {
throw new OverDraftLimitExcededException("Overdraft limit exceeded");
}
}
fromAccount.setAccountBalance(fromAccount.getAccountBalance() - amount);
toAccount.setAccountBalance(toAccount.getAccountBalance() + amount);
return toAccount.getAccountBalance();
}

    @Override
    public void getAccountDetails(long accountNumber) throws InvalidAccountException {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new InvalidAccountException("Account not found");
        }
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Account Balance: " + account.getAccountBalance());
        System.out.println("Customer Name: " + account.getCustomer().getFirstName() + " " + account.getCustomer().getLastName());
        System.out.println("Customer Email: " + account.getCustomer().getEmailAddress());
        System.out.println("Customer Phone Number: " + account.getCustomer().getPhoneNumber());
        System.out.println("Customer Address: " + account.getCustomer().getAddress());
    }
    public List<Transaction> getTransactions(long accountNumber, Date fromDate, Date toDate) throws InvalidAccountException {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new InvalidAccountException("Account not found");
        }
        // implement transaction retrieval logic
        return new ArrayList<>();
    }

	
}
