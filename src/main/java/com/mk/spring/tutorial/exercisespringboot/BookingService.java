package com.mk.spring.tutorial.exercisespringboot;

import java.util.List;

public interface BookingService {
    void book(String... names);

    List<String> findAllBookings();
}
