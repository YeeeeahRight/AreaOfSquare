package com.epam.squares.exceptions;

public class TestException extends IllegalArgumentException {
    public TestException(String message) {
        super(message);
    }

    public TestException() {
        //NOP
    }
}
