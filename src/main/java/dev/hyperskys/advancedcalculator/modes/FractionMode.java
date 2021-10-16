package dev.hyperskys.advancedcalculator.modes;

import dev.hyperskys.advancedcalculator.modes.main.CalculatorMode;
import dev.hyperskys.advancedcalculator.ui.main.MainMenu;
import dev.hyperskys.advancedcalculator.utils.modes.Fraction;

import java.util.Scanner;

public class FractionMode implements CalculatorMode {

    public static final Scanner scanner = new Scanner(System.in);

    public static void setupMode() {

            while (true) { // ok no it wont throw an error its just being stupid
                String operation = getOperation();

                Fraction input1 = getFraction();
                Fraction input2 = getFraction();

                new Fraction(1, 1);
                Fraction output = null;

                switch (operation) {
                    case "=":
                        boolean result = input1.equals(input2);
                        System.out.println(input1.toString() + " " + operation + " " + input2.toString() + " = " + result);
                        System.out.println("Please press enter to return to the main menu...");
                        scanner.nextLine();
                        MainMenu.runMainMenu();
                        break;
                    case "-":
                        output = input1.subtract(input2);
                        break;
                    case "*":
                        output = input1.multiply(input2);
                        break;
                    case "/":
                        output = input1.divide(input2);
                        break;
                    default:
                        output = input1.add(input2);
                        break;
                }

                assert output != null;
                output.toLowestTerms();
                if(output.getDenominator() == 1){
                    int outInt = output.getNumerator();
                    System.out.println(input1.toString() + " " + operation + " " + input2.toString() + " = " + outInt);
                    System.out.println("Please press enter to return to the main menu...");
                    scanner.nextLine();
                    MainMenu.runMainMenu();
                }

                System.out.println(input1.toString() + " " + operation + " " + input2.toString() + " = " + output);
                System.out.println("Please press enter to return to the main menu...");
                scanner.nextLine();
                MainMenu.runMainMenu();
            }
        }

        public static String getOperation() {
            System.out.print("Please enter an operation (+, -, /, *, =): ");
            String operation = scanner.nextLine();

            if (!operation.equals("+") && !operation.equals("-") && !operation.equals("/") && !operation.equals("*") && !operation.equals("=")){
                System.out.print("Invalid input (+, -, /, *, =): ");
                operation = scanner.nextLine();
            }

            return operation;
        }

        public static boolean validFraction(String input) {
            if (input.contains("/")) {
                String[] inputParts = input.split("/");

                if (inputParts[0].matches("-?\\d+") && inputParts[1].matches("-?\\d+")) {
                    return Integer.parseInt(inputParts[1]) > 0;
                } else {
                    return false;
                }
            } else {
                return input.matches("-?\\d+");
            }
        }

        public static Fraction getFraction() {
            System.out.print("Please enter a fraction: ");
            String inputData = scanner.nextLine();

            while(!validFraction(inputData)){
                System.out.print("Invalid Fraction, enter a fraction (ex. 5/10): ");
                inputData = scanner.nextLine();
            }

            if(inputData.contains("/")){
                String[] inputParts = inputData.split("/");
                int numInput = Integer.parseInt(inputParts[0]);
                int denInput = Integer.parseInt(inputParts[1]);
                return new Fraction(numInput, denInput);
            } else{
                return new Fraction(Integer.parseInt(inputData), 1);
            }
        }

}
