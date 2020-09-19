package com.epam.squares.data;

import com.epam.squares.exceptions.DataRangeException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDataAcquirer implements DataAcquirer {

    private final static String INCORRECT_DATA_RANGE_MESSAGE = "Incorrect value of area(area should be more than 0). Try again.";
    private final static String INCORRECT_DATA_TYPE_MESSAGE = "Incorrect type data of area(area should be a number). Try again.";
    private final static String INPUT_ERROR_MESSAGE = "Something wrong with your input. Try again.";
    private final static String CLOSE_ERROR_MESSAGE = "Error with closing reader. Try again.";

    @Override
    public double getArea() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double square = 0;
        boolean isCorrectInput;
        do {
            System.out.print("Enter area of circumscribed square: ");
            isCorrectInput = false;
            try {
                square = Double.parseDouble(reader.readLine());
                if (square <= 0) {
                    throw new DataRangeException(INCORRECT_DATA_RANGE_MESSAGE);
                }
                isCorrectInput = true;
            } catch (DataRangeException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println(INCORRECT_DATA_TYPE_MESSAGE);
            } catch (IOException e) {
                System.out.println(INPUT_ERROR_MESSAGE);
            } finally {
                if (isCorrectInput) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        System.out.println(CLOSE_ERROR_MESSAGE);
                    }
                }
            }
        } while (!isCorrectInput);
        return square;
    }

}
