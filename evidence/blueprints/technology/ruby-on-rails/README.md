# Ruby on Rails Blueprint

## Overview

**Ruby on Rails** is a Harbormaster blueprint for generating the core capabilities of a Ruby on Rails application.

The blueprint provides the foundational structures for database-backed web applications, web services, and web pages, including controllers, routes, models, and related application capabilities.

## Blueprint Information

| Property               | Value                 |
| ---------------------- | --------------------- |
| **Name**               | Ruby on Rails         |
| **Short Name**         | `Rails`               |
| **Version**            | 1.1                   |
| **Type**               | Firstclass            |
| **Application Type**   | Web Application       |
| **Release Status**     | Production            |
| **Technology Source**  | Open Source           |
| **Published**          | No                    |
| **Derived From**       | common                |
| **Major Technology**   | RubyOnRails           |
| **Category**           | Backend Framework     |
| **Level**              | Basic                 |
| **Primary Vendor**     | Ruby On Rails         |
| **Design Pattern**     | CQRS                  |
| **Architecture Style** | Model-View-Controller |

## Capabilities

The blueprint is designed to generate the core capabilities of a Ruby on Rails application, including:

* Controllers
* Routes
* Models
* Database structures
* Web services
* Web pages
* View templates
* Active Record
* REST APIs
* Background processing

## Supported Languages

| Language   | Version |
| ---------- | ------- |
| Ruby       | —       |
| JavaScript | —       |

## Technology Stack

| Technology      | Layer | Purpose        |
| --------------- | ----- | -------------- |
| **RubyOnRails** | Other | View templates |

## Architecture

The blueprint identifies **Model-View-Controller** as its architecture style and **CQRS** as its design pattern.

```text
                 Ruby on Rails
                       │
                       ▼
             Model-View-Controller
                       │
          ┌────────────┼────────────┐
          ▼            ▼            ▼
        Model       Controller      View
          │            │            │
          └────────────┼────────────┘
                       ▼
                  Web Application
```

## Supported Use Cases

The blueprint identifies the following use cases:

* SaaS Platform
* Marketplace Application
* E-Commerce Platform
* Customer Portal
* Content Management Platform

## Metadata

```text
ruby on rails
ruby
active record
mvc
modular monolith
postgresql
redis
rest api
sidekiq
production ready
```

## Harbormaster Production Model

The Ruby on Rails blueprint is intended to capture reusable production knowledge for generating Rails applications through Harbormaster.

```text
Domain Model
      │
      ▼
Ruby on Rails Blueprint
      │
      ├── Models
      ├── Controllers
      ├── Routes
      ├── Views
      └── Application Structure
      │
      ▼
Generated Ruby on Rails Application
```

The blueprint provides a repeatable foundation for creating Ruby on Rails applications rather than manually recreating the same framework structures for each application.

## Blueprint Assets

**Blueprint Icon**

`blueprints/rails-blueprint-header-image.png`

**Architecture Preview**

`blueprints/architecture.diagrams/ruby-on-rails-blueprint-system-diagram.png`

**Information Page**

`http://www.harbormaster.net/.rails.blueprint`

---

[<<< return](../README.md)
