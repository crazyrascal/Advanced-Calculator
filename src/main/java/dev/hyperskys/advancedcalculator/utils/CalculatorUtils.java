package dev.hyperskys.advancedcalculator.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorUtils {

    public static void setup(String s_m71d9_5) {
        
        char operator;
        double num1;
        double num2 = 0;
        double answer = 0;

        if(s_m71d9_5.equalsIgnoreCase("defaultSetup")) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter first number in equation: ");

            try {
                num1 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("You did not enter a valid number!");
                return;
            }

            System.out.println("Please enter second number in equation: ");

            try {
                num2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("You did not enter a valid number!");
            }

            System.out.println("What type of operation would you like to use?: ");
            operator = scanner.next().charAt(0);

            if(0 == num2 && operator == '/') {
                System.out.println("You cannot divide by zero but personally I think its 0!");
                return;
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
        } else {
            System.out.println("You selected an improper setup method!");
        }

    }
    
}
