package com.example.demo.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class DriverRequest {


    String id;
    @Size(min = 2, max = 50)
    @NotBlank (message = "Driver name cannot be empty")
    String name;

    @NotBlank(message = "UPI ID cannot be empty")
    String upiId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }
}
