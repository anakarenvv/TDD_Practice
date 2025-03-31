# TDD Practice with Spring Boot

## What?
This is a simple RESTful API built with Java and Spring Boot to practice Test Driven Development (TDD). It exposes a `/greeting` endpoint that returns a personalized greeting message in JSON format.

##  How?
The project follows the TDD cycle:
1. Write tests using JUnit and MockMvc.
2. Run tests and watch them fail.
3. Write minimal code to pass the tests.
4. Refactor and repeat.

The controller returns `{"content": "Hello, World!"}` by default, and `{"content": "Hello, [name]!"}` when a `name` parameter is provided.

## Why?
To practice writing clean, testable code by applying the TDD methodology, improve confidence in backend development with Spring Boot, and reinforce Git and GitHub version control workflows.
