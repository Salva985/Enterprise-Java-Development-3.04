package com.example.enterprise_java_3_04.model;

import jakarta.persistence.*;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightId;

    @Column(unique = true)
    private String flightNumber;

    private String aircraft;
    private Integer totalAircraftSeats;
    private Integer flightMileage;

    //Constructor
    public Flight() {}

    public Flight(String flightNumber, String aircraft, Integer totalAircraftSeats, Integer flightMileage) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.totalAircraftSeats = totalAircraftSeats;
        this.flightMileage = flightMileage;
    }

    //Getters & Setters
    public Integer getFlightId() { return flightId; }
    public void setFlightId(Integer flightId) { this.flightId = flightId; }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

    public String getAircraft() { return aircraft; }
    public void setAircraft(String aircraft) { this.aircraft = aircraft; }

    public Integer getTotalAircraftSeats() { return totalAircraftSeats; }
    public void setTotalAircraftSeats(Integer totalAircraftSeats) { this.totalAircraftSeats = totalAircraftSeats; }

    public Integer getFlightMileage() { return flightMileage; }
    public void setFlightMileage(Integer flightMileage) { this.flightMileage = flightMileage; }
}