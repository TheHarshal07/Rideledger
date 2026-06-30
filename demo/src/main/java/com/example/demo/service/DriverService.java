package com.example.demo.service;

import com.example.demo.dto.request.DriverRequest;
import com.example.demo.dto.response.DriverResponse;
import com.example.demo.entity.Driver;
import com.example.demo.mapper.DriverMapper;
import com.example.demo.repository.DriverRepository;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    private final DriverRepository driverRespository;

    public DriverService(DriverRepository driverRespository) {
        this.driverRespository = driverRespository;
    }

    public DriverResponse addDriver(DriverRequest driverData)
    {
        Driver driver = new Driver();
        driverData.setId(driverData.getId());
        driverData.setName(driverData.getName());
        driverData.setUpiId(driverData.getUpiId());

        Driver savedDetails = driverRespository.save(driver);
        return DriverMapper.toResponse(savedDetails);
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
