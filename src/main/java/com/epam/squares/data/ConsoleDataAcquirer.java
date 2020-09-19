package com.epam.squares.data;

import com.epam.squares.exceptions.DataTypeException;
import com.epam.squares.exceptions.InputStreamException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDataAcquirer implements DataAcquirer {

    private final static String INCORRECT_DATA_TYPE_MESSAGE = "Incorrect type data of area(area should be a number). Try again.";
    private final static String INPUT_EXCEPTION_MESSAGE = "Something wrong with your input. Try again.";
    private final static String CLOSE_EXCEPTION_MESSAGE = "Error with closing reader. Try again.";

    //deleted cycle and range verification
    @Override
    public double getArea() throws DataTypeException, InputStreamException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter area of circumscribed square: ");
        double square;
        try {
            square = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            throw new DataTypeException(INCORRECT_DATA_TYPE_MESSAGE);
        } catch (IOException e) {
            throw new InputStreamException(INPUT_EXCEPTION_MESSAGE);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new InputStreamException(CLOSE_EXCEPTION_MESSAGE);
            }
        }
        return square;
    }

}
