package com.example.enterprise_java_3_04.repository;

import com.example.enterprise_java_3_04.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
