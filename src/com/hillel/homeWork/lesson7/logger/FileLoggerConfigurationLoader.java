package com.hillel.homeWork.lesson7.logger;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FileLoggerConfigurationLoader {


    public FileLoggerConfiguration load(String inputConfigFileName) {

        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(inputConfigFileName)))) {

            while (reader.ready()) {
                String line = reader.readLine();
                if (line.startsWith("FILE: ")) {
                    fileLoggerConfiguration.setFilePath(line.substring("FILE: ".length()));

                } else if (line.startsWith("LEVEL: ")) {
                    try {
                        LoggingLevel loggingLevel = LoggingLevel.valueOf(line.substring("LEVEL: ".length()));
                        fileLoggerConfiguration.setLevel(loggingLevel);
                    } catch (IllegalArgumentException e) {
                        throw new RuntimeException("Incorrect value at " + line + ", must be " + Arrays.toString(LoggingLevel.values()), e);
                    }

                } else if (line.startsWith("MAX_SIZE: ")) {
                    try {
                        int size = Integer.parseInt(line.substring("MAX_SIZE: ".length()));
                        fileLoggerConfiguration.setMaxLogFileSize(size);
                    } catch (NumberFormatException e) {
                        throw new RuntimeException("Impossible to convert " + line + " to long", e);
                    }

                } else if (line.startsWith("FORMAT: ")) {
                    String format = line.substring("FORMAT: ".length());
                    fileLoggerConfiguration.setFormat(format);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return fileLoggerConfiguration;
    }
}
