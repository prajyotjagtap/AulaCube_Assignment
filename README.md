# AulaCube_Assignment
This is a simple Employee Management System and Department Management System implemented using Spring Boot, PostgreSQL, and MongoDB. The system allows performing CRUD operations on employees and departments.

# Employee Management System

## Setup Instructions

1. Clone the Repository:
   
2. Run the Application:
   - Make sure you have PostgreSQL and MongoDB installed and running.
   - Configure your database details in `application.properties`.
   - Run the Spring Boot application:
     

3. Access the Application:
   - The application will be available at `http://localhost:8080`.

4. Postman Collection:
   - Import the provided Postman collection for testing the API: (Download the json file which is added to this repo)

## API Endpoints

### 1. Get All Employees

Request:
GET /api/employees

Response:
json
[
  {
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "departmentId": "IT",
    "createdAt": "2023-11-04T12:00:00Z",
    "updatedAt": "2023-11-04T12:30:00Z"
  }
]

### 2. Get Employee by ID

Request:

GET /api/employees/{id}

Response (Success):
{
  "id": 1,
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "departmentId": "IT",
  "createdAt": "2023-11-04T12:00:00Z",
  "updatedAt": "2023-11-04T12:30:00Z"
}


### 3. Create Employee

Request:
POST /api/employees
Content-Type: application/json
{
  "firstName": "Alice",
  "lastName": "Smith",
  "email": "alice.smith@example.com",
  "departmentId": "HR"
}

Response:
{
  "id": 2,
  "firstName": "Alice",
  "lastName": "Smith",
  "email": "alice.smith@example.com",
  "departmentId": "HR",
  "createdAt": "2023-11-04T13:00:00Z",
  "updatedAt": "2023-11-04T13:00:00Z"
}

### 4. Update Employee

Request:
PUT /api/employees/{id}
Content-Type: application/json

{
  "firstName": "Updated",
  "lastName": "Name",
  "email": "updated.name@example.com",
  "departmentId": "Finance"
}

Response (Success):
{
  "id": 1,
  "firstName": "Updated",
  "lastName": "Name",
  "email": "updated.name@example.com",
  "departmentId": "Finance",
  "createdAt": "2023-11-04T12:00:00Z",
  "updatedAt": "2023-11-04T13:30:00Z"
}


### 5. Delete Employee

Request:
DELETE /api/employees/{id}

Response (Success):
"Employee with ID 1 deleted successfully"


Feel free to use the provided Postman collection for easier testing and exploration of the API.

Make sure to replace placeholders like `{id}` and update the URLs according to your actual API structure. Additionally, you can use Postman collection is in the same directory as the README file.


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


# Department Management System

This is a simple Department Management System implemented using Spring Boot and MongoDB. The system allows performing CRUD operations on departments.

## Setup Instructions

1. Clone the Repository:
  
2. Run the Application:
   - Make sure you have MongoDB installed and running.
   - Configure your MongoDB details in `application.properties`.
   - Run the Spring Boot application:
     

3. Access the Application:
   - The application will be available at `http://localhost:8080`.

4. Postman Collection:
   - Import the provided Postman collection for testing the API: (Download the json file which is added to this repo)

## API Endpoints

### 1. Get All Departments

Request:
GET /api/departments


Response:
[
  {
    "departmentId": "auto-generated-id-1",
    "departmentName": "Information Technology",
    "createdAt": "2023-11-04T12:00:00Z",
    "updatedAt": "2023-11-04T12:30:00Z"
  }
]

### 2. Get Department by ID

Request:
GET /api/departments/{departmentId}

Response (Success):
{
  "departmentId": "auto-generated-id-1",
  "departmentName": "Information Technology",
  "createdAt": "2023-11-04T12:00:00Z",
  "updatedAt": "2023-11-04T12:30:00Z"
}


### 3. Create Department

Request:
POST /api/departments
Content-Type: application/json

{
  "departmentName": "Human Resources"
}


Response:
{
  "departmentId": "auto-generated-id-2",
  "departmentName": "Human Resources",
  "createdAt": "2023-11-04T13:00:00Z",
  "updatedAt": "2023-11-04T13:00:00Z"
}

### 4. Update Department

Request:
PUT /api/departments/{departmentId}
Content-Type: application/json

{
  "departmentName": "Updated Department"
}

Response (Success):
{
  "departmentId": "auto-generated-id-1",
  "departmentName": "Updated Department",
  "createdAt": "2023-11-04T12:00:00Z",
  "updatedAt": "2023-11-04T13:30:00Z"
}


### 5. Delete Department

Request:
DELETE /api/departments/{departmentId}

Response (Success):
"Department with ID auto-generated-id-1 deleted successfully"

Feel free to use the provided Postman collection for easier testing and exploration of the API.

Note: The `departmentId` is auto-generated and provided in the response when creating a new department. Ensure you use the correct `departmentId` in subsequent requests.
{
  "departmentId": "auto-generated-id-2",
  "departmentName": "Human Resources",
  "createdAt": "2023-11-04T13:00:00Z",
  "updatedAt": "2023-11-04T13:00:00Z"
}
