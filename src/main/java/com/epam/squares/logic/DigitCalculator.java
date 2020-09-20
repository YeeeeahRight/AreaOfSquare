package com.epam.squares.logic;

import com.epam.squares.exceptions.CalculatorException;

public class DigitCalculator {

    public double findInscribedSquareArea(double circumscribedSquare) throws CalculatorException {
        if (circumscribedSquare <= 0) {
            throw new CalculatorException("Circumscribed square should be positive number.");
        }
        /*double radius = Math.sqrt(circumscribedSquare) / 2;
        return 2 * radius * radius; - FORMULA*/
        return circumscribedSquare / 2;
    }

    public double findDifference(double circumscribedSquare, double inscribedSquare) throws CalculatorException {
        if (inscribedSquare == 0) {
            throw new CalculatorException("Inscribed square can't be 0.");
        }
        //return circumscribedSquare / inscribedSquare;
        return 2; //always 2.
    }
}
