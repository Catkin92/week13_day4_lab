package com.codeclan.example.bookingLab.repositories.customerRepositories;

import com.codeclan.example.bookingLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
