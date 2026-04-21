package com.example.demo.repository;

import com.example.demo.entity.PassengerPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<PassengerPayment, Long> {
}
