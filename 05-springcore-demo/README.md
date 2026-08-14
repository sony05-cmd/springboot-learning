# Spring Core – Beans and Dependency Injection

## Concepts Covered

* `@Component` – creates Spring-managed beans automatically.
* `@Autowired` – injects dependencies into a class.
* `@Configuration` – defines a configuration class.
* `@ComponentScan` – scans the specified package for Spring components.
* `@Bean` – manually creates a Spring bean.
* `@Qualifier` – selects a specific bean when multiple implementations are available.
* `@Primary` – gives a default bean priority when multiple beans are available.
* Creating a bean for a class from an external JAR using `@Bean`.

## Project Example

The project contains:

* `OrderService` – uses dependency injection.
* `PaymentService` – interface for payment implementations.
* `CardPayment` – card payment implementation.
* `UpiPayment` – UPI payment implementation.
* `User` – bean created using `@Bean`.
* `AppConfig` – Spring configuration class.
* `Main` – starts the Spring IoC container.

## Technologies Used

* Java
* Spring Core
* Maven

## How to Run

mvn clean compile
Then run the `Main` class.

