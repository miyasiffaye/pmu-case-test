package com.pmu.course.exception;

public class PmuException extends RuntimeException {

    public PmuException(String message) {
        super(message);
    }

    public PmuException(String message, Throwable cause) {
        super(message, cause);
    }

    public PmuException(Throwable cause) {
        super(cause.getMessage(), cause);
    }
}
