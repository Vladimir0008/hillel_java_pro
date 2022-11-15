package com.hillel.homeWork.lesson7;

import com.hillel.homeWork.lesson7.config.FileLoggerConfigurationLoader;
import com.hillel.homeWork.lesson7.config.LoggerConfiguration;
import com.hillel.homeWork.lesson7.logger.ConsoleLogger;
import com.hillel.homeWork.lesson7.logger.FileLogger;
import com.hillel.homeWork.lesson7.logger.Logger;

public class Main {
    public static void main(String[] args) {

        FileLoggerConfigurationLoader configLoader = new FileLoggerConfigurationLoader();
        LoggerConfiguration config = configLoader.load();
        Logger logger = new ConsoleLogger(config);
        Logger logger2 = new FileLogger(config);

        logger.info("info message");
        logger.debug("debug message");

        logger2.info("info message");
        logger2.debug("debug message");

        Object[] arr = new Object[10];
        System.out.println(arr.length);
    }
}
