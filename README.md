# 🚀 Project On Microservice

A **Java Spring Boot Microservices** project demonstrating how independent services can communicate with each other using **Spring Cloud Eureka, REST APIs, Spring Data JPA, and MySQL**.

## 📌 About the Project

This project implements a **Microservices Architecture** using Java and Spring Boot.

The application consists of two main business services:

* **Product Service** – manages product-related operations.
* **Order Service** – manages order-related operations.

Both services register themselves with **Eureka Server**, which acts as the **Service Registry** and enables service discovery between the microservices.

The project demonstrates practical concepts such as **Microservices Architecture, Service Discovery, Inter-Service Communication, REST APIs, Database Integration, JPA, and Hibernate**.

## 🛠️ Tech Stack

| Technology         | Usage                        |
| ------------------ | ---------------------------- |
| ☕ Java             | Programming Language         |
| 🌱 Spring Boot     | Microservice Development     |
| ☁️ Spring Cloud    | Microservices Infrastructure |
| 🔍 Eureka Server   | Service Registry & Discovery |
| 🌐 REST API        | Inter-Service Communication  |
| 🗄️ MySQL          | Database                     |
| 🔗 Spring Data JPA | Database Access              |
| 🛠️ Hibernate      | ORM                          |
| 🔧 Maven           | Dependency Management        |
| 🧪 Postman         | API Testing                  |
| 💻 Git & GitHub    | Version Control              |

## 🏗️ Architecture

```text
                         ┌───────────────┐
                         │    Client     │
                         └───────┬───────┘
                                 │
                                 ▼
                       ┌───────────────────┐
                       │  Product Service  │
                       └─────────┬─────────┘
                                 │
                                 │ REST API
                                 │
                                 ▼
                       ┌───────────────────┐
                       │   Order Service   │
                       └─────────┬─────────┘
                                 │
                                 ▼
                            ┌─────────┐
                            │  MySQL  │
                            └─────────┘


                    ┌──────────────────────────┐
                    │      Eureka Server       │
                    │     Service Registry     │
                    └────────────┬─────────────┘
                                 │
                       ┌─────────┴─────────┐
                       │                   │
                       ▼                   ▼
                Product Service       Order Service
                   registers             registers
```

### 🔍 Service Discovery Flow

```text
Product Service ──────► Eureka Server
                              ▲
                              │
Order Service ────────────────┘

Eureka Server maintains the
location of registered services.
```

## 📂 Project Structure

```text
Project-On-Microservice/
│
├── eureka_server/
│   └── Spring Boot Eureka Server
│
├── Product_service/
│   └── Spring Boot Product Microservice
│
├── Order_service/
│   └── Spring Boot Order Microservice
│
└── README.md
```

## 🔹 Microservices

### 1. 🔍 Eureka Server

Eureka Server acts as the **Service Registry** for the application.

It maintains information about the available microservices and allows services to discover each other without hardcoding service locations.

**Responsibilities:**

* Service registration
* Service discovery
* Maintaining registered service information
* Providing service locations to other microservices

---

### 2. 📦 Product Service

The **Product Service** is responsible for managing product-related information.

**Responsibilities:**

* Create products
* Retrieve products
* Update products
* Delete products
* Store product information in MySQL

Example REST APIs:

```text
GET     /products
GET     /products/{id}
POST    /products
PUT     /products/{id}
DELETE  /products/{id}
```

---

### 3. 🛒 Order Service

The **Order Service** is responsible for managing customer orders.

**Responsibilities:**

* Create orders
* Retrieve orders
* Update orders
* Delete orders
* Communicate with Product Service
* Manage order information

Example REST APIs:

```text
GET     /orders
GET     /orders/{id}
POST    /orders
PUT     /orders/{id}
DELETE  /orders/{id}
```

> The exact endpoint names may vary depending on the controller implementation.

## 🔄 How the Application Works

1. **Eureka Server** starts first and acts as the Service Registry.
2. **Product Service** starts and registers itself with Eureka.
3. **Order Service** starts and registers itself with Eureka.
4. A client sends a request to the required microservice.
5. When Order Service needs information from Product Service, it can discover Product Service through Eureka.
6. The services communicate using REST APIs.
7. The required data is stored or retrieved from MySQL.
8. The response is returned to the client.

## ✨ Key Features

* ✅ Microservices Architecture
* ✅ Product Service
* ✅ Order Service
* ✅ Eureka Service Registry
* ✅ Service Discovery
* ✅ Inter-Service Communication
* ✅ RESTful APIs
* ✅ MySQL Database Integration
* ✅ Spring Data JPA
* ✅ Hibernate
* ✅ Exception Handling
* ✅ Maven Dependency Management
* ✅ Postman API Testing

## ⚙️ Getting Started

### Prerequisites

Make sure you have the following installed:

* Java 17 or later
* Maven
* MySQL
* Git
* Postman
* IntelliJ IDEA / Eclipse / VS Code

### Clone the Repository

```bash
git clone https://github.com/karuppanCodes/Project-On-Microservice.git
```

Navigate to the project:

```bash
cd Project-On-Microservice
```

## 🗄️ Database Configuration

Configure MySQL in the `application.properties` file of the respective services.

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/microservice_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> Replace the database name, username, and password according to your local MySQL configuration.

## ▶️ Running the Project

Start the services in the following order:

```text
1. Eureka Server
2. Product Service
3. Order Service
```

For each service, run:

```bash
mvn clean install
```

Then start the application:

```bash
mvn spring-boot:run
```

After starting the services, verify that **Product Service** and **Order Service** are registered with the Eureka Server.

## 🧪 API Testing

The APIs can be tested using **Postman**.

### Product Service

```text
GET     /products
GET     /products/{id}
POST    /products
PUT     /products/{id}
DELETE  /products/{id}
```

### Order Service

```text
GET     /orders
GET     /orders/{id}
POST    /orders
PUT     /orders/{id}
DELETE  /orders/{id}
```

## 📚 Concepts Demonstrated

This project demonstrates practical knowledge of:

* Microservices Architecture
* Spring Boot
* Spring Cloud
* Eureka Service Registry
* Service Discovery
* REST APIs
* Inter-Service Communication
* Dependency Injection
* Spring Data JPA
* Hibernate
* MySQL
* Exception Handling
* Maven
* Git & GitHub
* Postman

## 🔮 Future Enhancements

The project can be extended with:

* 🔹 API Gateway
* 🔹 Spring Cloud Config
* 🔹 Circuit Breaker using Resilience4j
* 🔹 Kafka for asynchronous communication
* 🔹 Redis caching
* 🔹 JWT Authentication & Authorization
* 🔹 Docker & Docker Compose
* 🔹 CI/CD Pipeline
* 🔹 AWS Cloud Deployment

## 👨‍💻 Author

**Gokulraj**

**Java Developer | Spring Boot | Microservices | SQL | DSA**

---

⭐ **If you find this project useful, consider giving it a star!**
