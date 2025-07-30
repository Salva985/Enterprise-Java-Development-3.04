package com.example.enterprise_java_3_04.repository;

import com.example.enterprise_java_3_04.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
