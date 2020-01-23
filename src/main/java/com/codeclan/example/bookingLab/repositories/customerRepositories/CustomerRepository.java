package com.codeclan.example.bookingLab.repositories.customerRepositories;

import com.codeclan.example.bookingLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

    List<Customer> findCustomersByBookingsCourseId(Long id);

    List<Customer> findCustomerByGivenTownAndCourse(String town, Long id);
}
