package com.hexaware.bankingsystem.task14;

import java.sql.Date;
import java.util.List;

public interface ICustomerServiceProvider {
	float getAccountBalance(long accountNumber) throws InvalidAccountException;
    float deposit(long accountNumber, float amount) throws InvalidAccountException;
    float withdraw(long accountNumber, float amount) throws InsufficientFundException, InvalidAccountException, OverDraftLimitExcededException;
    float transfer(long fromAccountNumber, long toAccountNumber, float amount) throws InsufficientFundException, InvalidAccountException, OverDraftLimitExcededException;
    void getAccountDetails(long accountNumber) throws InvalidAccountException;
    List<Transaction> getTransactions(long accountNumber, Date fromDate, Date toDate) throws InvalidAccountException;

}
