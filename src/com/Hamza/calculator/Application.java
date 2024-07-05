package com.Hamza.calculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Infinite loop to keep the calculator running until 'exit' is entered
        while (true) {
            // Prompt the user to enter an operation
            System.out.println("Enter operation (add, subtract, multiply, divide, factorial) or 'exit' to quit:");
            String operation = scanner.next();

            // Check if the user wants to exit
            if (operation.equalsIgnoreCase("exit")) {
                break;
            }

            // Switch statement to handle different operations
            switch (operation.toLowerCase()) {
                case "add":
                    // Prompt the user to enter the first operand for addition
                    System.out.println("Enter the first operand:");
                    double addNum1 = scanner.nextDouble();
                    // Prompt the user to enter the second operand for addition
                    System.out.println("Enter the second operand:");
                    double addNum2 = scanner.nextDouble();
                    // Perform addition and display the result
                    System.out.println("Result: " + add(addNum1, addNum2));
                    break;

                case "subtract":
                    // Prompt the user to enter the first operand for subtraction
                    System.out.println("Enter the first operand:");
                    double subNum1 = scanner.nextDouble();
                    // Prompt the user to enter the second operand for subtraction
                    System.out.println("Enter the second operand:");
                    double subNum2 = scanner.nextDouble();
                    // Perform subtraction and display the result
                    System.out.println("Result: " + subtract(subNum1, subNum2));
                    break;

                case "multiply":
                    // Prompt the user to enter the first operand for multiplication
                    System.out.println("Enter the first operand:");
                    double mulNum1 = scanner.nextDouble();
                    // Prompt the user to enter the second operand for multiplication
                    System.out.println("Enter the second operand:");
                    double mulNum2 = scanner.nextDouble();
                    // Perform multiplication and display the result
                    System.out.println("Result: " + multiply(mulNum1, mulNum2));
                    break;

                case "divide":
                    // Prompt the user to enter the first operand for division
                    System.out.println("Enter the first operand:");
                    double divNum1 = scanner.nextDouble();
                    // Prompt the user to enter the second operand for division
                    System.out.println("Enter the second operand:");
                    double divNum2 = scanner.nextDouble();
                    // Perform division and display the result
                    System.out.println("Result: " + divide(divNum1, divNum2));
                    break;

                case "factorial":
                    // Prompt the user to enter a number for factorial calculation
                    System.out.println("Enter a number:");
                    double number = scanner.nextDouble();
                    // Calculate factorial and display the result
                    System.out.println("Result: " + factorial(number));
                    break;

                default:
                    // Handle invalid operations
                    System.out.println("Invalid operation.");
                    break;
            }
        }

        // Close the scanner to free up resources
        scanner.close();
    }

    // Method to add two numbers
    public static double add(double a, double b) {
        return a + b; // Return the sum of a and b
    }

    // Method to subtract the second number from the first
    public static double subtract(double a, double b) {
        return a - b; // Return the difference between a and b
    }

    // Method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b; // Return the product of a and b
    }

    // Method to divide the first number by the second
    public static double divide(double a, double b) {
        if (b == 0) {
            // Handle division by zero
            System.out.println("Error: Division by 0 is not possible");
            return Double.NaN; // Return NaN to indicate an error
        }
        return a / b; // Return the quotient of a and b
    }

    // Method to calculate the factorial of a number
    public static double factorial(double n) {
        if (n <= 1) {
            return 1; // Return 1 for the base case
        } else {
            return n * factorial(n - 1); // Recursively calculate the factorial
        }
    }
}







