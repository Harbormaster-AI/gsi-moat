# Angular Blueprint

## Overview

**Angular** is a Harbormaster blueprint for generating a fully functional Angular-based system from a domain model, extending from a fundamental user interface through to a persistence layer.

The blueprint uses Angular's component-based architecture to support reusable and modular components. It combines Angular, Bootstrap, MongoDB and Mongoose to provide an application foundation spanning presentation, business services and persistence.

## Blueprint Information

| Property               | Value           |
| ---------------------- | --------------- |
| **Name**               | Angular         |
| **Short Name**         | `Angular`       |
| **Version**            | 1.0             |
| **Type**               | Firstclass      |
| **Application Type**   | Web Application |
| **Release Status**     | Production      |
| **Technology Source**  | Open Source     |
| **Derived From**       | `.angular`      |
| **Major Technology**   | Angular         |
| **Docker Support**     | Yes             |
| **Kubernetes Support** | Yes             |
| **Published**          | No              |
| **Category**           | Front Framework |
| **Level**              | Basic           |
| **Primary Vendor**     | Angular         |
| **Design Pattern**     | CQRS            |
| **Architecture Style** | Component Based |

## Capabilities

The blueprint is designed to generate core Angular application capabilities, including:

* Component-based user interfaces
* Reusable and modular components
* Angular-based application services
* RESTful API services
* Bootstrap-based frontend capabilities
* MongoDB document persistence
* Mongoose ORM integration
* Domain-model-driven system generation
* Docker support
* Kubernetes support

## Supported Languages

| Language   | Version |
| ---------- | ------- |
| TypeScript | —       |
| JavaScript | —       |

## Technology Stack

| Technology    | Layer        | Purpose                                   |
| ------------- | ------------ | ----------------------------------------- |
| **Bootstrap** | Presentation | Front-end                                 |
| **Angular**   | Business     | RESTful API services layer                |
| **MongoDB**   | Data         | Document persistence                      |
| **Mongoose**  | ORM          | Object-relational/object-document mapping |

## Architecture

The blueprint uses a **Component Based** architecture with **CQRS** as its design pattern.

```text id="angular-architecture"
                    Domain Model
                         │
                         ▼
                 Angular Blueprint
                         │
              ┌──────────┴──────────┐
              ▼                     ▼
       Component-Based UI     Service Layer
              │                     │
              ▼                     ▼
          Bootstrap             Angular APIs
                                    │
                                    ▼
                                 Mongoose
                                    │
                                    ▼
                                 MongoDB
```

## Supported Use Cases

The blueprint identifies the following use cases:

* Portals
* SaaS Platforms
* Marketplace
* Workflow Management Systems
* Supply Chain
* Dashboards

## Metadata

```text
Angular
TypeScript
Component-Based Architecture
MVVM
Dependency Injection
RxJS
Angular Material
Single Page Application
Responsive Design
Production Ready
```

## Harbormaster Production Model

The Angular blueprint is intended to capture reusable frontend, service and persistence production knowledge for generating Angular systems through Harbormaster.

```text id="angular-production-model"
Domain Model
      │
      ▼
Angular Blueprint
      │
      ├── UI Components
      ├── Component Composition
      ├── RESTful Services
      ├── Mongoose
      └── MongoDB Persistence
      │
      ▼
Generated Angular System
```

The blueprint allows an Angular system to be generated from a domain model with the application foundation spanning the user interface, service layer and persistence layer.

Rather than manually recreating the same component structures, service capabilities and persistence integration for each application, Harbormaster uses the blueprint as reusable production knowledge from which the system can be generated.

## Blueprint Assets

**Blueprint Icon**

`blueprints/angular-blueprint-header-image.png`

**Architecture Preview**

`blueprints/architecture.diagrams/angular-blueprint-system-diagram.png`

**Information Page**

`http://www.harbormaster.net/Angular11.blueprint`

---

[<<< return](../README.md)
