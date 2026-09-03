# Spring Boot 3.5 Blueprint

## Overview

**Spring Boot 3.5** is a Harbormaster blueprint that captures the typical core capabilities required to create a Spring Boot system.

The blueprint provides a complete RESTful backend with persistence options, controller classes, service-layer architecture, testing, build support, and database integration.

## Blueprint Information

| Property               | Value             |
| ---------------------- |-------------------|
| **Name**               | Spring Boot 3.5   |
| **Short Name**         | `SpringBoot-3.5`  |
| **Version**            | 1.1.1             |
| **Type**               | Firstclass        |
| **Release Status**     | Production        |
| **Technology Source**  | Open Source       |
| **Derived From**       | Spring Boot 2.5   |
| **Major Technology**   | SpringBoot        |
| **Primary Vendor**     | Broadcom          |
| **Category**           | Backend Framework |
| **Design Pattern**     | Service Layer     |
| **Architecture Style** | Layered           |
| **Docker Support**     | Yes               |
| **Kubernetes Support** | Yes               |
| **Published**          | Yes               |

## Capabilities

The blueprint is designed to generate a Spring Boot backend incorporating:

* RESTful API web services
* Controller classes
* Service-layer architecture
* Persistence
* Database integration
* Core functionality testing
* Maven-based build and deployment
* Docker support
* Kubernetes support

## Supported Languages

| Language   | Version |
| ---------- | ------- |
| Java       | 17      |
| Kotlin     | —       |
| JavaScript | —       |

## Technology Stack

| Technology     | Layer    | Purpose                                                                    |
| -------------- | -------- | -------------------------------------------------------------------------- |
| **SpringBoot** | Business | RESTful API web services backend                                           |
| **JUnit**      | Test     | Testing core functionality                                                 |
| **Maven**      | Build    | Build, commit, package, deploy and run modules                             |
| **RDBMS**      | Data     | Relational persistence options including H2, MySQL, PostgreSQL and MongoDB |
| **MongoDB**    | Data     | Document-based persistence                                                 |

## Architecture

The blueprint uses a **Layered Architecture** with the **Service Layer** design pattern.

```text
                Spring Boot 3.5
                       │
                       ▼
              RESTful API Layer
                       │
                       ▼
                 Service Layer
                       │
                       ▼
              Persistence / Data
                 ┌─────┴─────┐
                 ▼           ▼
              RDBMS       MongoDB
```

## Supported Use Cases

The blueprint identifies the following use cases:

* Portal
* SaaS
* REST API
* Microservices
* Marketplace
* Financial Services
* Healthcare
* Supply Chain
* Event-Driven Systems

## Metadata

```text
spring boot
java
layered architecture
service layer
rest api
spring data jpa
hibernate
postgresql
docker
microservices
```

## Harbormaster Production Model

The Spring Boot 3.5 blueprint is intended to be used as executable production knowledge within Harbormaster.

```text
Domain Model
      │
      ▼
Spring Boot 3.5 Blueprint
      │
      ├── Architecture
      ├── Application Components
      ├── Persistence
      ├── Testing
      ├── Build
      └── Deployment
      │
      ▼
Generated Spring Boot System
```

The result is a repeatable starting point for producing Spring Boot systems rather than manually recreating the same architectural and technical foundation for every application.

## Blueprint Assets

**Blueprint Icon**

`blueprints/spring-boot-blueprint-header-image.png`

**Hero Image**

`http://www.harbormaster.net/images/blueprints/spring.boot.hero.png`

**Architecture Preview**

`blueprints/architecture.diagrams/spring-boot-blueprint-system-diagram.png`

**Information Page**

`https://harbormaster.net/springboot.35.blueprint/`

---

[<<< return](../README.md)
