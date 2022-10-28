package com.hillel.homeWork.lesson7.formatter;

import com.hillel.homeWork.lesson7.logger.LoggingLevel;

public abstract class Formatter {

    public String format(LoggingLevel loggingLevel, String message) {
        return message;
    }
}
