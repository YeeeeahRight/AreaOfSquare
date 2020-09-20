package com.epam.squares.data;

import com.epam.squares.exceptions.DataTypeException;
import com.epam.squares.exceptions.InputStreamConsoleException;

public interface DataAcquirer {

    double getArea() throws DataTypeException, InputStreamConsoleException;
}
