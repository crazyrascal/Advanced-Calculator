package dev.hyperskys.advancedcalculator.modes;

import dev.hyperskys.advancedcalculator.modes.main.CalculatorMode;
import dev.hyperskys.advancedcalculator.ui.main.MainMenu;
import dev.hyperskys.advancedcalculator.utils.modes.TriangleType;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TriangleMode implements CalculatorMode {

    static double width1;
    static double base1;
    static double base2;
    static double height2;
    static double width3;
    static double height3;

    public static void setupMode() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What are you trying to find input HELP for available options: ");
        String input = scanner.nextLine().toLowerCase(Locale.ROOT);

        switch (input)  {
            case "help":
                System.out.println("All available options: HEIGHT, WIDTH, BASE");
                System.out.println("Please press enter to redo...");
                scanner.nextLine();
                TriangleMode.setupMode();
                break;

            case "height":
                System.out.println("What is the width of the triangle?: ");
                try {base1 = scanner.nextDouble();} catch (InputMismatchException e){System.out.println("You did not enter a valid number!"); System.out.println("Please press enter to redo..."); scanner.nextLine(); TriangleMode.setupMode();}

                System.out.println("What is the base of the triangle?: ");
                try {width1 = scanner.nextDouble();} catch (InputMismatchException e){System.out.println("You did not enter a valid number!"); System.out.println("Please press enter to redo..."); scanner.nextLine(); TriangleMode.setupMode();}

                double solution = 180-base1-width1;
                if(solution > 0) {
                    System.out.println("The height of the triangle is "+solution);
                    System.out.println("The type of triangle is " + TriangleType.getType(width1, base1, solution));
                    System.out.println("Please press enter to return to the main menu...");
                    scanner.nextLine();
                    MainMenu.runMainMenu();
                } else {
                    System.out.println("One of your triangles angles are bigger than 90 degrees!");
                    System.out.println("Please press enter to redo...");
                    scanner.nextLine();
                    TriangleMode.setupMode();
                }
                break;

            case "width":
                System.out.println("What is the height of the triangle?: ");
                try {base2 = scanner.nextDouble();} catch (InputMismatchException e){System.out.println("You did not enter a valid number!"); System.out.println("Please press enter to redo..."); scanner.nextLine(); TriangleMode.setupMode();}

                System.out.println("What is the base of the triangle?: ");
                try {height2 = scanner.nextDouble();} catch (InputMismatchException e){System.out.println("You did not enter a valid number!"); System.out.println("Please press enter to redo..."); scanner.nextLine(); TriangleMode.setupMode();}

                double solution2 = 180-height2-base2;
                if(solution2 > 0) {
                    System.out.println("The width of the triangle is "+solution2);
                    System.out.println("The type of triangle is " + TriangleType.getType(height2, base2, solution2));
                    System.out.println("Please press enter to return to the main menu...");
                    MainMenu.runMainMenu();
                } else {
                    System.out.println("One of your triangles angles are bigger than 90 degrees!");
                    System.out.println("Please press enter to redo...");
                    TriangleMode.setupMode();
                }
                break;

            case "base":
                System.out.println("What is the height of the triangle?: ");
                try {height3 = scanner.nextDouble();} catch (InputMismatchException e){System.out.println("You did not enter a valid number!"); System.out.println("Please press enter to redo..."); scanner.nextLine(); TriangleMode.setupMode();}

                System.out.println("What is the width of the triangle?: ");
                try {width3 = scanner.nextDouble();} catch (InputMismatchException e){System.out.println("You did not enter a valid number!"); System.out.println("Please press enter to redo..."); scanner.nextLine(); TriangleMode.setupMode();}

                double solution3 = 180-height3-width3;
                if(solution3 > 0) {
                    System.out.println("The base of the triangle is "+solution3);
                    System.out.println("The type of triangle is " + TriangleType.getType(solution3, height3, width3));
                    System.out.println("Please press enter to return to the main menu...");
                    MainMenu.runMainMenu();
                } else {
                    System.out.println("One of your triangles angles appears to be larger than 90 degrees!");
                    System.out.println("Please press enter to redo...");
                    TriangleMode.setupMode();
                }
                break;

            default:
                System.out.println("Invalid Option, please make sure you are have inputted a correct type!");
                System.out.println("Please press enter to return to redo...");
                TriangleMode.setupMode();
        }
    }
}
