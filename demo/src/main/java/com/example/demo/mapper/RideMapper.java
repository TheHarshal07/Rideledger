package com.example.demo.mapper;

import com.example.demo.dto.request.RideStartRequest;
import com.example.demo.dto.response.RideStartResponse;
import com.example.demo.entity.Driver;
import com.example.demo.entity.Ride;
import com.example.demo.enums.RideStatus;

import java.time.LocalDateTime;

public class RideMapper {
    public static Ride toEntity(RideStartRequest request, Driver driver)
    {
        Ride ride = new Ride();
        ride.setDriver(driver);
        ride.setFarePerson(request.getFarePerPerson());
        ride.setTotalPassenger(request.getTotalPassengers());
        ride.setStartTime(LocalDateTime.now());
        ride.setStatus(RideStatus.ACTIVE);

        return ride;
    }

    public static RideStartResponse toResponse(Ride ride)
    {
        RideStartResponse response = new RideStartResponse();
        response.setRideId(ride.getId());
        response.setStatus(ride.getStatus().name());
        response.setMessage("Ride started successfully");

        return  response;
    }

}
