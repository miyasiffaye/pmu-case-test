package com.pmu.course.validation;


import java.util.Set;

import static java.util.Collections.emptySet;


public class Valid implements ValidationResult {
    @Override
    public ValidationResult merge(final ValidationResult right) {
        return right;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public Set<ValidationReason> getReasons() {
        return emptySet();
    }
}

