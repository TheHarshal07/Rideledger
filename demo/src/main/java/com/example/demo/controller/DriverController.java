package com.example.demo.controller;

import com.example.demo.dto.request.DriverRequest;
import com.example.demo.dto.response.DriverResponse;
import com.example.demo.entity.Driver;
import com.example.demo.service.DriverService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/driver")
public class DriverController {

    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping
    public DriverResponse createDriver(
            @Valid @RequestBody DriverRequest driver)
    {
        return driverService.addDriver(driver);
    }

    @PutMapping("/{id}")
    public Driver updateDriver(@PathVariable Long id, @RequestBody Driver driver)
    {
        return driverService.updateDriver(id, driver);
    }
}
