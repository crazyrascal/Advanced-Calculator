package dev.hyperskys.advancedcalculator.ui.main;

import dev.hyperskys.advancedcalculator.modes.BaseMode;
import dev.hyperskys.advancedcalculator.modes.FractionMode;
import dev.hyperskys.advancedcalculator.modes.TriangleMode;
import dev.hyperskys.advancedcalculator.utils.VersionUtils;

import java.util.Locale;
import java.util.Scanner;

public class MainMenu {
    public static void runMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an available option to view all available options please input HELP or SEARCH: ");
        String input = scanner.nextLine().toLowerCase(Locale.ROOT);

        switch (input) {

            case "help":
                System.out.println("All available options: Triangle, Basic, Fraction, Version, Learn, Help, Search");
                System.out.println("Please press enter to return to the main menu...");
                scanner.nextLine();
                runMainMenu();
                break;

            case "search":
                System.out.println("What do you want to search for?: ");
                String search = scanner.nextLine().toLowerCase(Locale.ROOT);

                switch (search) {

                    case "learn":
                        System.out.println("Still in development...");
                        System.out.println("Please press enter to return to the main menu...");
                        scanner.nextLine();
                        runMainMenu();
                        break;

                    case "fraction":
                        System.out.println("Results: Fraction Calculator");
                        System.out.println("Would you like to open the Fraction Calculator?");
                        String inputData = scanner.nextLine().toLowerCase(Locale.ROOT);

                        switch (inputData) {

                            case "yes":
                                FractionMode.setupMode();
                                break;

                            case "no":
                                runMainMenu();
                                break;

                            default:
                                System.out.println("Invalid Option, please pick YES or NO!");
                                System.out.println("Please press enter to return to the main menu...");
                                scanner.nextLine();
                                runMainMenu();
                                break;
                        }
                    break;

                    case "base":
                        System.out.println("Results: Basic Calculator");
                        System.out.println("Would you like to open the Basic Calculator?");
                        String inputData1 = scanner.nextLine().toLowerCase(Locale.ROOT);

                        switch (inputData1) {

                            case "yes":
                                BaseMode.setupMode();
                                break;

                            case "no":
                                runMainMenu();
                                break;

                            default:
                                System.out.println("Invalid Option, please pick YES or NO!");
                                System.out.println("Please press enter to return to the main menu...");
                                scanner.nextLine();
                                runMainMenu();
                                break;
                        }
                        break;

                    case "basic":
                        System.out.println("Results: Basic Calculator");
                        System.out.println("Would you like to open the Basic Calculator?");
                        String inputData2 = scanner.nextLine().toLowerCase(Locale.ROOT);

                        switch (inputData2) {

                            case "yes":
                                BaseMode.setupMode();
                                break;

                            case "no":
                                runMainMenu();
                                break;

                            default:
                                System.out.println("Invalid Option, please pick YES or NO!");
                                System.out.println("Please press enter to return to the main menu...");
                                scanner.nextLine();
                                runMainMenu();
                                break;
                        }
                        break;

                    case "triangle":
                        System.out.println("Results: Triangle Calculator");
                        System.out.println("Would you like to open the Triangle Calculator?");
                        String inputData3 = scanner.nextLine().toLowerCase(Locale.ROOT);

                        switch (inputData3) {

                            case "yes":
                                TriangleMode.setupMode();
                                break;

                            case "no":
                                runMainMenu();
                                break;

                            default:
                                System.out.println("Invalid Option, please pick YES or NO!");
                                System.out.println("Please press enter to return to the main menu...");
                                scanner.nextLine();
                                runMainMenu();
                                break;
                        }
                        break;

                    case "triangletype":
                        System.out.println("Results: Triangle Calculator");
                        System.out.println("Would you like to open the Triangle Calculator?");
                        String inputData4 = scanner.nextLine().toLowerCase(Locale.ROOT);

                        switch (inputData4) {

                            case "yes":
                                TriangleMode.setupMode();
                                break;

                            case "no":
                                runMainMenu();
                                break;

                            default:
                                System.out.println("Invalid Option, please pick YES or NO!");
                                System.out.println("Please press enter to return to the main menu...");
                                scanner.nextLine();
                                runMainMenu();
                                break;
                        }
                        break;

                    default:
                        System.out.println("There were no modes found that matched your result");
                        System.out.println("Please press enter to return to the main menu...");
                        scanner.nextLine();
                        runMainMenu();
                }

                break;

            case "version":
                System.out.println("Version: "+ VersionUtils.getVersion());
                System.out.println("Please press enter to return to the main menu...");
                scanner.nextLine();
                runMainMenu();
                break;

            case "basic":
                BaseMode.setupMode();
                break;

            case "triangle":
                TriangleMode.setupMode();
                break;

            case "fraction":
                FractionMode.setupMode();
                break;

            default:
                System.out.println("Invalid Option, please make sure you have entered it correctly!");
                System.out.println("Please press enter to return to the main menu...");
                scanner.nextLine();
                runMainMenu();
        }
    }
}