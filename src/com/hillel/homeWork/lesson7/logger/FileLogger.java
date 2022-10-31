package com.hillel.homeWork.lesson7.logger;

import com.hillel.homeWork.lesson7.exceptions.FileMaxSizeReachedException;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger extends Logger {

    public FileLogger(FileLoggerConfiguration fileLoggerConfiguration) {
        super(fileLoggerConfiguration);
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public void debug(String message) {

        if (fileLoggerConfiguration.getLevel().equals(LoggingLevel.DEBUG)) {

            try {
                log(LoggingLevel.DEBUG, message);
            } catch (FileMaxSizeReachedException e) {
                e.printStackTrace();
            }
        }
    }

    public void info(String message) {
        try {
            log(LoggingLevel.INFO, message);
        } catch (FileMaxSizeReachedException e) {
            e.printStackTrace();
        }
    }

    public void createFile(FileLoggerConfiguration fileLoggerConfiguration) {
        fileLoggerConfiguration.setFilePath(fileLoggerConfiguration.getFilePath().replaceFirst(fileLoggerConfiguration
                        .getFilePath().substring(fileLoggerConfiguration.getFilePath()
                                .lastIndexOf("/") + 1,
                        fileLoggerConfiguration.getFilePath()
                                .lastIndexOf(".")),
                "log_" + LocalDateTime.now().format( DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss"))));
    }

    public void log(LoggingLevel loggingLevel, String message) throws FileMaxSizeReachedException {

        if (fileLoggerConfiguration.getFilePath().length() > fileLoggerConfiguration.getMaxLogFileSize()) {
            throw new FileMaxSizeReachedException("Maximum file size exceeded [" +
                    fileLoggerConfiguration.getMaxLogFileSize() + " bytes] \n Path: " +
                    fileLoggerConfiguration.getFilePath());
        } else {
            BufferedWriter writer = null;
            try {
                if (new File(fileLoggerConfiguration.getFilePath()).length() >= fileLoggerConfiguration.getMaxLogFileSize()) {
                    createFile(fileLoggerConfiguration);
                }
                writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(new File(fileLoggerConfiguration.getFilePath()), true)));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                writer.write(String.format(fileLoggerConfiguration.getFormat(), LocalDateTime.now().format(formatter), loggingLevel, message));
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public FileLoggerConfiguration getFileLoggerConfiguration() {
        return fileLoggerConfiguration;
    }
}
