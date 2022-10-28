package com.hillel.homeWork.lesson7;

import com.hillel.homeWork.lesson7.exceptions.FileMaxSizeReachedException;
import com.hillel.homeWork.lesson7.logger.FileLogger;
import com.hillel.homeWork.lesson7.logger.FileLoggerConfiguration;

public class Main {
    public static void main(String[] args) {

        FileLogger fileLogger = new FileLogger(new FileLoggerConfiguration());


        try {
            fileLogger.debug("Some DEBUG message");
        } catch (FileMaxSizeReachedException e) {
            e.printStackTrace();
        }

        try {
            fileLogger.info("Some INFO message");
        } catch (FileMaxSizeReachedException e) {
            e.printStackTrace();
        }

        System.out.println(fileLogger.getFileLoggerConfiguration().getFile().length());

    }
}
