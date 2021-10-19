package dev.hyperskys.advancedcalculator.utils.modes;

public class TriangleType {
    public static String getType(double size, double size1, double size2){
        if (size == 90 || size1 == 90 || size2 == 90) {
            return "RIGHT";
        } else {
            if (size < 90 || size1 < 90 || size2 < 90) {
                return "ACUTE";
            } else {
                return "OBTUSE";
            }
        }
    }
}
