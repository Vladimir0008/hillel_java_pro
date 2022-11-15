package com.hillel.homeWork.lesson7.logger;

import com.hillel.homeWork.lesson7.config.LoggerConfiguration;
import com.hillel.homeWork.lesson7.config.LoggingLevel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogger extends Logger {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public ConsoleLogger(LoggerConfiguration loggerConfiguration) {
        super(loggerConfiguration);
    }

    public void debug(String message) {
        if (super.getLoggerConfiguration().getLevel().equals(LoggingLevel.DEBUG)) {
            log(LoggingLevel.DEBUG, message);
        }
    }

    public void info(String message) {
        log(LoggingLevel.INFO, message);
    }

    public void log(LoggingLevel loggingLevel, String message) {
        System.out.println(String.format(super.getLoggerConfiguration().getFormat(), LocalDateTime.now().format(formatter), loggingLevel, message));
    }

    public LoggerConfiguration getFileLoggerConfiguration() {
        return super.getLoggerConfiguration();
    }
}

