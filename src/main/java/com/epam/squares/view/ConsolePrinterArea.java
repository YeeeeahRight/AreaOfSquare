package com.epam.squares.view;

public class ConsolePrinterArea implements ResultPrinter {

    private final static String RESULT_TEXT = "The area of a square inscribed in circle: ";

    @Override
    public void print(double inscribedArea) {
        System.out.printf(RESULT_TEXT + "%.2f\n", inscribedArea);
    }
}
