package com.hillel.homeWork.lesson7.formatter;

import com.hillel.homeWork.lesson7.logger.LoggingLevel;

import java.sql.Timestamp;

public class FileFormatter extends Formatter{

    public String format(LoggingLevel loggingLevel, String message) {
        return "[" +new Timestamp(System.currentTimeMillis()) + "] [" +  loggingLevel + "] " + "message: [" + message + "]\n";
    }
}
