package com.example.demo.service;

import com.example.demo.entity.Driver;
import com.example.demo.repository.DriverRespository;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    private final DriverRespository driverRespository;

    public DriverService(DriverRespository driverRespository) {
        this.driverRespository = driverRespository;
    }

    public Driver addDriver(Driver driver)
    {
        return driverRespository.save(driver);
    }

    public Driver updateDriver(Long id, Driver driver)
    {
        Driver existing = driverRespository.findById(id)
                .orElseThrow(() -> new RuntimeException("Driver not found"));

        existing.setName(driver.getName());
        existing.setUpiId(driver.getUpiId());

        return driverRespository.save(existing);
    }
}
