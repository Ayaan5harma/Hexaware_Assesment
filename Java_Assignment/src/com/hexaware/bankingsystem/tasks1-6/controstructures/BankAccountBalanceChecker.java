package com.hexaware.bankingsystem.tasks.controstructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAccountBalanceChecker{

    private Map<String, Double> accounts;
    private Scanner scanner;

    public BankAccountBalanceChecker() {
        accounts = new HashMap<>();
        accounts.put("12345", 1000.0);
        accounts.put("67890", 500.0);
        accounts.put("34567", 2000.0);
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.print("Enter your account number (or 'exit' to quit): ");
            String accountNumber = scanner.next();

            if (accountNumber.equalsIgnoreCase("exit")) {
                break;
            }

            if (accounts.containsKey(accountNumber)) {
                System.out.printf("Account balance: $%.2f%n", accounts.get(accountNumber));
            } else {
                System.out.println("Invalid account number. Please try again.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
    	BankAccountBalanceChecker checker = new BankAccountBalanceChecker();
        checker.run();
    }
}