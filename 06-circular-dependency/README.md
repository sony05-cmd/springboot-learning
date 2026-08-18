# Spring Bean Initialization, Scope & Circular Dependency

This module covers Spring bean initialization, bean scopes, and circular dependency.

## Topics Learned

### 1. Lazy & Eager Initialization

* **Eager initialization** creates the bean when the Spring container starts.
* **Lazy initialization** creates the bean only when it is actually needed.
* With lazy initialization, Spring can create a **proxy bean definition** first and create the actual bean later when requested.

### 2. Bean Scopes

#### Singleton

* Default Spring bean scope.
* Only **one bean instance** is created.
* The same instance is returned every time the bean is requested.
* Singleton beans are eager by default.

#### Prototype

* A new bean instance is created every time the bean is requested.
* Can be configured using:

```java
@Scope("prototype")
```

### 3. Multiple Singleton Beans

Using `@Bean`, we can create separate singleton bean instances even for the same class by defining multiple bean methods.

### 4. Circular Dependency

A circular dependency occurs when two beans depend on each other.

Example:

```text
Order → Payment
Payment → Order
```

Field injection can be used to resolve this in some cases, but it is **not recommended**.

The better approach is to redesign the classes and avoid circular dependencies where possible.

## Project Structure

* `bean-initialization-demo` – Lazy and eager bean initialization
* `bean-scope-demo` – Singleton and prototype scopes
* `circular-dependency-demo` – Circular dependency example

## Key Takeaway

Spring manages bean creation and lifecycle using **IoC and Dependency Injection**. Understanding bean initialization and scopes helps control when beans are created and how their instances are managed.
