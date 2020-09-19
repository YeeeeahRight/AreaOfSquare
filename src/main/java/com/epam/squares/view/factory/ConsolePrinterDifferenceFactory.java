package com.epam.squares.view.factory;

public class ConsolePrinterDifferenceFactory implements ResultPrinterFactory {

    private final static String RESULT_TEXT = "And the difference between the areas of the inscribed and the circumscribed square: ";

    @Override
    public void print(double difference) {
        System.out.printf(RESULT_TEXT + "%.2f\n", difference);
    }
}
