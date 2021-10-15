package dev.hyperskys.advancedcalculator.dak;

import dev.hyperskys.advancedcalculator.modes.BaseMode;
import dev.hyperskys.advancedcalculator.modes.TriangleMode;
import dev.hyperskys.advancedcalculator.utils.VersionUtils;

import java.util.Scanner;

public class MainMenu {
    public static void runMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an available option to view all available options please input HELP: ");
        String input = scanner.nextLine();

        switch (input) {

            case "HELP":
                System.out.println("All available options: TRIANGLE, BASIC, VERSION, HELP");
                scanner.close();
                break;

            case "VERSION":
                System.out.println("Version: "+ VersionUtils.getVersion());
                scanner.close();
                break;

            case "BASIC":
                BaseMode.setupMode();
                break;

            case "TRIANGLE":
                TriangleMode.setupMode();
                break;

            default:
                System.out.println("Invalid Option, please make sure you are using all Capital Letters!");
                scanner.close();
        }
    }
}
