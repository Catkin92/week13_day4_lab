package com.codeclan.example.bookingLab.controllers;

import com.codeclan.example.bookingLab.models.Course;
import com.codeclan.example.bookingLab.repositories.courseRepositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> findCoursesByRating(@PathVariable int rating) {
        return courseRepository.findCoursesByRating(rating);
    }
}
