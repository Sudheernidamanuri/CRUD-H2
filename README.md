# CRUD-H2

A simple Spring Boot project demonstrating **CRUD (Create, Read, Update, Delete)** operations using an H2 in-memory database. This project includes RESTful APIs for managing data, along with JPA and Hibernate integration for persistence.

## Features
- CRUD operations for entity management
- RESTful API endpoints (POST, GET, PUT, DELETE)
- Integration with H2 in-memory database (no external DB required)
- JPA/Hibernate for ORM and data persistence
- Example data and easy reset with H2 Console

## Prerequisites
- Java 8 or later
- Maven

## Getting Started
1. **Clone the repository:**
   ```bash
   git clone https://github.com/Sudheernidamanuri/CRUD-H2.git
   ```
2. **Build the project:**
   ```bash
   cd CRUD-H2
   mvn clean install
   ```
3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```
4. **Access the application:**
   - API base URL: `http://localhost:8080/api/` (adjust if different in your config)
   - H2 Console: `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:testdb`)

## API Endpoints

| Method | Endpoint             | Description           |
|--------|----------------------|-----------------------|
| GET    | /api/entities        | Get all entities      |
| GET    | /api/entities/{id}   | Get entity by id      |
| POST   | /api/entities        | Create new entity     |
| PUT    | /api/entities/{id}   | Update entity by id   |
| DELETE | /api/entities/{id}   | Delete entity by id   |

> **Tip:** Replace `entities` with your entity name (e.g., `users`, `products`) as appropriate for your project.

## Configuration
- App properties are located at `src/main/resources/application.properties`.
- The H2 console is enabled for development and testing.
- H2 database is in-memory and resets on each restart.

## Example cURL Commands
```bash
# Create an entity
curl -X POST -H "Content-Type: application/json" -d '{"name":"example"}' http://localhost:8080/api/entities

# Get all entities
curl http://localhost:8080/api/entities

# Update an entity
curl -X PUT -H "Content-Type: application/json" -d '{"name":"updated"}' http://localhost:8080/api/entities/1

# Delete an entity
curl -X DELETE http://localhost:8080/api/entities/1
```

## Screenshots
_Add screenshots of API responses or UI if available._

## License

This project is open source and available under the [MIT License](LICENSE).
