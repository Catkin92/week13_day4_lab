package com.codeclan.example.bookingLab.repositories.customerRepositories;

import com.codeclan.example.bookingLab.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findCustomerByGivenTownAndCourse(String town, Long id);
}
