package com.codeclan.example.bookingLab.repositories.bookingRepositories;

import com.codeclan.example.bookingLab.models.Booking;
import com.codeclan.example.bookingLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findBookingsByDate(String date);
}
