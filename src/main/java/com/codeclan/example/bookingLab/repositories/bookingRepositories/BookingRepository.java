package com.codeclan.example.bookingLab.repositories.bookingRepositories;

import com.codeclan.example.bookingLab.models.Booking;
import com.codeclan.example.bookingLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
