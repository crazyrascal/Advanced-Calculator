package dev.hyperskys.advancedcalculator.ui.main;

import dev.hyperskys.advancedcalculator.modes.BaseMode;
import dev.hyperskys.advancedcalculator.modes.FractionMode;
import dev.hyperskys.advancedcalculator.modes.TriangleMode;
import dev.hyperskys.advancedcalculator.ui.main.other.LearningMenu;
import dev.hyperskys.advancedcalculator.utils.VersionUtils;
import dev.hyperskys.advancedcalculator.utils.search.SearchTool;

import java.util.Locale;
import java.util.Scanner;

public class MainMenu {
    public static void runMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an available option to view all available options please input HELP or SEARCH: ");
        String input = scanner.nextLine().toLowerCase(Locale.ROOT);

        switch (input) {

            case "learn":
                LearningMenu.setupMenu();
                break;

            case "help":
                System.out.println("All available options: Triangle, Basic, Fraction, Version, Learn, Help, Search");
                System.out.println("Please press enter to return to the main menu...");
                scanner.nextLine();
                runMainMenu();
                break;

            case "search":
                System.out.println("What do you want to search for?: ");
                String search = scanner.nextLine().toLowerCase(Locale.ROOT);
                SearchTool searchTool = new SearchTool(search, scanner);
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