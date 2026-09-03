# AWS Lambda Blueprint

## Overview

**AWS Lambda** is a Harbormaster blueprint for generating serverless compute capabilities.

The blueprint is intended to address the large number of foundational functions that can exist in an average-sized system, particularly functions supporting storage-related operations.

> **Don't write them. Generate them.**

AWS Lambda provides serverless compute that runs code in response to events and scales on demand without requiring direct infrastructure management.

## Blueprint Information

| Property               | Value                        |
| ---------------------- | ---------------------------- |
| **Name**               | AWS Lambda                   |
| **Short Name**         | `Lambda`                     |
| **Version**            | 2.0                          |
| **Type**               | Firstclass                   |
| **Application Type**   | Serverless                   |
| **Release Status**     | Production                   |
| **Technology Source**  | Commercial                   |
| **Derived From**       | java, lambda-core, hibernate |
| **Published**          | No                           |
| **Docker Support**     | No                           |
| **Kubernetes Support** | No                           |
| **Category**           | Framework                    |
| **Primary Vendor**     | AWS                          |

## Capabilities

The blueprint is designed to generate serverless application capabilities, including:

* AWS Lambda business delegates
* Persistence integration
* Object-relational mapping
* Maven-based builds
* Automated testing
* Event-driven serverless execution
* Scalable serverless functions

## Supported Languages

| Language   | Version |
| ---------- | ------- |
| Java       | —       |
| Node.js    | —       |
| JavaScript | —       |

## Technology Stack

| Technology    | Layer    | Purpose                                        |
| ------------- | -------- | ---------------------------------------------- |
| **AWSLambda** | Business | Serverless business delegate                   |
| **Hibernate** | Data     | ORM for persistence                            |
| **Maven**     | Build    | Build, commit, package, deploy and run modules |
| **JUnit**     | Test     | Testing core functionality                     |

## Architecture

The blueprint is designed around a serverless execution model.

```text
                    Domain Model
                         │
                         ▼
                  AWS Lambda Blueprint
                         │
             ┌───────────┼───────────┐
             ▼           ▼           ▼
        Lambda       Hibernate     JUnit
        Functions    Persistence    Testing
             │           │
             └─────┬─────┘
                   ▼
            Serverless System
```

## Production Model

The AWS Lambda blueprint is intended to capture reusable serverless production knowledge for generating Lambda-based capabilities through Harbormaster.

```text
Domain Model
      │
      ▼
AWS Lambda Blueprint
      │
      ├── Lambda Functions
      ├── Business Delegates
      ├── Persistence
      ├── Build
      └── Testing
      │
      ▼
Generated Serverless System
```

The objective is to replace repetitive implementation of foundational functions with repeatable system generation.

For systems containing thousands of foundational functions, this provides an opportunity to move substantial portions of software production from manual implementation to executable production knowledge.

## Blueprint Assets

**Blueprint Icon**

`blueprints/aws-lambda-blueprint-header-image.png`

**Information Page / Example**

`https://github.com/Harbormaster-AI/cli/blob/main/samples/yamls/project.as.code/springboot-rdbms-project-as-code.yml`

---

[<<< return](../README.md)
