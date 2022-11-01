package com.hillel.homeWork.lesson7.logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLoggerConfigurationLoader {

    private FileInputStream fileInputStream;
    private Properties properties = new Properties();

    public LoggerConfiguration load() {

        LoggerConfiguration loggerConfiguration = new LoggerConfiguration();

        try {
            fileInputStream = new FileInputStream("src/com/hillel/homeWork/lesson7/resources/config.properties");
            properties.load(fileInputStream);

            loggerConfiguration.setFilePath(properties.getProperty("FILE"));
            loggerConfiguration.setLevel(LoggingLevel.valueOf(properties.getProperty("LEVEL")));
            loggerConfiguration.setMaxLogFileSize(Integer.parseInt(properties.getProperty("MAX_SIZE")));
            loggerConfiguration.setFormat(properties.getProperty("FORMAT"));
        } catch (IOException e) {
            System.err.println("ERROR! Config file does not exist!");
        }

        return loggerConfiguration;
    }
}
