package dev.hyperskys.advancedcalculator.modes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaseMode {

    static char operator;
    static double num1;
    static double num2 = 0;
    static double answer = 0;

    public static void setupMode() {
        Scanner scanner = new Scanner(System.in);

        { // User Questions
            System.out.println("Please enter first number in equation: ");
            try { num1 = scanner.nextDouble();} catch (InputMismatchException e) { System.out.println("You did not enter a valid number!"); }

            System.out.println("Please enter second number in equation: ");
            try { num2 = scanner.nextDouble();} catch (InputMismatchException e) { System.out.println("You did not enter a valid number!"); }

            System.out.println("What type of operation would you like to use?: ");
            operator = scanner.next().charAt(0);

            if(0 == num2 && operator == '/') {
                System.out.println("You cannot divide by zero but personally I think its 0!");
                return;
            }
        }

        switch(operator) {
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
                System.out.println("You did not enter a valid operation to use!");
                return;
        }

        System.out.println("Solution: " + num1 + " " + operator + " " + num2 + " = " + answer);
    }
}
