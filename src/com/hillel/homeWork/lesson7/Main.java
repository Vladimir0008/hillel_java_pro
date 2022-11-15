package com.hillel.homeWork.lesson7;

import com.hillel.homeWork.lesson7.config.ConsoleLoggerConfiguration;
import com.hillel.homeWork.lesson7.config.ConsoleLoggerConfigurationLoader;
import com.hillel.homeWork.lesson7.config.FileLoggerConfiguration;
import com.hillel.homeWork.lesson7.config.FileLoggerConfigurationLoader;
import com.hillel.homeWork.lesson7.logger.ConsoleLogger;
import com.hillel.homeWork.lesson7.logger.FileLogger;
import com.hillel.homeWork.lesson7.logger.Logger;

public class Main {
    public static void main(String[] args) {

        FileLoggerConfigurationLoader configLoader = new FileLoggerConfigurationLoader();
        FileLoggerConfiguration config = configLoader.load();

        ConsoleLoggerConfigurationLoader consoleConfigLoader = new ConsoleLoggerConfigurationLoader();
        ConsoleLoggerConfiguration config1 = consoleConfigLoader.load();

        Logger logger1 = new FileLogger(config);
        Logger logger2 = new ConsoleLogger(config1);

        logger1.info("info message to file");
        logger1.debug("debug message to file");

        logger2.info("info message to console");
        logger2.debug("debug message to console");
    }
}
