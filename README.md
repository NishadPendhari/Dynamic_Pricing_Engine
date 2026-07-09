# Dynamic Pricing Engine

## Description
Dynamic Pricing Engine is a Spring Boot application that calculates product prices dynamically based on pricing rules such as:

- Surge Pricing
- Time-Based Pricing
- Inventory-Based Pricing

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Swagger

## Features

- Product Management
- Pricing Rule Management
- Dynamic Price Calculation
- REST APIs
- Swagger Documentation

## Database

Create database:

```sql
CREATE DATABASE dynamic_pricing;
```

## Run Project

1. Import project into STS/Eclipse
2. Configure MySQL database
3. Run DynamicPricingApplication
4. Test APIs using Postman

## API Endpoints

### Product APIs

POST /products

GET /products

### Rule APIs

POST /rules

GET /rules

### Pricing API

GET /pricing/{productId}

## Swagger URL

http://localhost:8080/swagger-ui/index.html
