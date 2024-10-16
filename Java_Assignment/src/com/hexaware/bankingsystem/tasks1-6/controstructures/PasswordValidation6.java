package com.hexaware.bankingsystem.tasks.controstructures;

import java.util.ArrayList;
import java.util.Scanner;

class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}

public class PasswordValidation6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Transaction> transactions = new ArrayList<>();

        while (true) {
            System.out.println("\nBank Transaction Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline left-over
                    transactions.add(new Transaction("Deposit", depositAmount));
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline left-over
                    transactions.add(new Transaction("Withdrawal", withdrawalAmount));
                    break;
                case 3:
                    System.out.println("\nTransaction History:");
                    printTransactionHistory(transactions);
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void printTransactionHistory(ArrayList<Transaction> transactions) {
        double balance = 0;
        for (Transaction transaction : transactions) {
            String type = transaction.getType();
            double amount = transaction.getAmount();

            if (type.equals("Deposit")) {
                balance += amount;
            } else {
                balance -= amount;
            }

            System.out.printf("%s: $%.2f, Balance: $%.2f%n", type, amount, balance);
        }

        System.out.printf("Final Balance: $%.2f%n", balance);
    }
}
