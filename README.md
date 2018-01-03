# Cucumber-Java-Maven
This repository contains a scaffolding to automation test wih Selenium Webdriver, Cucumber, Java and Maven.

## Development environment
* **IDE**: IntelliJ
* **Java Version**: openJDK 1.8
* **OS**: Ubuntu 16.04 LTS 
* **Maven version**: 3.3.9

## Running test
Go to your proyect directory from terminal and hit following commands:

``
mvn -DBROWSER=<browser> test
``

Where \<browser> can be:
* chrome
* firefox

Examples:

``
mvn -DBROWSER=chrome test
``

``mvn -DBROWSER=firefox test
``
