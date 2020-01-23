package com.codeclan.example.bookingLab.controllers;

import com.codeclan.example.bookingLab.models.Customer;
import com.codeclan.example.bookingLab.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/courses/{id}")
    public List<Customer> findCustomersByBookingsCourseId(@PathVariable Long id) {
        return customerRepository.findCustomersByBookingsCourseId(id);
    }

    @GetMapping(value = "/{town}/{id}")
    public List<Customer> findCustomerByGivenTownAndCourse(@PathVariable String town, @PathVariable Long id) {
        return customerRepository.findCustomerByGivenTownAndCourse(town, id);
    }
    @GetMapping(value = "/{age}/{town}/{id}")
    public List<Customer> findCustomerOverGivenAgeInGivenTownForGivenCourse(@PathVariable int age, @PathVariable String town, @PathVariable Long id) {
        return customerRepository.findCustomerOverGivenAgeInGivenTownForGivenCourse(age, town, id);
    }
}
