package dev.hyperskys.advancedcalculator.ui.main.other;

import dev.hyperskys.advancedcalculator.ui.main.MainMenu;

import java.util.Locale;
import java.util.Scanner;

public class LearningMenu {
    public static void setupMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What are you trying to learn input HELP for all available options: ");
        String input = scanner.nextLine().toLowerCase(Locale.ROOT);

        switch (input) {

            case "fraction":
                System.out.println("When you are trying to solve a fraction problem you must do these steps");
                System.out.println(" ");
                System.out.println("1. When subtracting just go from left to right then go to the bottom and subtracting the numbers");
                System.out.println("2. When adding just go from left to right then go to the bottom and add the numbers the numbers");
                System.out.println("3. When multiplying just go from left to right then go to the bottom and multiply the numbers");
                System.out.println("4. When dividing just go from left to right and go to the bottom and divide the numbers");
                System.out.println(" ");
                System.out.println("Please press enter to return to the main menu...");
                scanner.nextLine();
                MainMenu.runMainMenu();
                break;

            case "triangle":
                System.out.println("When you are trying to find the length of a triangle you must follow these steps.");
                System.out.println(" ");
                System.out.println("1. Take the first angle and the second angle then add them together");
                System.out.println("2. Then subtract the sum by 180 to get the missing angle of the triangle");
                System.out.println(" ");
                System.out.println("Please press enter to return to the main menu...");
                scanner.nextLine();
                MainMenu.runMainMenu();
                break;

            case "help":
                System.out.println("All available options: Triangle and Fraction");
                System.out.println("Please press enter to return to redo...");
                scanner.nextLine();
                LearningMenu.setupMenu();
                break;

            default:
                System.out.println("You did not enter a valid learning option!");
                System.out.println("Please press enter to redo...");
                scanner.nextLine();
                LearningMenu.setupMenu();
                break;
        }
    }
}
