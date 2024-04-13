package com.pmu.course.validation;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

public interface ValidationResult {
    static ValidationResult valid() {
        return new Valid();
    }

    static ValidationResult invalid(final Set<ValidationReason> reasons) {
        return new Invalid(reasons);
    }

    static ValidationResult invalid(final ValidationReason... reasons) {
        return new Invalid(new HashSet<>(asList(reasons)));
    }

    ValidationResult merge(final ValidationResult right);

    boolean isValid();

    Set<ValidationReason> getReasons();
}
