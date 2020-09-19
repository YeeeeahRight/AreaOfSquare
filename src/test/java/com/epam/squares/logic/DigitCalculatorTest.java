package com.epam.squares.logic;

import com.epam.squares.exceptions.TestException;
import org.junit.Assert;
import org.junit.Test;

public class DigitCalculatorTest {

    private final static double DELTA = 0.00000001;

    //given
    private DigitCalculator calculator = new DigitCalculator();

    @Test
    public void testFindInscribedSquareAreaShouldCalculateWhenValueIsSquaredNumber() {
        //when
        double actual = calculator.findInscribedSquareArea(16);
        //then
        Assert.assertEquals(8, actual, DELTA);
    }

    @Test
    public void testFindInscribedSquareAreaShouldCalculateWhenValueIsNotSquaredNumber() {
        //when
        double actual = calculator.findInscribedSquareArea(17);
        //then
        Assert.assertEquals(8.5, actual, DELTA);
    }

    @Test(expected = TestException.class)
    public void testFindInscribedSquareAreaShouldThrowExceptionWhenSquareIsNegative() {
        double result = calculator.findInscribedSquareArea(-5);
    }

    @Test
    public void testFindDifferenceShouldCalculateWhenValuesAreFloatingPoint() {
        //when
        double actual = calculator.findDifference(12.8, 6.4);
        //then
        Assert.assertEquals(2, actual, DELTA);
    }

    @Test(expected = TestException.class)
    public void testFindDifferenceShouldThrowExceptionWhenSecondSquareIsZero() {
        double result = calculator.findDifference(5, 0);
    }

}
