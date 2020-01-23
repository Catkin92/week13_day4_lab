package com.codeclan.example.bookingLab.repositories.bookingRepositories;

import com.codeclan.example.bookingLab.models.Booking;
import com.codeclan.example.bookingLab.models.Customer;
import com.codeclan.example.bookingLab.projections.EmbedCourseAndCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedCourseAndCustomer.class)
public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findBookingsByDate(String date);
}
