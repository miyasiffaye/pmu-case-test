package com.pmu.course.controller;

import com.pmu.course.validation.CourseValidators;
import com.pmu.course.entity.Course;
import com.pmu.course.exception.InvalidDataException;
import com.pmu.course.repository.CourseRepository;
import com.pmu.course.validation.FunctionValidator;
import com.pmu.course.validation.ValidationResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course){

        FunctionValidator<Course> validator = CourseValidators.emptyName
                .and(CourseValidators.coursePartantsSizeLowThanThree);
        ValidationResult validationResult = validator.apply(course);

        if (!validationResult.isValid()) {
            throw new InvalidDataException(validationResult);
        }

        return courseRepository.save(course);
    }
}
