package com.pmu.course.validation;

;

import java.util.HashSet;
import java.util.Set;


public class Invalid implements ValidationResult {
    private final Set<ValidationReason> reasons;

    Invalid(final Set<ValidationReason> reasons) {
        this.reasons = reasons;
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public Set<ValidationReason> getReasons() {
        return reasons;
    }

    @Override
    public ValidationResult merge(final ValidationResult right) {
        HashSet<ValidationReason> mutation = new HashSet<>(reasons);
        mutation.addAll(right.getReasons());
        return new Invalid(mutation);
    }
}
