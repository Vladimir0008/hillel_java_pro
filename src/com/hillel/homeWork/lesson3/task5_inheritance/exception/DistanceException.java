package com.hillel.homeWork.lesson3.task5_inheritance.exception;

public class DistanceException  extends Exception{
    public DistanceException() {
    }

    public DistanceException(String message) {
        super(message);
    }

    public DistanceException(String message, Throwable cause) {
        super(message, cause);
    }

    public DistanceException(Throwable cause) {
        super(cause);
    }

    public DistanceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
