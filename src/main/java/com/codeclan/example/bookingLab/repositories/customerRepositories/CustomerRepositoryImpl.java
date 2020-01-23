package com.codeclan.example.bookingLab.repositories.customerRepositories;

import com.codeclan.example.bookingLab.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    CustomerRepositoryCustom customerRepositoryCustom;

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findCustomerByGivenTownAndCourse(String town, Long id) {
        List<Customer> result = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(Customer.class);
        criteria.add(Restrictions.eq("town", town));

        criteria.createAlias("bookings", "booking");
        criteria.createAlias("booking.course", "course");
        criteria.add(Restrictions.eq("course.id", id));

        result = criteria.list();

        return result;
    }

    @Transactional
    public List<Customer> findCustomerOverGivenAgeInGivenTownForGivenCourse(int age, String town, Long id) {
        List<Customer> result = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(Customer.class);
        criteria.add(Restrictions.gt("age", age));

        criteria.add(Restrictions.eq("town", town));

        criteria.createAlias("bookings", "booking");
        criteria.createAlias("booking.course", "course");
        criteria.add(Restrictions.eq("course.id", id));

        result = criteria.list();

        return result;
    }
}
