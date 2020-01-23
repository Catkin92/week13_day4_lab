package com.codeclan.example.bookingLab;

import com.codeclan.example.bookingLab.models.Booking;
import com.codeclan.example.bookingLab.models.Course;
import com.codeclan.example.bookingLab.models.Customer;
import com.codeclan.example.bookingLab.repositories.bookingRepositories.BookingRepository;
import com.codeclan.example.bookingLab.repositories.courseRepositories.CourseRepository;
import com.codeclan.example.bookingLab.repositories.customerRepositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookingLabApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void findCoursesByRating() {
		List<Course> found = courseRepository.findCoursesByRating(5);
		assertEquals("Intro to Slack Beef", found.get(0).getName());
	}

	@Test
	public void findCustomersByCourse() {
		List<Customer> found = customerRepository.findCustomersByBookingsCourseId(1L);
		assertEquals("Eugene", found.get(0).getName());
	}

	@Test
	public void findCoursesByCustomer() {
		List<Course> found = courseRepository.findCoursesByBookingsCustomerId(1L);
		assertEquals("Intro to Slack Beef", found.get(0).getName());
	}

	@Test
	public void findBookingsByDate() {
		List<Booking> found = bookingRepository.findBookingsByDate("23-01-20");
		assertEquals(1L, found.get(0).getId());
	}

	@Test
	public void findCustomerByGivenTownAndCourse() {
		List<Customer> found = customerRepository.findCustomerByGivenTownAndCourse("York", 1L);
		assertEquals("Eugene", found.get(0).getName());
	}

	@Test
	public void findCustomerOverGivenAgeInGivenTownForGivenCourse() {
		List<Customer> found = customerRepository.findCustomerOverGivenAgeInGivenTownForGivenCourse(21, "Edinburgh", 2L);
		assertEquals("Juan", found.get(0).getName());
	}

}
