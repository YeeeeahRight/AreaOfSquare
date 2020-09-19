package com.epam.squares.logic;

public class DigitCalculator {

    public double findInscribedSquare(double circumscribedSquare) {
        double radius = Math.sqrt(circumscribedSquare) / 2;
        return 2 * radius * radius;
    }

    public double findDifference(double circumscribedSquare, double inscribedSquare) {
        return circumscribedSquare / inscribedSquare;
    }
}
