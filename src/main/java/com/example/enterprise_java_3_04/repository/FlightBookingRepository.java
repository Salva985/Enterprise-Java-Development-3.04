package com.example.enterprise_java_3_04.repository;

import com.example.enterprise_java_3_04.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {
}
