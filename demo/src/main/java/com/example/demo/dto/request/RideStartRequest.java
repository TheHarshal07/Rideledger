package com.example.demo.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class RideStartRequest {
    private Long driverId;

    @NotNull(message = "farePerperson cannot be blank")
    private BigDecimal farePerPerson;
    @NotNull(message = "totalPassengers cannot be blank")
    private Integer totalPassengers;

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public BigDecimal getFarePerPerson() {
        return farePerPerson;
    }

    public void setFarePerPerson(BigDecimal farePerPerson) {
        this.farePerPerson = farePerPerson;
    }

    public Integer getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(Integer totalPassengers) {
        this.totalPassengers = totalPassengers;
    }
}
