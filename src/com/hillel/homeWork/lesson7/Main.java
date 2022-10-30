package com.hillel.homeWork.lesson7;

import com.hillel.homeWork.lesson7.exceptions.FileMaxSizeReachedException;
import com.hillel.homeWork.lesson7.logger.FileLogger;
import com.hillel.homeWork.lesson7.logger.FileLoggerConfiguration;
import com.hillel.homeWork.lesson7.logger.FileLoggerConfigurationLoader;

public class Main {
    public static void main(String[] args) throws FileMaxSizeReachedException {

        FileLoggerConfigurationLoader configLoader = new FileLoggerConfigurationLoader();
        FileLoggerConfiguration config = configLoader.load("src/com/hillel/homeWork/lesson7/inputConfigFile.txt");
        FileLogger logger = new FileLogger(config);

            logger.info("info message");
            logger.debug("debug message");

    }
}
