package com.example.demo.mapper;

import com.example.demo.controller.PassengerPayments;
import com.example.demo.entity.PassengerPayment;
import com.example.demo.entity.Ride;
import com.example.demo.enums.PaymenStaus;

import java.time.LocalDateTime;
import java.util.UUID;

public class PassengerMapper {

    public static PassengerPayment toEntity(Ride ride)
    {
        PassengerPayment payment = new PassengerPayment();
        payment.setRide(ride);
        payment.setToken(UUID.randomUUID().toString());
        payment.setPaymenStaus(PaymenStaus.PENDING);
        payment.setCreatedAt(LocalDateTime.now());

        return payment;
    }

}
