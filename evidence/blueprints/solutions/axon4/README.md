# Axon4 Framework Server Blueprint

## Overview

**Axon4 Framework Server** is a Harbormaster blueprint for generating event-driven systems using **Axon Framework 4** and **Axon Server**.

The blueprint uses **CQRS**, **Domain-Driven Design (DDD)** and **Event Sourcing** patterns to provide a structured foundation for scalable, event-driven applications. It separates command handling from query processing, allowing each side of the system to evolve and scale independently.

The blueprint combines AxonIQ, Spring Boot, React, persistence options, automated testing, source control, CI/CD, containerization and orchestration into a complete system-production foundation.

## Blueprint Information

| Property               | Value                     |
| ---------------------- | ------------------------- |
| **Name**               | Axon4-Framework-Server    |
| **Short Name**         | `Axon4`                   |
| **Version**            | 1.2                       |
| **Type**               | Firstclass                |
| **Application Type**   | RESTful API               |
| **Release Status**     | Production                |
| **Technology Source**  | Commercial                |
| **Derived From**       | Spring Boot 2.5, React    |
| **Major Technology**   | SpringBoot                |
| **Published**          | Yes                       |
| **Docker Support**     | Yes                       |
| **Kubernetes Support** | Yes                       |
| **Category**           | Event Driven              |
| **Design Pattern**     | CQRS                      |
| **Architecture Style** | Event Driven Architecture |
| **Primary Vendor**     | AxonIQ                    |

## Capabilities

The blueprint is designed to generate core capabilities for event-driven systems, including:

* Axon Framework 4
* Axon Server
* Command and query separation
* Event sourcing
* Domain-driven design foundations
* Event-driven microservices
* Event projections
* Saga-based distributed processing
* RESTful APIs
* React-based user interfaces
* Relational database persistence
* MongoDB persistence
* Automated testing
* Maven builds
* GitHub source repositories
* GitHub Actions CI/CD
* Docker containers
* Kubernetes orchestration

## Supported Languages

| Language   | Version |
| ---------- | ------- |
| Java       | 11      |
| Kotlin     | —       |
| JavaScript | —       |

## Technology Stack

| Technology         | Layer         | Purpose                                                     |
| ------------------ | ------------- | ----------------------------------------------------------- |
| **React**          | Frontend      | JavaScript dynamic UI library                               |
| **AxonIQ**         | Backend       | Event store                                                 |
| **SpringBoot**     | Backend       | RESTful API web services backend                            |
| **RDBMS**          | Data          | Storage options including H2, MySQL, PostgreSQL and MongoDB |
| **MongoDB**        | Data          | Distributed document database                               |
| **JUnit**          | Test          | Test core persistence                                       |
| **Maven**          | Build         | Build, package and commit to repository                     |
| **GitHub**         | Repository    | System repository                                           |
| **GitHub Actions** | Repository    | CI/CD pipeline                                              |
| **Docker**         | Containment   | Containerization of system image                            |
| **Kubernetes**     | Orchestration | Management of Docker image                                  |

## Architecture

The blueprint uses an **Event Driven Architecture** with **CQRS** as its primary design pattern.

```text
                       Domain Model
                            │
                            ▼
                  Axon4 Framework Blueprint
                            │
                            ▼
                Event Driven Architecture
                            │
              ┌─────────────┴─────────────┐
              ▼                           ▼
         Command Side                Query Side
              │                           │
              ▼                           ▼
        Command Handlers              Projections
              │                           │
              └─────────────┬─────────────┘
                            ▼
                       Axon Server
                       Event Store
                            │
                            ▼
                       Persistence
                     ┌──────┴──────┐
                     ▼             ▼
                   RDBMS        MongoDB
```

## Supported Use Cases

The blueprint identifies the following use cases:

* Microservices
* Event-based systems
* Event sourcing

## Metadata

```text
cqrs
event source
domain driven design
saga
projection
microservice
```

## Harbormaster Production Model

The Axon4 Framework Server blueprint is intended to capture reusable event-driven production knowledge for generating complete Axon-based systems through Harbormaster.

```text
Domain Model
      │
      ▼
Axon4 Framework Blueprint
      │
      ├── CQRS
      ├── Command Handling
      ├── Query Processing
      ├── Event Sourcing
      ├── Axon Server
      ├── Projections
      ├── Persistence
      ├── REST APIs
      ├── Testing
      ├── CI/CD
      ├── Docker
      └── Kubernetes
      │
      ▼
Generated Event-Driven System
```

The blueprint moves the creation of the foundational infrastructure required for an event-driven system from repeated manual implementation toward reusable production knowledge.

This allows development effort to focus increasingly on the business domain and application capabilities rather than repeatedly implementing the underlying CQRS, event-sourcing, persistence, deployment and operational foundation.

## Blueprint Assets

**Blueprint Icon**

`blueprints/axon-framework-blueprint-header-image.png`

**Architecture Preview**

`blueprints/architecture.diagrams/axon-blueprint-system-diagram.png`

**Information Page**

`https://harbormaster.net/axon-tech-stack/`

---

[<<< return](../README.md)
