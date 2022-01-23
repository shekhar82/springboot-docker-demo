package com.example.shekhar82.demo.adapters.repositories;

import com.example.shekhar82.demo.adapters.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Long> {
}
