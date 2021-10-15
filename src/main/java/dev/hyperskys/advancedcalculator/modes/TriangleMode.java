package dev.hyperskys.advancedcalculator.modes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleMode {

    static double width1;
    static double base1;
    static double base2;
    static double height2;
    static double width3;
    static double height3;

    public static void setupMode() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What are you trying to find input HELP for available options: ");
        String input = scanner.nextLine();

        switch (input)  {
            case "HELP":
                System.out.println("All available options: HEIGHT, WIDTH, BASE");
                scanner.close();
                break;

            case "HEIGHT":
                System.out.println("What is the width of the triangle?: ");
                try {width1 = scanner.nextDouble();} catch (InputMismatchException e){System.out.println("You did not enter a valid number!");}

                System.out.println("What is the base of the triangle?: ");
                try {base1 = scanner.nextDouble();} catch (InputMismatchException e){System.out.println("You did not enter a valid number!");}

                double solution = 180-base1-width1;
                if(solution > 0) {
                    System.out.println("The height of the triangle is "+solution);
                } else {
                    System.out.println("One of your triangles angles are bigger than 90 degrees!");
                }
                break;

            case "WIDTH":
                System.out.println("What is the height of the triangle?: ");
                try {height2 = scanner.nextDouble();} catch (InputMismatchException e){System.out.println("You did not enter a valid number!");}

                System.out.println("What is the base of the triangle?: ");
                try {base2 = scanner.nextDouble();} catch (InputMismatchException e){System.out.println("You did not enter a valid number!");}

                double solution2 = 180-height2-base2;
                if(solution2 > 0) {
                    System.out.println("The width of the triangle is "+solution2);
                } else {
                    System.out.println("One of your triangles angles are bigger than 90 degrees!");
                }
                break;

            case "BASE":
                System.out.println("What is the height of the triangle?: ");
                try {height3 = scanner.nextDouble();} catch (InputMismatchException e){System.out.println("You did not enter a valid number!");}

                System.out.println("What is the width of the triangle?: ");
                try {width3 = scanner.nextDouble();} catch (InputMismatchException e){System.out.println("You did not enter a valid number!");}

                double solution3 = 180-height3-width3;
                if(solution3 > 0) {
                    System.out.println("The base of the triangle is "+solution3);
                } else {
                    System.out.println("One of your triangles angles are bigger than 90 degrees!");
                }
                break;

            default:
                System.out.println("Invalid Option, please make sure you are using all Capital Letters!");
                scanner.close();
        }
    }
}
