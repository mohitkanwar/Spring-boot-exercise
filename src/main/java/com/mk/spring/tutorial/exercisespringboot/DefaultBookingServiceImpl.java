package com.mk.spring.tutorial.exercisespringboot;

import groovy.transform.AutoClone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultBookingServiceImpl implements BookingService{

    private final static Logger logger = LoggerFactory.getLogger(DefaultBookingServiceImpl.class);
    private final BookingRepository bookingRepository;
    public DefaultBookingServiceImpl(@Autowired BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public void book(String... persons) {
        for (String person : persons) {
            if(!person.equals("")){
                logger.info("Booking " + person + " in a seat...");
                bookingRepository.add(person);

            }
        }
    }

    public List<String> findAllBookings() {
        return bookingRepository.findAllBookings();
    }

}