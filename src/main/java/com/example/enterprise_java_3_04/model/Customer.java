package com.example.enterprise_java_3_04.model;

import jakarta.persistence.*;

//Entity tells JPA this class represent database table
@Entity
@Table(name = "customers")
public class Customer {

    //Columns fields into table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    //Column to store customer's name
    private String customerName;

    //Use the CustomerStatus and stores the enum as text ("GOLD/SILVER/NONE") instead of a numeric index.
    @Enumerated(EnumType.STRING)
    private CustomerStatus customerStatus;

    //total miles to understand the customer status Gold, Silver, none
    private Integer totalCustomerMileage;

    //Constructor empty for creating objects when fetching
    public Customer() {}

    public Customer(String customerName, CustomerStatus customerStatus, Integer totalCustomerMileage) {
        this.customerName = customerName;
        this.customerStatus = customerStatus;
        this.totalCustomerMileage = totalCustomerMileage;
    }

    //Getters & Setters
    public Integer getCustomerId() { return customerId; }
    public void setCustomerId(Integer customerId) { this.customerId = customerId; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public CustomerStatus getCustomerStatus() { return customerStatus; }
    public void setCustomerStatus(CustomerStatus customerStatus) { this.customerStatus = customerStatus; }

    public Integer getTotalCustomerMileage() { return totalCustomerMileage;}
    public void setTotalCustomerMileage(Integer totalCustomerMileage) { this.totalCustomerMileage = totalCustomerMileage; }
}
