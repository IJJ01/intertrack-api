# 0001: Build tool, Spring Boot version and Java version

## Status
Accepted

## Decision
- Build tool : Maven
- Spring Boot version : 4.1.2
- Java version : 17
- Spring-boot-starter-parent : 4.1.2

## Reasons
- Build tool : I chose Maven because am familiar with it from an earlier internship.
- Spring Boot version : 4.1.2 is the latest stable release offered by start.spring.io, and 3.5.x was not offered.
- Java version : 17 minimum for chosen Spring boot version, also my choice for a Java SE 17 certification I am studying for.

## Alternatives considered
- Build tool : Gradle a second choice, but I chose Maven for the aforementioned reason.
- Spring Boot version : 3.5.x, older version with more tutorials.
- Java version : 21 is a newer version of java.