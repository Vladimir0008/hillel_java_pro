package com.hillel.homeWork.lesson7.logger;

import com.hillel.homeWork.lesson7.exceptions.FileMaxSizeReachedException;

import java.time.format.DateTimeFormatter;

public abstract class Logger {

    public FileLoggerConfiguration fileLoggerConfiguration;

    public Logger(FileLoggerConfiguration fileLoggerConfiguration) {
        this.fileLoggerConfiguration = fileLoggerConfiguration;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public abstract void debug(String message);

    public abstract void info(String message);

    public abstract void log(LoggingLevel loggingLevel, String message) throws FileMaxSizeReachedException;

    public FileLoggerConfiguration getFileLoggerConfiguration() {
        return fileLoggerConfiguration;
    }
}

