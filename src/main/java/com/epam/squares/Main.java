package com.epam.squares;

import com.epam.squares.data.ConsoleDataAcquirer;
import com.epam.squares.data.DataAcquirer;
import com.epam.squares.enums.PurposeEnum;
import com.epam.squares.exceptions.CalculatorException;
import com.epam.squares.exceptions.DataTypeException;
import com.epam.squares.exceptions.InputStreamException;
import com.epam.squares.exceptions.UnknownFactoryPurposeException;
import com.epam.squares.logic.DigitCalculator;
import com.epam.squares.view.ResultPrinter;
import com.epam.squares.view.ResultPrinterFactory;


public class Main {

    public static void main(String[] args) throws CalculatorException, UnknownFactoryPurposeException,
            DataTypeException, InputStreamException {
        DataAcquirer acquirer = new ConsoleDataAcquirer();
        double circumscribedSquareArea = acquirer.getArea();
        DigitCalculator calculator = new DigitCalculator();
        double inscribedSquareArea = calculator.findInscribedSquareArea(circumscribedSquareArea);
        double difference = calculator.findDifference(circumscribedSquareArea, inscribedSquareArea);
        ResultPrinterFactory printerCreator = new ResultPrinterFactory();
        ResultPrinter resultPrinter = printerCreator.createConsolePrinterByPurpose(PurposeEnum.AREA);
        resultPrinter.print(inscribedSquareArea);
        resultPrinter = printerCreator.createConsolePrinterByPurpose(PurposeEnum.DIFFERENCE);
        resultPrinter.print(difference);
    }
}
