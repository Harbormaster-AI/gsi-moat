# Golang Blueprint

## Overview

**Golang** is a Harbormaster blueprint for generating the core capabilities of a Golang system from any domain model.

Golang is commonly used for high-performance microservices, APIs, event-processing systems, cloud-native platforms, and distributed backend services that require scalability, concurrency, and operational simplicity.

## Blueprint Information

| Property               | Value            |
| ---------------------- | ---------------- |
| **Name**               | Golang           |
| **Short Name**         | `Go`             |
| **Version**            | 1.0              |
| **Type**               | Firstclass       |
| **Application Type**   | Web Application  |
| **Release Status**     | Production       |
| **Technology Source**  | Open Source      |
| **Derived From**       | go-core          |
| **Major Technology**   | Golang           |
| **Published**          | Yes              |
| **Category**           | Language Runtime |
| **Primary Vendor**     | Golang           |
| **Design Pattern**     | Repository       |
| **Architecture Style** | Microservices    |

## Capabilities

The blueprint is designed to generate core Golang backend capabilities suitable for:

* High-performance microservices
* REST APIs
* Event-processing systems
* Cloud-native platforms
* Distributed backend services
* Kafka-based event processing
* API gateways
* Real-time notification services
* Streaming analytics
* Transaction processing

## Supported Languages

| Language   | Version |
| ---------- | ------- |
| Go         | 1.22    |
| JavaScript | —       |

## Technology Stack

| Technology  | Layer   | Purpose                                  |
| ----------- | ------- | ---------------------------------------- |
| **Golang**  | Backend | Full-featured backend platform           |
| **RDBMS**   | Data    | MySQL, PostgreSQL, SQLite and SQL Server |
| **MongoDB** | Data    | Document-based persistence               |

## Architecture

The blueprint uses a **Microservices** architecture with the **Repository** design pattern.

```text
                    Golang
                       │
                       ▼
                 Microservices
                       │
          ┌────────────┼────────────┐
          ▼            ▼            ▼
       REST API      Events       gRPC
          │            │            │
          └────────────┼────────────┘
                       ▼
                  Data Layer
                 ┌─────┴─────┐
                 ▼           ▼
               RDBMS      MongoDB
```

## Supported Use Cases

The blueprint identifies the following use cases:

* REST API Platform
* Microservice Template
* Event Processor
* Kafka Consumer Service
* API Gateway
* Real-Time Notification Service
* Marketplace Backend
* Financial Transaction Service
* Streaming Analytics Service
* Cloud-Native SaaS Backend

## Metadata

```text
golang
microservices
cloud native
kafka
postgresql
redis
rest api
grpc
docker
kubernetes
event-driven
cqrs
high throughput
low latency
```

## Harbormaster Production Model

The Golang blueprint is intended to capture reusable backend production knowledge for generating Golang systems through Harbormaster.

```text
Domain Model
      │
      ▼
Golang Blueprint
      │
      ├── Microservices
      ├── Repository Pattern
      ├── REST APIs
      ├── Event Processing
      └── Data Persistence
      │
      ▼
Generated Golang System
```

The blueprint provides a repeatable backend foundation for producing Golang systems from domain models rather than manually recreating the same architectural and technical structures for every application.

## Blueprint Assets

**Blueprint Icon**

`blueprints/go-blueprint-header-image.png`

**Architecture Preview**

`blueprints/architecture.diagrams/golang-blueprint-system-diagram.png`

**Information Page**

`http://www.harbormaster.net/go.blueprint`

---

[<<< return](../README.md)
