package com.example.demo.controller;

import com.example.demo.dto.request.RideStartRequest;
import com.example.demo.dto.response.RideStartResponse;
import com.example.demo.service.RideService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ride")
public class RideController {

    private final RideService rideService;

    public RideController(RideService rideService)
    {
        this.rideService = rideService;
    }

    @PostMapping("/start")
    public ResponseEntity<RideStartResponse> startRide(
           @Valid @RequestBody RideStartRequest request)
    {
        return ResponseEntity.ok(rideService.startRide(request));
    }

}
