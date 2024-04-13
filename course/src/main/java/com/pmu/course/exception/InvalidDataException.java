package com.pmu.course.exception;


import com.pmu.course.validation.ValidationResult;

public class InvalidDataException extends CourseValidationException {
    public static final String DEFAULT_MESSAGE = "Invalid course data submitted";


    public InvalidDataException(ValidationResult validationResult) {
        super(DEFAULT_MESSAGE, validationResult);
    }

    public InvalidDataException(String message) {
        super(message, ValidationResult.invalid());
    }

    public InvalidDataException(String message, ValidationResult validationResult) {
        super(message, validationResult);
    }
}
