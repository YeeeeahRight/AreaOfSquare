package com.epam.squares.exceptions;

public class UnknownFactoryPurpose extends RuntimeException {

    public UnknownFactoryPurpose(String message) {
        super(message);
    }

    public UnknownFactoryPurpose() {
        //NOP
    }

}
