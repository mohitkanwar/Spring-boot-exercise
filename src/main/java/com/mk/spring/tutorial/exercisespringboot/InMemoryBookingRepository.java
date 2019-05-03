package com.mk.spring.tutorial.exercisespringboot;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBookingRepository implements BookingRepository {
    private List<String> bookings = new ArrayList<>();
    @Override
    public List<String> findAllBookings() {
        return bookings;
    }

    @Override
    public void add(String person) {
        if(!bookings.contains(person)){
            bookings.add(person);
        }
    }
}
