# Django Blueprint

## Overview

**Django** is a Harbormaster blueprint for generating the common features of a robust Django system.

Django is a Python-based, open-source web framework that follows the **Model-View-Template (MVT)** architectural pattern.

## Blueprint Information

| Property               | Value               |
| ---------------------- | ------------------- |
| **Name**               | Django              |
| **Short Name**         | `Django`            |
| **Version**            | 1.0                 |
| **Type**               | Firstclass          |
| **Application Type**   | Web Application     |
| **Release Status**     | Production          |
| **Technology Source**  | Open Source         |
| **Derived From**       | python              |
| **Published**          | No                  |
| **Major Technology**   | Django              |
| **Docker Support**     | Yes                 |
| **Kubernetes Support** | Yes                 |
| **Category**           | Backend Framework   |
| **Level**              | Basic               |
| **Primary Vendor**     | Django              |
| **Design Pattern**     | Model-View-Template |
| **Architecture Style** | Layered             |

## Capabilities

The blueprint is designed to generate common Django application capabilities, including:

* Django web framework
* Model-View-Template architecture
* Python-based application structure
* Web application presentation
* Testing
* RESTful application development
* Modular application structures
* Docker support
* Kubernetes support

## Supported Languages

| Language   | Version |
| ---------- | ------- |
| Python     | —       |
| JavaScript | —       |
| HTML5      | —       |

## Technology Stack

| Technology | Layer        | Purpose              |
| ---------- | ------------ | -------------------- |
| **Django** | Presentation | Django web framework |
| **Python** | Build        | Python build         |
| **Pytest** | Test         | Test utility         |

## Architecture

The blueprint uses a **Layered** architecture with the **Model-View-Template** design pattern.

```text
                    Django
                       │
                       ▼
             Model-View-Template
                       │
          ┌────────────┼────────────┐
          ▼            ▼            ▼
        Model         View       Template
          │            │            │
          └────────────┼────────────┘
                       ▼
                Web Application
```

## Supported Use Cases

The blueprint identifies the following use cases:

* Any Portal
* Marketplace
* Platform
* Management System
* E-Commerce
* Blog
* Knowledge Base
* Multi-Tenant SaaS
* Dashboard

## Metadata

```text
Django
Python
MVT
Active Record
Django REST Framework
PostgreSQL
Redis
Celery
Modular Monolith
Production Ready
```

## Harbormaster Production Model

The Django blueprint is intended to capture reusable production knowledge for generating Django systems through Harbormaster.

```text
Domain Model
      │
      ▼
Django Blueprint
      │
      ├── Models
      ├── Views
      ├── Templates
      ├── Python
      └── Testing
      │
      ▼
Generated Django System
```

The blueprint provides a repeatable foundation for producing Django applications rather than manually recreating the same framework structures and application foundation for every system.

## Blueprint Assets

**Blueprint Icon**

`blueprints/django-blueprint-header-image.png`

**Architecture Preview**

`blueprints/architecture.diagrams/django-blueprint-system-diagram.png`

**Information Page**

`http://www.harbormaster.net/django.blueprint`

---

[<<< return](../README.md)
