package com.codeclan.example.bookingLab.repositories.courseRepositories;

import com.codeclan.example.bookingLab.models.Course;
import com.codeclan.example.bookingLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findCoursesByRating(int rating);
}
