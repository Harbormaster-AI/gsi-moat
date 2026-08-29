# Generated System Files

## Introduction

Each of the directories contains all the files compiled by Harbormaster for:

- A target [blueprint](../blueprints/README.md) (ex: Spring Boot 3.5, Golang, ASP.NET, etc...)
- An [industry domain model](../domain-models/README.md)( 1 of the 240+ included with HM, or a custom model)
- Dynamic features applied to the target blueprint (ex: AWS, Terraform, Docker)
- System specific options (database engine, docker/git/terraform/kubernetes/aws params, etc...) 

Upon system creation, Harbormaster commits all files to a target repository. Next, Harbormaster invokes a custom verification workflow on GitHub.

[System-as-Code YAMLs](../system-as-code/README.md)[Certification Flow](../certification/README.md)
