package dev.hyperskys.advancedcalculator.utils.search;

import dev.hyperskys.advancedcalculator.modes.BaseMode;
import dev.hyperskys.advancedcalculator.modes.FractionMode;
import dev.hyperskys.advancedcalculator.modes.TriangleMode;
import dev.hyperskys.advancedcalculator.ui.main.MainMenu;
import dev.hyperskys.advancedcalculator.ui.main.other.LearningMenu;

import java.util.Locale;
import java.util.Scanner;

public class SearchTool {


    public SearchTool(String searchInput, Scanner scanner) {
        if(searchInput.contains("fra")) { // This is horrible code but to make it better I have to make it horrible lol please leave suggestions on how to make good pls
            System.out.println("Result Found(1): Fraction Calculator");
            System.out.println("Would you like to open the Fraction Calculator?: ");
            String result = scanner.nextLine().toLowerCase(Locale.ROOT);
            if(result.equals("yes")) {FractionMode.setupMode();} else {MainMenu.runMainMenu(); }
        } else {
            if(searchInput.contains("lea")) { // This is horrible code but to make it better I have to make it horrible lol please leave suggestions on how to make good pls
                System.out.println("Result Found(1): Learning Tool");
                System.out.println("Would you like to open the Learning Tool?: ");
                String result = scanner.nextLine().toLowerCase(Locale.ROOT);
                if(result.equals("yes")) { LearningMenu.setupMenu();} else {MainMenu.runMainMenu();}
            } else {
                if(searchInput.contains("bas")) { // This is horrible code but to make it better I have to make it horrible lol please leave suggestions on how to make good pls
                    System.out.println("Result Found(1): Basic Calculator");
                    System.out.println("Would you like to open the Basic Calculator?: ");
                    String result = scanner.nextLine().toLowerCase(Locale.ROOT);
                    if(result.equals("yes")) {BaseMode.setupMode();} else {MainMenu.runMainMenu();}
                } else {
                    if(searchInput.contains("tri")) { // This is horrible code but to make it better I have to make it horrible lol please leave suggestions on how to make good pls
                        System.out.println("Result Found(1): Triangle Calculator");
                        System.out.println("Would you like to open the Learning Tool?: ");
                        String result = scanner.nextLine().toLowerCase(Locale.ROOT);
                        if(result.equals("yes")) { TriangleMode.setupMode();} else {MainMenu.runMainMenu();}
                    } else {
                        System.out.println("Results Found(0): No Results Found");
                        System.out.println("Please press enter to return to the main menu...");
                        scanner.nextLine();
                        MainMenu.runMainMenu();
                    }
                }
            }
        }
    }

}
