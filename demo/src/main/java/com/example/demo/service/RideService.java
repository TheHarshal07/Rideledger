package com.example.demo.service;

import com.example.demo.dto.request.RideStartRequest;
import com.example.demo.dto.response.RideStartResponse;
import com.example.demo.entity.Driver;
import com.example.demo.entity.Ride;
import com.example.demo.mapper.RideMapper;
import com.example.demo.repository.DriverRepository;
import com.example.demo.repository.RideRepository;
import org.springframework.stereotype.Service;

@Service
public class RideService {

    /**
     * We are using constructor injection over field injection, why??
     * bcz, constructor injection ensure that, dependencies are mandatory, it enforces immutability with the final keyword
     * 1. Fail-fast mechanism: If dependencies are missing then, application fails to start, with @Autowired, you might find out at runtime when a
     *                          NullPointerException occurs.
       2. Immutability: You can declare dependencies as final, so they cannot modify after the object initialized, which makes code more thread-safe and reliable
     */
    private final RideRepository rideRepository;
    private final DriverRepository driverRepository;

    public RideService(RideRepository rideRepository, DriverRepository driverRepository) {
        this.rideRepository = rideRepository;
        this.driverRepository = driverRepository;
    }

    public RideStartResponse startRide(RideStartRequest request)
    {
        Driver driver = driverRepository.findById(request.getDriverId())
                .orElseThrow(() -> new RuntimeException("Driver not found"));

        Ride ride = RideMapper.toEntity(request, driver);  // transfer incoming request/data into entity;
        Ride savedRide = rideRepository.save(ride);

        return RideMapper.toResponse(savedRide); // transfering data coming from entity/database to client

}
}
