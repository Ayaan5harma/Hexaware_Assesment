package com.hexaware.bankingsystem.task10;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner scanner = new Scanner(System.in);

		    while (true) {
		        System.out.println("Banking System");
		        System.out.println("1. Create Account");
		        System.out.println("2. Deposit");
		        System.out.println("3. Withdraw");
		        System.out.println("4. Transfer");
		        System.out.println("5. Get Account Balance");
		        System.out.println("6. Get Account Details");
		        System.out.println("7. Exit");

		        System.out.print("Choose an option: ");
		        int option = scanner.nextInt();

		        switch (option) {
	            case 1:
	                createAccount(bank, scanner);
	                break;
	            case 2:
	                deposit(bank, scanner);
	                break;
	            case 3:
	                withdraw(bank, scanner);
	                break;
	            case 4:
	                transfer(bank, scanner);
	                break;
	            case 5:
	                getAccountBalance(bank, scanner);
	                break;
	            case 6:
	                getAccountDetails(bank, scanner);
	                break;
	            case 7:
	                System.exit(0);
	                break;
	            default:
	                System.out.println("Invalid option");
	        }
	    }
	}

private static void createAccount(Bank bank, Scanner scanner) {
    System.out.print("Enter customer name: ");
    String customerName = scanner.next();
    System.out.print("Enter customer email: ");
    String customerEmail = scanner.next();
    System.out.print("Enter customer phone number: ");
    String customerPhoneNumber = scanner.next();
    System.out.print("Enter customer address: ");
    String customerAddress = scanner.next();
    System.out.print("Enter account type (Savings/Current): ");
    String accountType = scanner.next();
    System.out.print("Enter initial balance: ");
    float initialBalance = scanner.nextFloat();

    Customer customer = new Customer(1, customerName, "", customerEmail, customerPhoneNumber, customerAddress);
    bank.createAccount(customer, accountType, initialBalance);
    System.out.println("Account created successfully");
}
private static void deposit(Bank bank, Scanner scanner) {
    System.out.print("Enter account number: ");
    long accountNumber = scanner.nextLong();
    System.out.print("Enter amount to deposit: ");
    float amount = scanner.nextFloat();

    float balance = bank.deposit(accountNumber, amount);
    if (balance != -1) {
        System.out.println("Deposit successful. New balance: " + balance);
    }
}

private static void withdraw(Bank bank, Scanner scanner) {
    System.out.print("Enter account number: ");
    long accountNumber = scanner.nextLong();
    System.out.print("Enter amount to withdraw: ");
    float amount = scanner.nextFloat();

    float balance = bank.withdraw(accountNumber, amount);
    if (balance != -1) {
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}
private static void transfer(Bank bank, Scanner scanner) {
    System.out.print("Enter from account number: ");
    long fromAccountNumber = scanner.nextLong();
    System.out.print("Enter to account number: ");
    long toAccountNumber = scanner.nextLong();
    System.out.print("Enter amount to transfer: ");
    float amount = scanner.nextFloat();

    float balance = bank.transfer(fromAccountNumber, toAccountNumber, amount);
    if (balance != -1) {
        System.out.println("Transfer successful. New balance: " + balance);
    }
}

private static void getAccountBalance(Bank bank, Scanner scanner) {
    System.out.print("Enter account number: ");
    long accountNumber = scanner.nextLong();

    float balance = bank.getAccountBalance(accountNumber);
    if (balance != -1) {
        System.out.println("Account balance: " + balance);
    }
}

private static void getAccountDetails(Bank bank, Scanner scanner) {
    System.out.print("Enter account number: ");
    long accountNumber = scanner.nextLong();

    bank.getAccountDetails(accountNumber);
}

}
