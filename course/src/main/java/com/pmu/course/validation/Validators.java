package com.pmu.course.validation;



import java.util.Objects;

public final class Validators {
    public static FunctionValidator<Object> nullParameter = FunctionValidator.createValidator(Objects::isNull, ValidationReason.MISSING_PARAMETER);
    public static FunctionValidator<String> emptyStringParameter = FunctionValidator.createValidator(String::isEmpty, ValidationReason.MISSING_PARAMETER);
    public static FunctionValidator<String> blankStringParameter = FunctionValidator.createValidator(String::isBlank, ValidationReason.MISSING_PARAMETER);
}
