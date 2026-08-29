# System-as-Code

## Introduction

Harbormaster is a declarative system that simplifies the process of creating a system. Hidden are the complexities of a technology blueprint, an industry domain model, and targets in the stack of technologies

## Format

 YAML; single file

## Content

Application blueprints by name, domain models by name with system and technology configurations.

## Technology

A command-line-interface using NodeJS, available on [npmjs.com](https://www.npmjs.com/package/@system-as-code/cli)

## Usage

### CLI
Like docker-compose, simple commands issued from an OS prompt give full control over a system creation session. Commands include:

Model Commands:
> list [options] [hint] [category] [industry]  List available models. Use hint, category, and/or industry as filters.
> profile [options] <id>                       Display details about a specific domain model.  
> industries [options]                         List all industries for the supported domain models.  
> categories [options]                         List all categories for supported domain models.   

Blueprint Commands:
> list [options] [hint]   List available blueprints.  User [hint] as a filter.  
> profile [options] <id>  Display details about a specific blueprint.  
> inputs <id>             Available user input options, to include in a System-as-Code file to allow customization of a created system.  

System Commands:
> list [options]                  List previously created systems. For authenticated users only.  
> generate [options] <yaml_file>  Generates a system using the directives of a System-as-Code YAML file.    
> certification [options] <id>    Checks the status of a system certification.    
> delete [options] <id>           Delete a previously created system.  

### Programmatic 
The CLI uses a separate NodeJS package which is an SDK to communicate with a Harbormaster Instance.  

This allows you to programmatically integrate system integration as part of a larger workflow.


## Examples
[System-as-Code YAMLs](../../evidence/system-as-code)

