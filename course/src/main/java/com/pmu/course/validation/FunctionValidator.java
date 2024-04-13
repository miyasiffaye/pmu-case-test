package com.pmu.course.validation;

import java.util.function.Function;
import java.util.function.Predicate;

import static com.pmu.course.validation.ValidationResult.invalid;
import static com.pmu.course.validation.ValidationResult.valid;

public interface FunctionValidator<T> extends Function<T, ValidationResult> {

    static <T> FunctionValidator<T> createValidator(final Predicate<T> predicate, final ValidationReason rule) {
        return (t) -> predicate.test(t) ? invalid(rule) : valid();
    }

    default FunctionValidator<T> and(final FunctionValidator<T> other) {
        return (t) -> {
            final ValidationResult left = this.apply(t);
            final ValidationResult right = other.apply(t);
            return left.merge(right);
        };
    }

    default FunctionValidator<T> or(final FunctionValidator<T> other) {
        return (t) -> {
            final ValidationResult left = this.apply(t);
            return left.isValid() ? other.apply(t) : left;
        };
    }
}
