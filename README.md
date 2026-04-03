# Personal Finance Service

This is the backend service for the Personal Finance Manager application. It is a Java Spring Boot application that provides a REST API for managing financial transactions, categories, and users.

## Architecture

The backend is a standard Spring Boot application with the following structure:
- **`com.example.financemanager.controller`**: Contains REST API controllers.
- **`com.example.financemanager.model`**: Contains JPA entities (`Transaction`, `Category`, `User`).
- **`com.example.financemanager.repository`**: Contains Spring Data JPA repositories.
- **`com.example.financemanager.service`**: Contains business logic.

The backend uses an in-memory H2 database, which is seeded with initial data from `src/main/resources/data.sql`.

## Getting Started

### Prerequisites
- Java 17

### Running the application
To start the application, run the following command from the root of this directory:
```bash
./mvnw spring-boot:run
```

The application will be available at `http://localhost:8080`.

### Running Tests
To run the tests, use the following command:
```bash
./mvnw test
```

### H2 Console
The H2 database console is available at `http://localhost:8080/h2-console`.
- **URL:** `jdbc:h2:mem:testdb`
- **User:** `sa`
- **Pass:** `password`

## Admin Functionality

The application includes an admin dashboard for managing users and categories. The default admin credentials are `admin` / `password`.
