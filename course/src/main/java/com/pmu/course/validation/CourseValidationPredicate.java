package com.pmu.course.validation;



import com.pmu.course.entity.Course;

import java.util.function.Predicate;


public interface CourseValidationPredicate extends Predicate<Course> {
    CourseValidationPredicate isEmptyRuleName = (course) -> course.getName() == null || course.getName().isEmpty();
    CourseValidationPredicate coursePartantsSizeLowThanThree = (course) -> course.getPartants() == null || course.getPartants().size() < 3;

}
