package com.example.demo.entity;

import com.example.demo.enums.PaymenStaus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="passenger_dtls")
public class PassengerPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ride_id", nullable = false) // @JoinColumn make sure which table has foreign key
    private Ride ride;

    @Column(nullable = false, unique = true)
    private String token;

    @Column(nullable = false)
    private PaymenStaus paymenStaus;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    private LocalDateTime paidAt;
}
