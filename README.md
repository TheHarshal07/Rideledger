# 🚕 RideLedger-Web

> **A QR-based fare reconciliation system for shared auto-rickshaws that helps drivers verify passenger payments and reduce fare leakage.**

---

## 📌 Problem Statement

In shared auto-rickshaws, passengers usually pay using a common UPI QR code. Since the driver cannot verify who actually completed the payment, some passengers leave without paying.

**RideLedger-Web** addresses this challenge by generating **unique payment tokens** for every passenger in a ride, allowing drivers to track payment status and significantly reduce fare leakage.

---

## ✨ Features

- 👤 Driver Registration
- 🚖 Start a Ride
- 🎟️ Automatic Payment Token Generation
- 🔑 Unique Token for Every Passenger
- 📊 Real-time Payment Status Tracking
- ⚠️ Duplicate Token Prevention
- ✅ Request Validation using Jakarta Validation
- 🌍 Global Exception Handling
- 🔄 DTO & Mapper Pattern
- 💾 Transaction Management
- 🏗️ Layered Architecture following SOLID Principles

---

## 🏛️ System Architecture

```text
                 Client (Web / Postman)
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
```

---

# 🗄️ Database Schema

## Driver

| Column | Type |
|---------|------|
| id | Long |
| name | String |
| upiId | String |

---

## Ride

| Column | Type |
|---------|------|
| id | Long |
| driver_id | FK |
| farePerPerson | BigDecimal |
| totalPassengers | Integer |
| startTime | LocalDateTime |
| endTime | LocalDateTime |
| status | ACTIVE / COMPLETED / CANCELLED |

---

## PassengerPayment

| Column | Type |
|---------|------|
| id | Long |
| ride_id | FK |
| paymentToken | UUID |
| paymentStatus | PENDING / PAID |
| createdAt | LocalDateTime |
| paidAt | LocalDateTime |

---

# 🔄 Project Flow

```text
Driver Registration
        │
        ▼
Start Ride
        │
        ▼
Generate Payment Tokens
        │
        ▼
Passenger Pays (Future UI)
        │
        ▼
Payment Status Updated
        │
        ▼
Driver Dashboard
        │
        ▼
End Ride
```

---

# 🛠️ Tech Stack

| Category | Technology |
|----------|------------|
| Language | Java 17 |
| Framework | Spring Boot |
| ORM | Spring Data JPA |
| Database | MySQL |
| Validation | Jakarta Bean Validation |
| Build Tool | Maven |
| API Testing | Postman |
| Version Control | Git & GitHub |

---

# 📂 Project Structure

```text
src
├── controller
├── service
├── repository
├── entity
├── dto
│   ├── request
│   └── response
├── mapper
├── enums
├── exception
└── config
```

---

# 🧠 Backend Concepts Demonstrated

- RESTful API Design
- Layered Architecture
- SOLID Principles
- DTO Pattern
- Entity Relationships
- Global Exception Handling
- Bean Validation
- UUID Token Generation
- Transaction Management
- Optional API
- Clean Code Practices

---

# 📡 REST APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/drivers` | Register Driver |
| POST | `/ride/start` | Start New Ride |
| POST | `/ride/{rideId}/generate-tokens` | Generate Payment Tokens |

---

# 🚀 Future Enhancements

- QR Code Generation
- Driver Dashboard
- Payment Simulation
- Ride Completion API
- Ride History
- Payment Analytics
- JWT Authentication
- Docker Support
- Swagger/OpenAPI Documentation
- Unit & Integration Testing

---

# 💡 Design Decisions

- Layered Architecture
- DTOs for Request & Response
- Entity-DTO Mapping
- Global Exception Handling
- UUID-based Payment Tokens
- Transaction-safe Operations
- Repository Pattern using Spring Data JPA

---

# 🎯 Motivation

This project was inspired by a real-life observation during a shared auto-rickshaw ride. Drivers often struggle to verify QR payments made by multiple passengers, resulting in daily revenue loss.

RideLedger-Web aims to bridge this gap with a simple, scalable backend solution focused on payment verification and transparency.

---

# 📌 Resume Highlights

- Designed a backend system to address fare reconciliation challenges in shared public transport.
- Implemented token-based payment verification without requiring passenger registration.
- Built using Spring Boot with layered architecture, DTOs, JPA relationships, transaction management, and global exception handling.
- Followed SOLID principles and clean coding practices to build a scalable backend application.

---

## ⭐ If you found this project interesting, feel free to star the repository!
