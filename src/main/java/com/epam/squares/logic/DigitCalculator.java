package com.epam.squares.logic;

import com.epam.squares.exceptions.TestException;

public class DigitCalculator {

    public double findInscribedSquare(double circumscribedSquare) {
        if (circumscribedSquare < 0) {
            throw new TestException("Circumscribed square can't be negative number.");
        }
        double radius = Math.sqrt(circumscribedSquare) / 2;
        return 2 * radius * radius;
    }

    public double findDifference(double circumscribedSquare, double inscribedSquare) {
        if (inscribedSquare == 0) {
            throw new TestException("Inscribed square can't be 0.");
        }
        return circumscribedSquare / inscribedSquare;
    }
}
