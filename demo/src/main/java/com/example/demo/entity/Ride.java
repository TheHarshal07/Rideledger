package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name="Ride_dtls")
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long driver_id;
    private BigDecimal farePerson;
    private int totalPassenger;
    private String status;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
