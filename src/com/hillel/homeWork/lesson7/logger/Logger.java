package com.hillel.homeWork.lesson7.logger;

import com.hillel.homeWork.lesson7.config.LoggerConfiguration;
import com.hillel.homeWork.lesson7.config.LoggingLevel;

import java.time.format.DateTimeFormatter;

public abstract class Logger {

    private LoggerConfiguration loggerConfiguration;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Logger(LoggerConfiguration loggerConfiguration) {
        this.loggerConfiguration = loggerConfiguration;
    }

    public abstract void debug(String message);

    public abstract void info(String message);

    public abstract void log(LoggingLevel loggingLevel, String message) ;

    public LoggerConfiguration getLoggerConfiguration() {
        return loggerConfiguration;
    }
}

