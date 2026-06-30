package com.example.demo.mapper;

import com.example.demo.dto.request.DriverRequest;
import com.example.demo.dto.response.DriverResponse;
import com.example.demo.entity.Driver;

public class DriverMapper {
    public static DriverResponse toResponse(Driver driver)
    {
        DriverResponse driverResponse = new DriverResponse();
        driverResponse.setMessage("Driver details created");
        return driverResponse;
    }
}
