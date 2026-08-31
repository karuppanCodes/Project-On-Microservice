# 🚀 Project On Microservice

A **Java Spring Boot Microservices** project designed to demonstrate how a monolithic application can be developed as a collection of independent, scalable, and maintainable services.

## 📌 About the Project

This project demonstrates the implementation of a **Microservices Architecture** using Java and Spring Boot. Each service is responsible for a specific business functionality and communicates with other services through REST APIs.

The project focuses on important concepts such as **Service Discovery, API Gateway, Inter-Service Communication, Database Integration, and centralized configuration**.

## 🛠️ Tech Stack

| Technology      | Usage                        |
| --------------- | ---------------------------- |
| ☕ Java          | Programming Language         |
| 🌱 Spring Boot  | Backend Framework            |
| 🔗 Spring Cloud | Microservices Infrastructure |
| 🌐 REST API     | Service Communication        |
| 🚪 API Gateway  | Request Routing              |
| 🔍 Eureka       | Service Discovery            |
| 🗄️ MySQL       | Database                     |
| 🔧 Maven        | Dependency Management        |
| 🧪 Postman      | API Testing                  |
| 💻 Git & GitHub | Version Control              |

## 🏗️ Architecture

```text
                    ┌───────────────┐
                    │    Client     │
                    └───────┬───────┘
                            │
                            ▼
                  ┌───────────────────┐
                  │    API Gateway    │
                  └─────────┬─────────┘
                            │
             ┌──────────────┼──────────────┐
             ▼              ▼              ▼
      ┌────────────┐ ┌────────────┐ ┌────────────┐
      │  Service 1 │ │  Service 2 │ │  Service 3 │
      │            │ │            │ │            │
      │  User      │ │  Product   │ │  Order     │
      │  Service   │ │  Service   │ │  Service   │
      └─────┬──────┘ └─────┬──────┘ └─────┬──────┘
            │              │              │
            ▼              ▼              ▼
        ┌───────┐      ┌───────┐      ┌───────┐
        │ MySQL │      │ MySQL │      │ MySQL │
        └───────┘      └───────┘      └───────┘

                  ┌───────────────────┐
                  │  Eureka Server    │
                  │ Service Discovery │
                  └───────────────────┘
```

## 📂 Project Structure

```text
Project-On-Microservice/
│
├── api-gateway/
│
├── service-registry/
│
├── user-service/
│
├── product-service/
│
├── order-service/
│
├── pom.xml
│
└── README.md
```

## ✨ Key Features

* ✅ Microservices-based architecture
* ✅ Independent services
* ✅ RESTful APIs
* ✅ API Gateway
* ✅ Service Discovery using Eureka
* ✅ Inter-service communication
* ✅ MySQL database integration
* ✅ Exception handling
* ✅ Input validation
* ✅ Maven dependency management
* ✅ API testing using Postman

## 🔄 How It Works

1. The client sends a request to the **API Gateway**.
2. The API Gateway identifies the required microservice.
3. **Eureka Server** helps locate the available service instance.
4. The request is forwarded to the appropriate microservice.
5. The microservice performs the required business operation.
6. Data is stored or retrieved from the database.
7. The response is returned to the client through the API Gateway.

## ⚙️ Getting Started

### Prerequisites

Make sure you have the following installed:

* Java 17 or later
* Maven
* MySQL
* Git
* Postman
* IDE such as IntelliJ IDEA or Eclipse

### Clone the Repository

```bash
git clone https://github.com/karuppanCodes/Project-On-Microservice.git
```

### Configure Database

Create the required MySQL databases and update the database configuration in each service's:

```text
application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/microservice_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Run the Project

Start the services in the following order:

```text
1. Service Registry
2. API Gateway
3. User Service
4. Product Service
5. Order Service
```

Build each service using:

```bash
mvn clean install
```

Run using:

```bash
mvn spring-boot:run
```

## 🧪 API Testing

The APIs can be tested using **Postman**.

Example endpoints:

```text
GET    /users
POST   /users
GET    /products
POST   /products
GET    /orders
POST   /orders
```

> Endpoint names may vary depending on the implementation of each microservice.

## 📚 Concepts Demonstrated

This project helps demonstrate practical knowledge of:

* Microservices Architecture
* Spring Boot
* Spring Cloud
* REST APIs
* Service Discovery
* API Gateway
* Dependency Injection
* JPA & Hibernate
* MySQL
* Exception Handling
* Maven
* Git & GitHub

## 🔮 Future Enhancements

* 🔹 Docker containerization
* 🔹 Docker Compose
* 🔹 Kafka for asynchronous communication
* 🔹 Redis caching
* 🔹 Spring Cloud Config
* 🔹 Circuit Breaker using Resilience4j
* 🔹 Authentication & Authorization using JWT
* 🔹 CI/CD pipeline
* 🔹 Deployment to AWS

## 👨‍💻 Author

**Gokulraj**

Java Developer | Spring Boot | Microservices | SQL | DSA

---

⭐ **If you find this project useful, consider giving it a star!**
