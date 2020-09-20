package com.epam.squares.data;

import com.epam.squares.exceptions.DataTypeException;
import com.epam.squares.exceptions.InputStreamConsoleException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDataAcquirer implements DataAcquirer {

    private final static String INCORRECT_DATA_TYPE_MESSAGE = "Incorrect type data of area(area should be a number).";
    private final static String INPUT_EXCEPTION_MESSAGE = "Something wrong with your input.";
    private final static String CLOSE_EXCEPTION_MESSAGE = "Error with closing reader.";

    //deleted cycle and data range verification
    @Override
    public double getArea() throws DataTypeException, InputStreamConsoleException {
        System.out.print("Enter area of circumscribed square: ");
        BufferedReader reader = null;
        double square;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            square = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            throw new DataTypeException(INCORRECT_DATA_TYPE_MESSAGE);
        } catch (IOException e) {
            throw new InputStreamConsoleException(INPUT_EXCEPTION_MESSAGE);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(CLOSE_EXCEPTION_MESSAGE);
                }
            }
        }
        return square;
    }

}
