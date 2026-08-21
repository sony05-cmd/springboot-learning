# Spring XML-Based Configuration

This module contains my practice with **Spring XML-based configuration** and IoC container concepts.

## Concepts Learned

* XML-based Spring configuration using `beans.xml`
* Creating and registering beans using `<bean>`
* Bean `id`, `name`, and aliases
* Loading XML configuration using `ClassPathXmlApplicationContext`
* Getting beans using `getBean()`
* Constructor Injection using `<constructor-arg>`
* Setter Injection using `<property>`
* Difference between `value` and `ref`
* Multiple beans and explicit dependency wiring
* XML autowiring: `byName`, `byType`, and `constructor`
* Singleton and Prototype bean scopes
* Bean lifecycle using `init-method` and `destroy-method`
* Collection injection using List, Set, and Map
* Splitting XML configuration using `<import>`
* Using XML configuration together with annotations

## Practice

Implemented a small **Order and Payment** example using XML configuration.

* Created `Payment`, `UPIpay`, and `Cardpay` beans.
* Injected the `Cardpay` bean into `Order` using constructor injection.
* Loaded and retrieved beans from `beans.xml`.
* Practiced bean aliases using the `name` attribute.
* Practiced lifecycle methods and closing the Spring context.
* Created a `User` class with constructor-based values.

## Key Learning

Spring XML configuration provides metadata that tells the IoC container which objects to create, how to wire their dependencies, and how to manage their lifecycle.
