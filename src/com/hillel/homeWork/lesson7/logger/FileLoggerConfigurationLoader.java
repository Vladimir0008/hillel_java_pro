package com.hillel.homeWork.lesson7.logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLoggerConfigurationLoader {

    FileInputStream fileInputStream;

    Properties properties = new Properties();

    public FileLoggerConfiguration load() {

        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration();

        try {
            fileInputStream = new FileInputStream("src/com/hillel/homeWork/lesson7/resources/config.properties");
            properties.load(fileInputStream);

            fileLoggerConfiguration.setFilePath(properties.getProperty("FILE"));
            fileLoggerConfiguration.setLevel(LoggingLevel.valueOf(properties.getProperty("LEVEL")));
            fileLoggerConfiguration.setMaxLogFileSize(Integer.parseInt(properties.getProperty("MAX_SIZE")));
            fileLoggerConfiguration.setFormat(properties.getProperty("FORMAT"));
        } catch (IOException e) {
            System.err.println("ERROR! Config file does not exist!");
        }

        return fileLoggerConfiguration;
    }
}
