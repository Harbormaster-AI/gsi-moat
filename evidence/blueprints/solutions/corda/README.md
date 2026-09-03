# Corda Marketplace Token Blueprint

## Overview

**Corda Marketplace Token** is a Harbormaster blueprint for generating the core capabilities of a Corda-based marketplace and token system.

The blueprint is intended to simplify the complexity of blockchain application development so that development effort can focus more heavily on customer-facing features rather than repeatedly implementing the underlying platform foundation.

Corda provides an enterprise-grade distributed ledger environment for organizations that need to securely share, verify and record transactions across multiple parties while maintaining privacy, trust and regulatory compliance.

Unlike public blockchains, Corda shares transaction information only with the parties directly involved, making it particularly applicable to enterprise and regulated environments.

## Blueprint Information

| Property               | Value                              |
| ---------------------- | ---------------------------------- |
| **Name**               | Corda-Marketplace-Token            |
| **Short Name**         | `CordaMarket`                      |
| **Version**            | 0.8                                |
| **Type**               | Firstclass                         |
| **Application Type**   | RESTful API                        |
| **Release Status**     | Production                         |
| **Technology Source**  | Commercial                         |
| **Derived From**       | Axon4-Framework-Server, corda-core |
| **Docker Support**     | Yes                                |
| **Kubernetes Support** | Yes                                |
| **Category**           | Platform                           |
| **Published**          | No                                 |
| **Primary Vendor**     | R3 Corda                           |

## Capabilities

The blueprint provides a foundation for Corda-based applications with capabilities including:

* Corda distributed ledger integration
* Marketplace functionality
* Token-based capabilities
* RESTful APIs
* Spring Boot backend services
* NoSQL persistence
* Automated testing
* Gradle-based builds
* Docker containerization
* Kubernetes deployment

## Supported Languages

| Language | Version |
| -------- | ------- |
| Java     | —       |
| Kotlin   | —       |

## Technology Stack

| Technology     | Layer        | Purpose                                           |
| -------------- | ------------ | ------------------------------------------------- |
| **SpringBoot** | Presentation | RESTful API web services backend                  |
| **MongoDB**    | Data         | NoSQL persistence                                 |
| **JUnit**      | Test         | Test core functionality                           |
| **Gradle**     | Build        | Build, commit, package, deploy and run the module |

## Architecture

The blueprint provides a Corda-based platform foundation with RESTful access and persistence.

```text
                         Domain Model
                              │
                              ▼
                  Corda Marketplace Blueprint
                              │
             ┌────────────────┼────────────────┐
             ▼                ▼                ▼
        Marketplace        Token Logic       Corda
        Capabilities      Capabilities      Platform
             │                │                │
             └────────────────┼────────────────┘
                              ▼
                        Spring Boot
                         REST APIs
                              │
                              ▼
                          MongoDB
                         Persistence
                              │
                              ▼
                   Generated System
```

## Harbormaster Production Model

The Corda Marketplace Token blueprint captures the foundational production knowledge required to create a Corda-based marketplace and token application.

```text
Domain Model
      │
      ▼
Corda Marketplace Blueprint
      │
      ├── Marketplace
      ├── Token Capabilities
      ├── Corda Platform
      ├── REST APIs
      ├── Persistence
      ├── Testing
      ├── Build Automation
      ├── Docker
      └── Kubernetes
      │
      ▼
Generated Corda System
```

The objective is to move the implementation of recurring platform capabilities from manual development into reusable, executable production knowledge.

This allows developers to spend more of their effort on **customer features and differentiated business capabilities** rather than repeatedly constructing the foundational technology required by the application.

## Blueprint Assets

**Blueprint Icon**

`blueprints/corda-blueprint-header-image.png`

**Information Page**

`https://harbormaster.net/corda-token-techStack/`

---

[<<< return](../README.md)
