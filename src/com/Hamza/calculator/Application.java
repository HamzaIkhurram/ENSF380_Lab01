package com.Hamza.calculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //loop thats infinite will exit if thats whats told

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
                        // Validate input for permutation calculation
                        if (selectedItems > totalElements || totalElements < 0 || selectedItems < 0) {
                            System.out.println("Error: Cannot do this permutation calculation, Invalid entry.");
                        } else {
                            // Calculate permutations using both methods and display results
                            System.out.println("First Result: " + permutationRecursive(totalElements, selectedItems));
                            System.out.println("Second Result: " + permutationIterative(totalElements, selectedItems));
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

        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by 0 is not possible ");
            return Double.NaN;
        }
        return a / b;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double sqrt(double number) {
        return Math.sqrt(number);
    }

    public static double log(double number) {
        return Math.log(number);
    }

    public static double log10(double number) {
        return Math.log10(number);
    }

    public static double sin(double angleDegrees) {
        return Math.sin(Math.toRadians(angleDegrees));
    }

    public static double cos(double angleDegrees) {
        return Math.cos(Math.toRadians(angleDegrees));
    }

    public static double tan(double angleDegrees) {
        return Math.tan(Math.toRadians(angleDegrees));
    }

    // Factorial calculation with progress display
    public static long factorial(int num) {
        if (num < 0) {
            System.out.println("Factorial of a negative number is undefined.");
            return 0;
        }
        return factorialHelper(num, num);
    }

    private static long factorialHelper(int originalNum, int num) {
        if (num <= 1) {
            return 1;
        }
        // Calculate progress and update progress bar
        int progress = (int) (((originalNum - num + 1) / (double) originalNum) * 100);
        System.out.print("\rCalculating factorial: " + progress + "%");
        return num * factorialHelper(originalNum, num - 1);
    }

    // Recursive permutation calculation
    public static long permutationRecursive(int totalElements, int selectedItems) {
        if (selectedItems == 0) {
            return 1;
        }
        return totalElements * permutationRecursive(totalElements - 1, selectedItems - 1);
    }

    // Iterative permutation calculation
    public static long permutationIterative(int totalElements, int selectedItems) {
        long result = 1;
        for (int i = 0; i < selectedItems; i++) {
            result *= (totalElements - i);
        }
        return result;
    }
}









