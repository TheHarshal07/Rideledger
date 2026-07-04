package com.example.demo.dto.request;

import java.util.List;

public class GenerateTokenResponse {
    private Long rideId;
    private List<PaymentTokenResponse> tokes;

    public Long getRideId() {
        return rideId;
    }

    public void setRideId(Long rideId) {
        this.rideId = rideId;
    }

    public List<PaymentTokenResponse> getTokes() {
        return tokes;
    }

    public void setTokes(List<PaymentTokenResponse> tokes) {
        this.tokes = tokes;
    }
}
