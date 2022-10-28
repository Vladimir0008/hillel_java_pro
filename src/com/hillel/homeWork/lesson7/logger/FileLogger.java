package com.hillel.homeWork.lesson7.logger;

import com.hillel.homeWork.lesson7.exceptions.FileMaxSizeReachedException;

import java.io.*;

public class FileLogger {

    private FileLoggerConfiguration fileLoggerConfiguration;

    public FileLogger(FileLoggerConfiguration fileLoggerConfiguration) {
        this.fileLoggerConfiguration = fileLoggerConfiguration;
    }

    public void debug(String message) throws FileMaxSizeReachedException {

        if (fileLoggerConfiguration.getLevel().equals(LoggingLevel.DEBUG)) {

            if (fileLoggerConfiguration.getFile().length() > fileLoggerConfiguration.getMaxLogFileSize()) {

                throw new FileMaxSizeReachedException("Maximum file size exceeded [" +
                        fileLoggerConfiguration.getMaxLogFileSize() + " bytes] \n Path: " +
                        fileLoggerConfiguration.getFile().getPath());
            } else {

                try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(fileLoggerConfiguration.getFile(), true)))) {
                    writer.write(fileLoggerConfiguration.getFormatter().format(LoggingLevel.DEBUG, message));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void info(String message) throws FileMaxSizeReachedException {

        if (fileLoggerConfiguration.getFile().length() > fileLoggerConfiguration.getMaxLogFileSize()) {

            throw new FileMaxSizeReachedException("Maximum file size exceeded [" +
                    fileLoggerConfiguration.getMaxLogFileSize() + " bytes] \n Path: " +
                    fileLoggerConfiguration.getFile().getPath());
        } else {

            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(fileLoggerConfiguration.getFile(), true)))) {
                writer.write(fileLoggerConfiguration.getFormatter().format(LoggingLevel.INFO, message));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public FileLoggerConfiguration getFileLoggerConfiguration() {
        return fileLoggerConfiguration;
    }

    public void setFileLoggerConfiguration(FileLoggerConfiguration fileLoggerConfiguration) {
        this.fileLoggerConfiguration = fileLoggerConfiguration;
    }
}
