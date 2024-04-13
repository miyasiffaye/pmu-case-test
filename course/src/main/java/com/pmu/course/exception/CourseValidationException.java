package com.pmu.course.exception;

import com.pmu.course.validation.ValidationResult;
import lombok.Getter;

@Getter
public class CourseValidationException extends PmuException {
    private final ValidationResult validationResult;

    public CourseValidationException(String message, ValidationResult validationResult) {
        super(message);
        this.validationResult = validationResult;
    }

    public CourseValidationException(ValidationResult validationResult) {
        this(validationResult.toString(), validationResult);
    }

    public CourseValidationException(String message) {
        this(message, ValidationResult.invalid());
    }
}
