package com.Hamza.calculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Infinite loop to keep the calculator running until 'exit' is entered
        while (true) {
            // Prompt the user to enter an operation
            System.out.println("\nEnter operation (add, subtract, multiply, divide, pow, sqrt, log, log10, sin, cos, tan, factorial, permutation) or 'exit' to quit:");
            String operation = scanner.next();

            // Check if the user wants to exit
            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Exiting calculator...");
                break;
            }

            // For operations requiring two inputs
            if (operation.equalsIgnoreCase("add") || operation.equalsIgnoreCase("subtract") || operation.equalsIgnoreCase("multiply")
                    || operation.equalsIgnoreCase("divide") || operation.equalsIgnoreCase("pow") || operation.equalsIgnoreCase("permutation")) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                // Switch statement to handle different operations requiring two inputs
                switch (operation.toLowerCase()) {
                    case "add":
                        System.out.println("Result: " + add(num1, num2));
                        break;
                    case "subtract":
                        System.out.println("Result: " + subtract(num1, num2));
                        break;
                    case "multiply":
                        System.out.println("Result: " + multiply(num1, num2));
                        break;
                    case "divide":
                        System.out.println("Result: " + divide(num1, num2));
                        break;
                    case "pow":
                        System.out.println("Result: " + power(num1, num2));
                        break;
                    case "permutation":
                        int totalElements = (int) num1;
                        int selectedItems = (int) num2;
                        // Check for invalid inputs for permutation calculation
                        if (selectedItems > totalElements || totalElements < 0 || selectedItems < 0 || totalElements > 100) {
                            System.out.println("Error: Invalid input for permutation calculation.");
                        } else {
                            // Perform permutation calculation and display results
                            System.out.println("Recursive Result: " + permutationRecursive(totalElements, selectedItems));
                            System.out.println("Iterative Result: " + permutationIterative(totalElements, selectedItems));
                        }
                        break;
                    default:
                        System.out.println("Invalid operation.");
                        break;
                }
            } else {
                // For operations requiring one input
                System.out.print("Enter number: ");
                double num = scanner.nextDouble();

                // Switch statement to handle different operations requiring one input
                switch (operation.toLowerCase()) {
                    case "sqrt":
                        System.out.println("Result: " + sqrt(num));
                        break;
                    case "log":
                        System.out.println("Result: " + log(num));
                        break;
                    case "log10":
                        System.out.println("Result: " + log10(num));
                        break;
                    case "sin":
                        System.out.println("Result: " + sin(num));
                        break;
                    case "cos":
                        System.out.println("Result: " + cos(num));
                        break;
                    case "tan":
                        System.out.println("Result: " + tan(num));
                        break;
                    case "factorial":
                        System.out.println("Result: " + factorial((int) num));
                        break;
                    default:
                        System.out.println("Invalid operation.");
                        break;
                }
            }
        }

        // Close the scanner to free up resources
        scanner.close();
    }

    // Method to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to subtract the second number from the first
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide the first number by the second
    public static double divide(double a, double b) {
        if (b == 0) {
            // Handle division by zero
            System.out.println("Error: Division by zero");
            return Double.NaN; // Return NaN to indicate an error
        }
        return a / b;
    }

    // Method to calculate the power of a base raised to an exponent
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Method to calculate the square root of a number
    public static double sqrt(double number) {
        return Math.sqrt(number);
    }

    // Method to calculate the natural logarithm of a number
    public static double log(double number) {
        return Math.log(number);
    }

    // Method to calculate the base-10 logarithm of a number
    public static double log10(double number) {
        return Math.log10(number);
    }

    // Method to calculate the sine of an angle in degrees
    public static double sin(double angleDegrees) {
        return Math.sin(Math.toRadians(angleDegrees));
    }

    // Method to calculate the cosine of an angle in degrees
    public static double cos(double angleDegrees) {
        return Math.cos(Math.toRadians(angleDegrees));
    }

    // Method to calculate the tangent of an angle in degrees
    public static double tan(double angleDegrees) {
        return Math.tan(Math.toRadians(angleDegrees));
    }

    // Method to calculate the factorial of a number with progress display
    public static long factorial(int num) {
        if (num < 0) {
            System.out.println("Factorial of negative number is undefined.");
            return 0;
        }
        return factorialHelper(num, num);
    }

    // Helper method to calculate the factorial of a number recursively
    private static long factorialHelper(int originalNum, int num) {
        if (num <= 1) {
            return 1;
        }
        // Calculate progress and update progress bar
        int progress = (int) (((originalNum - num + 1) / (double) originalNum) * 100);
        System.out.print("\rCalculating factorial: " + progress + "%");
        return num * factorialHelper(originalNum, num - 1);
    }

    // Recursive method to calculate the number of permutations
    public static long permutationRecursive(int totalElements, int selectedItems) {
        if (selectedItems == 0) {
            return 1; // Base case: If no items are selected, there's only one way to do nothing
        }
        return totalElements * permutationRecursive(totalElements - 1, selectedItems - 1);
    }

    // Iterative method to calculate the number of permutations
    public static long permutationIterative(int totalElements, int selectedItems) {
        long result = 1;
        for (int i = 0; i < selectedItems; i++) {
            result *= (totalElements - i);
        }
        return result;
    }
}







