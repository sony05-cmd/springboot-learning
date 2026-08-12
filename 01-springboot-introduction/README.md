# Spring Boot Introduction

## 📚 Video 1 - Introduction to Spring & Spring Boot

This lecture covers the fundamentals of web applications and explains how we
progress from basic Java programs to Servlets, Spring Framework, and finally
Spring Boot.

---

## 1. Client-Server Architecture

A web application follows a client-server architecture.

### Client

A client is the side that asks for something.

Examples:

- Web Browser
- Mobile Application
- Postman
- React Frontend
- Android App
- iOS App

### Server

A server receives requests, processes them, and sends responses.

Examples:

- Amazon Server
- YouTube Server
- Bank Server
- Spring Boot Application

### Basic Flow

Client → Request → Server

Server → Response → Client

---

## 2. HTTP

HTTP stands for:

**HyperText Transfer Protocol**

HTTP is the communication protocol used between a client and server.

It defines:

- How a request should look
- How a response should look
- HTTP methods
- URLs
- Data being sent
- Status codes

HTTP is an application-layer protocol that works on top of TCP/IP.

---

## 3. Request-Response Cycle

A basic web interaction follows this flow:

Client sends request
        ↓
Server processes request
        ↓
Server sends response
        ↓
Client uses/displays response

Example:
GET /courses
Host: www.example.com
The server processes the request and sends a response such as: 200 OK along with the required data.

## 4. HTTP Request

An HTTP request usually contains:
1.Method
2.URL / Path
3.Headers
4.Body

Example:

POST /login
Content-Type: application/json
{
    "email": "abc@gmail.com",
    "password": "12345"
}

## 5. HTTP Methods
Method  	Purpose	                        Example
GET     	Read data	                    Fetch orders
POST	    Create data	                    Place an order
PUT	        Replace data completely	        Update entire profile
PATCH	    Update data partially	        Change phone number
DELETE	    Remove data	Cancel an order

## 6. HTTP Headers
Headers are key-value pairs that provide additional information
about a request or response.

Examples:

Accept: application/json
Content-Type: application/json
Authorization: Bearer token
Host: example.com

Headers can provide information about:Data format,Authentication,Host,Request metadata

## 7. HTTP Body
The body contains the actual data being sent by the client.
It is commonly used with:
1.POST
2.PUT
3.PATCH

Example:

{
    "name": "Rohit",
    "email": "rohit@example.com"
}

Modern APIs commonly use JSON for request bodies.

## 8. HTTP Response
An HTTP response usually contains:Status Code,Headers,Body

Example:

HTTP/1.1 200 OK
Content-Type: application/json
{
    "message": "Login successful"
}

Important Status Codes

200 --> Request successful
404 -->	Resource not found
500 -->	Internal server error
## 9. JVM and Java Programs
A normal Java program runs inside the JVM(Java Virtual Machine).
The process is:

.java source code
       ↓
     javac
       ↓
   .class bytecode
       ↓
      JVM
       ↓
    Execution

Java bytecode is platform-independent and can run on different operating systems as long as a JVM is available.

## 10. Normal Java Program vs Web Application
Normal Java Program                                  
Start
  ↓
Run instructions
  ↓
Finish
  ↓
Exit

Web Application
Start
  ↓
Keep running
  ↓
Wait for requests
  ↓
Process requests
  ↓
Send responses
  ↓
Continue running

A web server needs to continuously listen for incoming requests.

## 11. Why Core Java Alone Is Not Enough
Core Java provides concepts such as:Classes,Objects,Inheritance,Collections,Threads,Files

But it does not automatically understand web concepts such as:HTTP requests,URLs,Headers,Cookies,Sessions,REST APIs

Java can perform networking, but manually handling HTTP requests
would require a lot of additional work.

## 12. Java Networking
Java provides networking capabilities through packages such as
java.net.
For example:

ServerSocket server = new ServerSocket(8080);

This allows a Java program to listen on a port.
However, raw network data still needs to be interpreted as an
HTTP request.
For example:

GET /users HTTP/1.1
Host: localhost:8080

The application needs to understand:

GET → fetch data
/users → endpoint
Host → header
## 13. Problems with Handling Web Applications Manually
Using only Core Java, we would need to:

Open a port
Read raw input streams
Parse HTTP requests
Extract method, URL, headers and body
Route requests to Java logic
Create HTTP responses
Manage multiple users and threads
Handle errors and connections

This creates a lot of repeated technical work.

## 14. Servlets
A Servlet is a Java object designed to handle HTTP requests.

Conceptually:

HTTP Request
     ↓
  Servlet
     ↓
 Java Code

Servlets were one of the standard Java technologies for building
web applications.

## 15. Servlet Container
A Servlet runs inside a Servlet Container.
Examples:
Apache Tomcat,Jetty,Undertow

The Servlet Container handles low-level web operations such as:

Opening a port
Listening for HTTP requests
Reading TCP data
Parsing HTTP requests
Creating request/response objects
Managing threads
Calling servlet methods
Sending HTTP responses

For example:

GET /hello
      ↓
Servlet Container
      ↓
Servlet
      ↓
Java Code
## 16. Why Spring Was Needed
Servlets solved the problem of handling HTTP requests,
but large enterprise applications became difficult to maintain.

Some problems included:

Too much boilerplate code
Too much configuration
Tight coupling
Difficult testing
Difficult maintenance
Repeated code

Spring was introduced to make Java enterprise development
cleaner and more manageable.

## 17. Spring Framework
Spring Framework provides important concepts such as:

IoC
Dependency Injection
Bean Management
Configuration
Loose Coupling

Spring is an ecosystem rather than just a single library.

## 18. Spring Ecosystem
Important Spring projects include:

Spring Core
Spring MVC
Spring Data
Spring Security
Spring AOP
Spring Boot
Spring AI
## 19. Spring Core
Spring Core is the foundation of the Spring ecosystem.
It provides:

IoC
Dependency Injection
Bean Management
Configuration
ApplicationContext
## 20. Spring MVC
Spring MVC is used to build:

Web applications,REST APIs

It is built on:

Servlets
Spring Core

Instead of writing Servlet code directly, developers can use
controllers and annotations.

Example:

@GetMapping("/hello")
public String sayHello() {
    return "Hello World";
}
## 21. Spring Data
Applications often need databases.

The lecture introduces the evolution:

Spring Data JPA
      ↓
  Hibernate
      ↓
    JDBC
      ↓
  Database

JPA(Java Persistence API)
JPA is a specification that defines rules for mapping Java objects
to database tables.

Hibernate: Hibernate is a popular implementation of JPA.

Spring Data JPA: Spring Data JPA reduces database-related boilerplate code.

## 22. Spring Security
Spring Security is used for:

Authentication
Authorization
Login
JWT
OAuth
Roles
Permissions
Password encoding
CSRF protection
Access control
## 23. Spring AOP
AOP stands for:Aspect-Oriented Programming
It helps separate cross-cutting concerns from business logic.

Examples:

Logging
Security checks
Transaction management
Performance tracking
Exception handling
## 24. Spring AI
Spring AI helps Java developers integrate AI capabilities
into Spring applications.
It can work with:

AI models
Vector databases
RAG systems
Embeddings
Chat models
## 25. What is Spring Boot?
Spring Boot is not a replacement for Spring.
It is an automation layer on top of Spring.
Spring Boot provides:

Auto-configuration
Starter dependencies
Embedded servers
Sensible defaults
Production-ready features
Less manual configuration

The goal is to make Spring application development faster.

## 26. Why Spring Boot Is Opinionated
Spring Boot provides sensible defaults so developers don't have
to configure everything manually.

For example, when web dependencies are added, Spring Boot can
automatically configure things such as:

Embedded Tomcat
Spring MVC setup
Default application structure
JSON support
Basic error handling
## 27. Spring vs Spring Boot
Spring Framework	                                Spring Boot
Provides core features and modules	                Provides auto-configuration and quick setup
More manual configuration	                        Less manual configuration
Flexible	                                        Provides sensible defaults
Foundation of ecosystem	                            Built on top of Spring

Spring Boot uses Spring.
Spring Boot does not replace Spring.

## 28. Microservices
Microservices are an architecture style, not a Spring module.
A large application can be divided into smaller independent
services.

Example:

User Service
Order Service
Payment Service
Notification Service
Product Service

Each service can be developed, deployed and scaled independently.
Spring Boot is commonly used to build microservices.

## 29. Complete Journey

The overall journey is:

Client-Server Architecture
          ↓
       HTTP
          ↓
 Core Java limitations
          ↓
 Java Networking
          ↓
      Servlets
          ↓
 Servlet Containers
          ↓
 Spring Framework
          ↓
 Spring Ecosystem
          ↓
     Spring Boot
## 30. Complete Web Request Flow
Browser
   ↓
HTTP Request
   ↓
Servlet Container
   ↓
Servlet Technology
   ↓
Spring MVC
   ↓
Spring Core
   ↓
Spring Boot
   ↓
Business Logic
   ↓
HTTP Response
   ↓
Browser

Key Takeaways
Client sends a request and server sends a response.
HTTP defines the communication format.
HTTP requests contain methods, paths, headers and bodies.
HTTP responses contain status codes, headers and bodies.
Core Java does not automatically understand HTTP.
Servlets allow Java applications to handle web requests.
Servlet Containers handle low-level web operations.
Spring makes enterprise Java development cleaner.
Spring Core manages objects and dependencies.
Spring MVC simplifies web development.
Spring Data simplifies database access.
Spring Security handles authentication and authorization.
Spring Boot reduces configuration and provides auto-configuration.
Microservices are an architecture style, not a Spring module.