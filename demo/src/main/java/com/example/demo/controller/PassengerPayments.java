package com.example.demo.controller;

import com.example.demo.dto.request.GenerateTokenResponse;
import com.example.demo.service.PassengerPaymentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passenger")
public class PassengerPayments {

    private PassengerPaymentService passengerPaymentService;

    public PassengerPayments(PassengerPaymentService passengerPaymentService)
    {
        this.passengerPaymentService = passengerPaymentService;
    }

    @PostMapping("/{rideId}/generate-tokens")
    public GenerateTokenResponse generateTokens(@PathVariable Long rideId)
    {
        return passengerPaymentService.generateTokens(rideId);
    }
}
