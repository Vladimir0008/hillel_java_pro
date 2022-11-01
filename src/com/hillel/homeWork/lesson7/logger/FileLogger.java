package com.hillel.homeWork.lesson7.logger;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger extends Logger {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public FileLogger(LoggerConfiguration fileLoggerConfiguration) {
        super(fileLoggerConfiguration);
    }

    public void debug(String message) {
        if (loggerConfiguration.getLevel().equals(LoggingLevel.DEBUG)) {
                log(LoggingLevel.DEBUG, message);
        }
    }

    public void info(String message) {
            log(LoggingLevel.INFO, message);
    }

    public void createFile(LoggerConfiguration fileLoggerConfiguration) {
        fileLoggerConfiguration.setFilePath(fileLoggerConfiguration.getFilePath().replaceFirst(fileLoggerConfiguration
                        .getFilePath().substring(fileLoggerConfiguration.getFilePath()
                                .lastIndexOf("/") + 1,
                        fileLoggerConfiguration.getFilePath()
                                .lastIndexOf(".")),
                "log_" + LocalDateTime.now().format( DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss"))));
    }

    public void log(LoggingLevel loggingLevel, String message) {
            BufferedWriter writer = null;
            try {
                if (new File(loggerConfiguration.getFilePath()).length() >= loggerConfiguration.getMaxLogFileSize()) {
                    createFile(loggerConfiguration);
                }
                writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(new File(loggerConfiguration.getFilePath()), true)));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                writer.write(String.format(loggerConfiguration.getFormat(), LocalDateTime.now().format(formatter), loggingLevel, message));
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    public LoggerConfiguration getFileLoggerConfiguration() {
        return loggerConfiguration;
    }
}
