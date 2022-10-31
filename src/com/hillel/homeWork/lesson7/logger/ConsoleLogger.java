package com.hillel.homeWork.lesson7.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogger extends Logger {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public ConsoleLogger(FileLoggerConfiguration fileLoggerConfiguration) {
        super(fileLoggerConfiguration);
    }

    public void debug(String message) {
        if (fileLoggerConfiguration.getLevel().equals(LoggingLevel.DEBUG)) {
            log(LoggingLevel.DEBUG, message);
        }
    }

    public void info(String message) {
        log(LoggingLevel.INFO, message);
    }

    public void log(LoggingLevel loggingLevel, String message) {
        System.out.println(String.format(fileLoggerConfiguration.getFormat(), LocalDateTime.now().format(formatter), loggingLevel, message));
    }

    public FileLoggerConfiguration getFileLoggerConfiguration() {
        return fileLoggerConfiguration;
    }
}

