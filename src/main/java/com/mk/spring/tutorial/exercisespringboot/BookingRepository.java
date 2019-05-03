package com.mk.spring.tutorial.exercisespringboot;

import java.util.List;

public interface BookingRepository {

    List<String> findAllBookings();

    void add(String person);
}
