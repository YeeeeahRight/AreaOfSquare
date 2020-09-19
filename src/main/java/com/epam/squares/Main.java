package com.epam.squares;

import com.epam.squares.data.ConsoleDataAcquirer;
import com.epam.squares.data.DataAcquirer;
import com.epam.squares.exceptions.UnknownFactoryPurpose;
import com.epam.squares.logic.DigitCalculator;
import com.epam.squares.view.factory.ConsolePrinterAreaFactory;
import com.epam.squares.view.factory.ConsolePrinterDifferenceFactory;
import com.epam.squares.view.factory.ResultPrinterFactory;


public class Main {

    public static void main(String[] args) {
        DataAcquirer acquirer = new ConsoleDataAcquirer();
        double circumscribedSquareArea = acquirer.getArea();
        DigitCalculator calculator = new DigitCalculator();
        double inscribedSquareArea = calculator.findInscribedSquareArea(circumscribedSquareArea);
        double difference = calculator.findDifference(circumscribedSquareArea, inscribedSquareArea);
        ResultPrinterFactory printerFactory = createConsolePrinterByPurpose("area");
        printerFactory.print(inscribedSquareArea);
        printerFactory = createConsolePrinterByPurpose("difference");
        printerFactory.print(difference);
    }

    private static ResultPrinterFactory createConsolePrinterByPurpose(String purpose) {
        if (purpose.equalsIgnoreCase("area")) {
            return new ConsolePrinterAreaFactory();
        } else if (purpose.equalsIgnoreCase("difference")) {
            return new ConsolePrinterDifferenceFactory();
        } else {
            throw new UnknownFactoryPurpose(purpose + " is unknown purpose.");
        }
    }
}
