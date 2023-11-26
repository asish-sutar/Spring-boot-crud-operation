# Spring Boot CRUD Application

This is a simple Spring Boot application demonstrating CRUD (Create, Read, Update, Delete) operations for a `Student` entity.

## Endpoints

### Save Student
- **Endpoint:** `POST /student/save`
- **Description:** Saves a new student.
- **Request Body:** JSON representing the student entity.

### Get All Students
- **Endpoint:** `GET /student/getAll`
- **Description:** Retrieves a list of all students.

### Get Student by ID
- **Endpoint:** `GET /student/getById/{id}`
- **Description:** Retrieves a student by the specified ID.

### Delete All Students
- **Endpoint:** `DELETE /student/deleteAll`
- **Description:** Deletes all students.

### Delete Student by ID
- **Endpoint:** `DELETE /student/delete/{id}`
- **Description:** Deletes a student by the specified ID.

### Update Student
- **Endpoint:** `PUT /student/update/{id}`
- **Description:** Updates a student by the specified ID.
- **Request Body:** JSON representing the updated student entity.

## Getting Started
1. Clone this repository.
2. Build the project using your preferred build tool (e.g., Maven or Gradle).
3. Run the application.
4. Access the API through the provided endpoints.

## Technologies Used
- Spring Boot
- Spring Data JPA
- PostgreSQL (Database)

Feel free to explore, contribute, and use this project as a learning resource!

