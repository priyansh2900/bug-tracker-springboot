Bug Tracker REST API

A backend REST API for managing software bugs/issues built using Java and Spring Boot.
This application allows users to create, view, update, and delete bug reports and demonstrates a clean layered backend architecture.

A RESTful backend application for tracking and managing software bugs/issues.
This project is built using Java and Spring Boot and demonstrates a clean backend architecture with database integration.

Tech Stack
	•	Java
	•	Spring Boot
	•	MySQL
	•	Spring Data JPA / Hibernate
	•	REST API
	•	Swagger UI
	•	Maven
	•	GitHub

Features
	•	Create a new bug report
	•	Retrieve all bug reports
	•	Retrieve a bug by ID
	•	Update bug details
	•	Delete bug reports
	•	RESTful API design
	•	Interactive API testing using Swagger UI

Project Architecture

The project follows a layered architecture commonly used in backend applications.

Controller Layer → Handles HTTP requests
Service Layer → Contains business logic
Repository Layer → Handles database operations
Entity Layer → Represents database tables

This structure improves maintainability and separates concerns within the application.

Project Structure
bug-tracker-springboot
│
├── src/main/java/com/priyansh/bugtracker
│   ├── controller
│   │   └── BugController.java
│   │
│   ├── service
│   │   └── BugService.java
│   │
│   ├── repository
│   │   └── BugRepository.java
│   │
│   ├── entity
│   │   └── Bug.java
│   │
│   └── BugtrackerApplication.java
│
├── src/main/resources
│   └── application.properties
│
└── pom.xml

API Endpoints
Method               Endpoint           Description
POST                 /bugs             Create a new bug
GET                  /bugs             Get all bugs
GET                 /bugs/{id}         Get bug by ID
PUT                 /bugs/{id}         Update bug
DELETE              /bugs/{id}         Delete bug

  Example Request
  create Bug
  POST/bugs
  {
  "title": "Login button bug",
  "description": "Login button not working",
  "status": "OPEN"
  }
  Running the Project Locally
  1.Clone the repository
  git clone https://github.com/priyansh2900/bug-tracker-springboot.git

  2.Open the project
  open the project in Intellij IDEA

  3. Configure the database
     Create a database in MySQL:
     CREATE DATABASE bugtracker;

     Update application.properties:
     spring.datasource.url=jdbc:mysql://localhost:3306/bugtracker
      spring.datasource.username=root
      spring.datasource.password=root

4. Run the application
   Run the main class:
   BugtrackerApplication.java

   API Documentation
   After running the application, open the Swagger UI in your browser:
   http://localhost:8080/swagger-ui/index.html
   Swagger from Swagger UI allows interactive testing of all API endpoints.

   Author

   Priyansh Chouhan
   Final Year Computer Science Engineering Student
     
