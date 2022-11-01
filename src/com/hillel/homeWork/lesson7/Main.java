package com.hillel.homeWork.lesson7;

import com.hillel.homeWork.lesson7.logger.*;

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


    }
}
