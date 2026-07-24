🚕 RideLedger-Web

A QR-based fare reconciliation system for shared auto-rickshaws that helps drivers verify passenger payments and reduce fare leakage.

📌 Problem Statement

In shared auto-rickshaws, passengers usually pay through a single UPI QR code. Since the driver cannot verify which passenger has actually completed the payment, some passengers leave without paying.

This project aims to solve over 90% of this problem by introducing ride-specific payment tokens that allow drivers to track which payments are completed and which are still pending.

🚀 Features
👤 Driver Registration
🚖 Start a New Ride
🎟️ Automatic Payment Token Generation
🔒 Unique Token for Every Passenger
📊 Real-time Payment Status Tracking
⚠️ Duplicate Token Generation Prevention
✅ Input Validation using Jakarta Validation
🌍 Global Exception Handling
🏗️ Clean Layered Architecture
🔄 DTO & Mapper Based Design
💾 Transaction Management using @Transactional
🏛️ Architecture
                Client / Postman
                        │
                        ▼
                 REST Controller
                        │
                        ▼
                  Service Layer
          (Business Logic & Validation)
                        │
                        ▼
                    Mapper Layer
        (DTO ↔ Entity Conversion)
                        │
                        ▼
                Repository Layer
                        │
                        ▼
                     MySQL Database
🗄️ Database Design
Driver
Field	Type
id	Long
name	String
upiId	String
Ride
Field	Type
id	Long
driver_id	FK
farePerPerson	BigDecimal
totalPassengers	Integer
startTime	LocalDateTime
endTime	LocalDateTime
status	ACTIVE / COMPLETED / CANCELLED
PassengerPayment
Field	Type
id	Long
ride_id	FK
paymentToken	UUID
paymentStatus	PENDING / PAID
createdAt	LocalDateTime
paidAt	LocalDateTime
🔄 Project Flow
Driver Registration
        │
        ▼
Start Ride
        │
        ▼
Generate Payment Tokens
        │
        ▼
Passenger Scans Token (Future UI)
        │
        ▼
Payment Status Updated
        │
        ▼
Driver Dashboard
        │
        ▼
End Ride
🧩 Tech Stack
Category	Technology
Language	Java 17
Framework	Spring Boot
ORM	Spring Data JPA
Database	MySQL
Build Tool	Maven
Validation	Jakarta Validation
API Testing	Postman
Version Control	Git & GitHub
📂 Project Structure
src
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 │     ├── request
 │     └── response
 ├── mapper
 ├── enums
 ├── exception
 └── config
🧠 Backend Concepts Demonstrated
RESTful API Design
Layered Architecture
SOLID Principles
DTO Pattern
Entity Mapping
Exception Handling
Global Exception Handling
Transaction Management
Validation
UUID Token Generation
JPA Relationships
Optional API
Clean Code Practices
📌 Current APIs
Method	Endpoint	Description
POST	/drivers	Register Driver
POST	/ride/start	Start New Ride
POST	/ride/{rideId}/generate-tokens	Generate Passenger Payment Tokens
🚀 Planned Features
QR Code Generation
Web Dashboard for Drivers
Payment Simulation Module
Passenger Payment API
Ride Completion API
Payment Analytics
Ride History
JWT Authentication
Docker Deployment
Unit & Integration Testing
Redis Token Cache
Swagger/OpenAPI Documentation
💡 Design Decisions
Separate DTOs for API contracts
Entity models isolated from API layer
Global exception handling using @RestControllerAdvice
Validation using Jakarta Bean Validation
UUID-based unique payment tokens
Transaction-safe token generation using @Transactional
Repository pattern with Spring Data JPA
🎯 Motivation

This project was inspired by a real-life observation during a shared auto-rickshaw ride, where digital payments made it difficult for drivers to verify which passengers had paid. RideLedger-Web is an attempt to bridge this small technological gap with a simple, scalable backend solution.
