package com.Hamza.calculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Infinite loop to keep the calculator running until 'exit' is entered
        while (true) {
            // Prompt the user to enter an operation
            System.out.println("Enter operation (add, subtract, multiply, divide, pow, sqrt, log, log10, sin, cos, tan, factorial) or 'exit' to quit:");
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

                case "pow":
                    // Prompt the user to enter the base number
                    System.out.println("Enter the base:");
                    double base = scanner.nextDouble();
                    // Prompt the user to enter the exponent
                    System.out.println("Enter the exponent:");
                    double exponent = scanner.nextDouble();
                    // Perform power calculation and display the result
                    System.out.println("Result: " + pow(base, exponent));
                    break;

                case "sqrt":
                    // Prompt the user to enter a number for square root calculation
                    System.out.println("Enter a number:");
                    double numSqrt = scanner.nextDouble();
                    // Calculate square root and display the result
                    System.out.println("Result: " + sqrt(numSqrt));
                    break;

                case "log":
                    // Prompt the user to enter a number for natural logarithm calculation
                    System.out.println("Enter a number:");
                    double numLog = scanner.nextDouble();
                    // Calculate natural logarithm and display the result
                    System.out.println("Result: " + log(numLog));
                    break;

                case "log10":
                    // Prompt the user to enter a number for base-10 logarithm calculation
                    System.out.println("Enter a number:");
                    double numLog10 = scanner.nextDouble();
                    // Calculate base-10 logarithm and display the result
                    System.out.println("Result: " + log10(numLog10));
                    break;

                case "sin":
                    // Prompt the user to enter an angle in degrees
                    System.out.println("Enter an angle in degrees:");
                    double angleSin = scanner.nextDouble();
                    // Calculate sine of the angle and display the result
                    System.out.println("Result: " + sin(angleSin));
                    break;

                case "cos":
                    // Prompt the user to enter an angle in degrees
                    System.out.println("Enter an angle in degrees:");
                    double angleCos = scanner.nextDouble();
                    // Calculate cosine of the angle and display the result
                    System.out.println("Result: " + cos(angleCos));
                    break;

                case "tan":
                    // Prompt the user to enter an angle in degrees
                    System.out.println("Enter an angle in degrees:");
                    double angleTan = scanner.nextDouble();
                    // Calculate tangent of the angle and display the result
                    System.out.println("Result: " + tan(angleTan));
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

    // Method to calculate the power of a base raised to an exponent
    public static double pow(double base, double exponent) {
        return Math.pow(base, exponent); // Return the result of base raised to the power of exponent
    }

    // Method to calculate the square root of a number
    public static double sqrt(double num) {
        return Math.sqrt(num); // Return the square root of the number
    }

    // Method to calculate the natural logarithm of a number
    public static double log(double num) {
        return Math.log(num); // Return the natural logarithm of the number
    }

    // Method to calculate the base-10 logarithm of a number
    public static double log10(double num) {
        return Math.log10(num); // Return the base-10 logarithm of the number
    }

    // Method to calculate the sine of an angle in degrees
    public static double sin(double angle) {
        return Math.sin(Math.toRadians(angle)); // Convert angle to radians and return the sine value
    }

    // Method to calculate the cosine of an angle in degrees
    public static double cos(double angle) {
        return Math.cos(Math.toRadians(angle)); // Convert angle to radians and return the cosine value
    }

    // Method to calculate the tangent of an angle in degrees
    public static double tan(double angle) {
        return Math.tan(Math.toRadians(angle)); // Convert angle to radians and return the tangent value
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





