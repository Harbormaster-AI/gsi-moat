# Spring Boot 2.5 Blueprint

## Overview

**Spring Boot 2.5** is a Harbormaster blueprint that captures the typical core capabilities required to create a Spring Boot 2.5 system.

The blueprint provides a complete RESTful backend with persistence options, controller classes, service-layer architecture, testing, build support, and database integration.

## Blueprint Information

| Property               | Value             |
| ---------------------- | ----------------- |
| **Name**               | Spring Boot 2.5   |
| **Short Name**         | `SpringBoot-2.5`  |
| **Version**            | 2.9               |
| **Type**               | Firstclass        |
| **Release Status**     | Alpha             |
| **Technology Source**  | Open Source       |
| **Derived From**       | spring-boot-core  |
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
| Java       | 11      |
| Kotlin     | —       |
| JavaScript | —       |

## Technology Stack

| Technology     | Layer    | Purpose                                                     |
| -------------- | -------- | ----------------------------------------------------------- |
| **SpringBoot** | Business | RESTful API web services backend                            |
| **JUnit**      | Test     | Testing core functionality                                  |
| **Maven**      | Build    | Build, commit, package, deploy and run modules              |
| **RDBMS**      | Data     | Storage options including H2, MySQL, PostgreSQL and MongoDB |
| **MongoDB**    | Data     | Document-based persistence                                  |

## Architecture

The blueprint uses a **Layered Architecture** with the **Service Layer** design pattern.

```text
                Spring Boot 2.5
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

The Spring Boot 2.5 blueprint is intended to be used as executable production knowledge within Harbormaster.

```text
Domain Model
      │
      ▼
Spring Boot 2.5 Blueprint
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

`https://harbormaster.net/springcore-techStack/`

---

[<<< return](../README.md)
