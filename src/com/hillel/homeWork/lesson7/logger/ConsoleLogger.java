package com.hillel.homeWork.lesson7.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogger extends Logger {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public ConsoleLogger(LoggerConfiguration loggerConfiguration) {
        super(loggerConfiguration);
    }

    public void debug(String message) {
        if (loggerConfiguration.getLevel().equals(LoggingLevel.DEBUG)) {
            log(LoggingLevel.DEBUG, message);
        }
    }

    public void info(String message) {
        log(LoggingLevel.INFO, message);
    }

    public void log(LoggingLevel loggingLevel, String message) {
        System.out.println(String.format(loggerConfiguration.getFormat(), LocalDateTime.now().format(formatter), loggingLevel, message));
    }

    public LoggerConfiguration getFileLoggerConfiguration() {
        return loggerConfiguration;
    }
}

