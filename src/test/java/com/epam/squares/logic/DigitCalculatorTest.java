package com.epam.squares.logic;

import com.epam.squares.exceptions.CalculatorException;
import org.junit.Assert;
import org.junit.Test;

public class DigitCalculatorTest {

    private final static double DELTA = 0.00000001;

    //given
    private DigitCalculator calculator = new DigitCalculator();

    @Test
    public void testFindInscribedSquareAreaShouldCalculateWhenValueIsSquaredNumber() throws CalculatorException {
        //when
        double actual = calculator.findInscribedSquareArea(16);
        //then
        Assert.assertEquals(8, actual, DELTA);
    }

    @Test
    public void testFindInscribedSquareAreaShouldCalculateWhenValueIsNotSquaredNumber() throws CalculatorException {
        //when
        double actual = calculator.findInscribedSquareArea(17);
        //then
        Assert.assertEquals(8.5, actual, DELTA);
    }

    @Test(expected = CalculatorException.class)
    public void testFindInscribedSquareAreaShouldThrowExceptionWhenSquareIsNegative() throws CalculatorException {
        double result = calculator.findInscribedSquareArea(-5);
    }

    @Test
    public void testFindDifferenceShouldCalculateWhenValuesAreFloatingPoint() throws CalculatorException {
        //when
        double actual = calculator.findDifference(12.8, 6.4);
        //then
        Assert.assertEquals(2, actual, DELTA);
    }

    @Test(expected = CalculatorException.class)
    public void testFindDifferenceShouldThrowExceptionWhenSecondSquareIsZero() throws CalculatorException {
        double result = calculator.findDifference(5, 0);
    }

}
