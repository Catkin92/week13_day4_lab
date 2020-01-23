package com.codeclan.example.bookingLab.components;

import com.codeclan.example.bookingLab.models.Booking;
import com.codeclan.example.bookingLab.models.Course;
import com.codeclan.example.bookingLab.models.Customer;
import com.codeclan.example.bookingLab.repositories.bookingRepositories.BookingRepository;
import com.codeclan.example.bookingLab.repositories.courseRepositories.CourseRepository;
import com.codeclan.example.bookingLab.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("Eugene", "York", 27);
        customerRepository.save(customer1);

        Course course1 = new Course("Intro to Slack Beef", "Cardiff", 5);
        courseRepository.save(course1);

        Booking booking1 = new Booking("23-01-20", customer1, course1);
        bookingRepository.save(booking1);

        Customer customer2 = new Customer("Sandy", "Edinburgh", 20);
        customerRepository.save(customer2);

        Course course2 = new Course("Pottery with Ghosts", "York", 2);
        courseRepository.save(course2);

        Booking booking2 = new Booking("30-01-20", customer2, course2);
        bookingRepository.save(booking2);

        Customer customer3 = new Customer("Juan", "Edinburgh", 25);
        customerRepository.save(customer3);

        Booking booking3 = new Booking("30-01-20", customer3, course2);
        bookingRepository.save(booking3);

    }
}
