package com.epam.squares.view;

import com.epam.squares.enums.PurposeEnum;
import com.epam.squares.exceptions.UnknownFactoryPurposeException;

public class ResultPrinterFactory {

    private static String NO_SUCH_PURPOSE = "No such purpose in factory.";

    public ResultPrinter createConsolePrinterByPurpose(PurposeEnum purpose) throws UnknownFactoryPurposeException {
        switch (purpose) {
            case AREA:
                return new ConsolePrinterArea();
            case DIFFERENCE:
                return new ConsolePrinterDifference();
            default:
                throw new UnknownFactoryPurposeException(NO_SUCH_PURPOSE);
        }
    }
}
