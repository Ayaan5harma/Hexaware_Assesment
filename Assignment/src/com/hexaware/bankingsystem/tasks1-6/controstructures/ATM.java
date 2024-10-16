package com.hexaware.bankingsystem.tasks.controstructures;

import java.util.Scanner;

public class ATM {
    private double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Available Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else if (amount % 100 != 0 && amount % 500 != 0) {
            System.out.println("Withdrawal amount must be in multiples of 100 or 500.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your current balance: $");
        double balance = scanner.nextDouble();

        ATM atm = new ATM(balance);

        while (true) {
            System.out.println("\nATM Options:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}

