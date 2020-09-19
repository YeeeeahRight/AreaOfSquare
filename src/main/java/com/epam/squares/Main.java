package com.epam.squares;

import com.epam.squares.data.ConsoleDataAcquirer;
import com.epam.squares.data.DataAcquirer;
import com.epam.squares.enums.PurposeEnum;
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
        ResultPrinterFactory printerFactory = createConsolePrinterByPurpose(PurposeEnum.AREA);
        printerFactory.print(inscribedSquareArea);
        printerFactory = createConsolePrinterByPurpose(PurposeEnum.DIFFERENCE);
        printerFactory.print(difference);
    }

    private static ResultPrinterFactory createConsolePrinterByPurpose(PurposeEnum purpose) {
        switch (purpose) {
            case AREA:
                return new ConsolePrinterAreaFactory();
            case DIFFERENCE:
                return new ConsolePrinterDifferenceFactory();
            default:
                throw new UnknownFactoryPurpose(purpose + " is unknown purpose.");
        }
    }
}
