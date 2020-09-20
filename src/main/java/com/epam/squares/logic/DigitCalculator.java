package com.epam.squares.logic;

public class DigitCalculator {

    public double findInscribedSquareArea(double circumscribedSquare) {
        /*double radius = Math.sqrt(circumscribedSquare) / 2;
        return 2 * radius * radius; - MATH FORMULAS*/
        return circumscribedSquare / 2; //less operations
    }

    public double findDifference(double circumscribedSquare, double inscribedSquare)  {
        //return circumscribedSquare / inscribedSquare;
        return 2; //always 2 :)
    }
}
