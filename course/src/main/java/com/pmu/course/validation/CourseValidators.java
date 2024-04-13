package com.pmu.course.validation;


import com.pmu.course.entity.Course;
import  com.pmu.course.validation.CourseValidationPredicate;
import com.pmu.course.validation.FunctionValidator;
import com.pmu.course.validation.ValidationReason;

public final class CourseValidators {
    public static FunctionValidator<Course> emptyName = FunctionValidator.createValidator(CourseValidationPredicate.isEmptyRuleName, ValidationReason.COURSE_NAME_IS_EMPTY);
    public static FunctionValidator<Course> coursePartantsSizeLowThanThree = FunctionValidator.createValidator(CourseValidationPredicate.coursePartantsSizeLowThanThree, ValidationReason.COURSE_NAME_IS_EMPTY);

}
