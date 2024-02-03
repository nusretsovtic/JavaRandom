package PogodiBroj;

import java.util.Scanner; // Import the Scanner class for user input

public class ScannerPrvi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        System.out.println("Welcome to the Basic Calculator!");

        // Prompt for and read the first number
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        // Prompt for and read the second number
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Prompt for and read the desired operation
        System.out.println("Choose an operation (+, -, *, /): ");
        String operation = scanner.next();

        // Perform the chosen operation
        switch (operation) {
            case "+":
                System.out.println("Result: " + (number1 + number2));
                break;
            case "-":
                System.out.println("Result: " + (number1 - number2));
                break;
            case "*":
                System.out.println("Result: " + (number1 * number2));
                break;
            case "/":
                if (number2 != 0) {
                    System.out.println("Result: " + (number1 / number2));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose +, -, *, or /.");
                break;
        }

        scanner.close(); // Close the scanner
    }
}

