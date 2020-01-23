package com.codeclan.example.bookingLab.repositories.courseRepositories;

import com.codeclan.example.bookingLab.models.Course;
import com.codeclan.example.bookingLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
