package com.hexaware.bankingsystem.tasks.controstructures;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Create a password for your bank account: ");
            String password = scanner.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Password is valid. Account created successfully.");
                break;
            } else {
                System.out.println("Password is not valid. Please try again.");
            }
        }

        scanner.close();
    }

    private static boolean isValidPassword(String password) {
        boolean hasUppercase = false;
        boolean hasDigit = false;

        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            return false;
        }

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        if (!hasUppercase) {
            System.out.println("Password must contain at least one uppercase letter.");
            return false;
        }

        if (!hasDigit) {
            System.out.println("Password must contain at least one digit.");
            return false;
        }

        return true;
    }
}