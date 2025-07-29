package com.example.enterprise_java_3_04.model;

import jakarta.persistence.*;

@Entity
@Table(name = "flight_bookings")
public class FlightBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customerId")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "flight_id", referencedColumnName = "flightId")
    private Flight flight;

    //Constructor
    public FlightBooking() {}

    public FlightBooking(Customer customer, Flight flight) {
        this.customer = customer;
        this.flight = flight;
    }

    //Getters&Setters
    public Integer getBookingId() { return bookingId; }
    public void setBookingId(Integer bookingId) { this.bookingId = bookingId; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Flight getFlight() { return flight; }
    public void setFlight(Flight flight) { this.flight = flight; }
}
