package com.epam.squares.exceptions;

public class DataRangeException extends NumberFormatException {

    public DataRangeException(String message) {
        super(message);
    }

    public DataRangeException() {
        //NOP
    }
}
