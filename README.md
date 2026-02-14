# Spring-cloud

![Java CI with Maven](https://github.com/castroy10/spring-cloud/actions/workflows/maven.yml/badge.svg)
![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.2-green)
![Spring Cloud](https://img.shields.io/badge/Spring_Cloud-2025.1.0-blue)
![Docker](https://img.shields.io/badge/Docker-Enabled-blue)
[![License](https://img.shields.io/github/license/castroy10/spring-cloud?logo=github)](LICENSE.md)
[![GitHub issues](https://img.shields.io/github/issues/castroy10/spring-cloud?logo=github)](https://github.com/castroy10/spring-cloud/issues)
[![GitHub stars](https://img.shields.io/github/stars/castroy10/spring-cloud?style=social&logo=github)](https://github.com/castroy10/spring-cloud/stargazers)

[🇷🇺 Русская версия](README_RU.md)

![Payload Module Showcase](.github/Screenshot_1.png)
![Web Module Showcase](.github/Screenshot_2.png)

Spring-cloud is a demonstration project showcasing a microservice architecture built with Spring Boot 4 and Spring Cloud 2025. It implements service discovery, centralized routing, and load balancing between multiple UI-based microservices.

## Features

- Service Discovery: Centralized registration and monitoring of all microservices using Netflix Eureka
- API Gateway: Single entry point for all requests with dynamic routing and load balancing
- Stylized UIs: Microservices include polished, responsive landing pages built with Thymeleaf and Bootstrap 5
- Docker Support: Full containerization with Docker Compose for easy deployment and scaling
- Optimized Sync: Fine-tuned Eureka settings for near-instant service discovery during development
- Modern Tech Stack: Built with Java 21 features and the latest Spring Framework standards

## Project Structure

- eurekaserver: The discovery server (Netflix Eureka) running on port 8761
- api-gateway: The entry point (Spring Cloud Gateway WebMVC) running on port 80
- payload: A microservice with a professional "Glow" themed UI, running on port 8082
- webmodule: A microservice with a modern "Glassmorphism" themed UI, running on port 8081

## Used Technologies

- Java 21
- Spring Boot 4.0.2
- Spring Cloud 2025.1.0 (Eureka, Gateway, LoadBalancer)
- Docker & Docker Compose
- Thymeleaf & Bootstrap 5
- Maven (Multi-module setup)

## Installation

### Using Docker (Recommended)

The easiest way to run the entire cluster is using Docker Compose.

1. Clone the repository:
```bash
git clone https://github.com/castroy10/spring-cloud.git
cd spring-cloud
```

2. Start all services:
```bash
docker-compose up --build
```

### Local Run (Manual)

1. Build the entire project:
```bash
mvn clean install
```

2. Run the services in the following order:
   - Start Eureka Server: `cd eurekaserver && mvn spring-boot:run`
   - Start Microservices: `cd payload && mvn spring-boot:run` and `cd webmodule && mvn spring-boot:run`
   - Start API Gateway: `cd api-gateway && mvn spring-boot:run`

## Usage

Once all services are started, you can access the microservices through the Gateway:

- Payload Module: `http://localhost/payload/`
- Web Module: `http://localhost/webmodule/`
- Eureka Dashboard: `http://localhost:8761`

## Development Configuration

The project is optimized for local development. Synchronization intervals for Eureka are set to 5 seconds to ensure that new service instances become available through the Gateway almost immediately.

```yaml
eureka:
  client:
    registry-fetch-interval-seconds: 5
  instance:
    lease-renewal-interval-in-seconds: 5
```
