package dev.hyperskys.calculator.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorUtils {

    public static void setup(String s_m71d9_5){

        // Variables \\
        char operator;
        int num1;
        int num2 = 0;
        double answer = 0;
        // Variables \\

        Scanner scanner = new Scanner(System.in); // Creates a scanner

        System.out.println("Please enter first number in equation: ");

        try { // This stops users from putting letters not numbers! ( Error prevention )
            num1 = scanner.nextInt(); // Defines what num1 is
        } catch (InputMismatchException e){
            System.out.println("Error 500, You didn't enter a correct number!"); // Error code 500
            return;
        }

        System.out.println("Please enter second number in equation: ");

        try {
            num2 = scanner.nextInt(); // Defines what num2 is
        } catch (InputMismatchException e){
            System.out.println("Error 500, You didn't enter a correct number!"); // Error code 501
        }

        System.out.println("What operation to use: ");
        operator = scanner.next().charAt(0); // Defines what operator

        if(0 == num2 && operator == '/'){ // Checks if they are dividing by zero
            System.out.println("Error 501, You cannot divide by zero!");
            return;
        }

        switch(operator) { // Switch statement for operators

            case '+':
                answer = num1 + num2;
                break;

            case '-':
                answer = num1 - num2;
                break;

            case '*':
                answer = num1 * num2;
                break;

            case '/':
                answer = num1 / num2;
                break;

            default: // If they didn't enter a correct operator
                System.out.println("Error 502, You didn't enter a correct operator!");
                System.out.println("Usages: '-', '+', '/', '*'");
                return;
        }

            System.out.println("-----------------------");
            System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
            System.out.println("-----------------------");
    }
    
}
