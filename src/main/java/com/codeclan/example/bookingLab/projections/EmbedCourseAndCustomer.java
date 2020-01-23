package com.codeclan.example.bookingLab.projections;


import com.codeclan.example.bookingLab.models.Booking;
import com.codeclan.example.bookingLab.models.Course;
import com.codeclan.example.bookingLab.models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedCourseAndCustomer", types = Booking.class )
public interface EmbedCourseAndCustomer {

    String getDate();
    Customer getCustomer();
    Course getCourse();

}
