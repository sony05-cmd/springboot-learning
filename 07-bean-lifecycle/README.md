# Spring Bean Lifecycle

This project demonstrates the **Spring Bean Lifecycle** using `CartService`.

## Concepts Learned

* Bean creation and constructor execution
* `BeanNameAware`
* `ApplicationContextAware`
* `@PostConstruct` for initialization
* `@PreDestroy` for destruction
* `InitializingBean`
* `DisposableBean`
* Custom `initMethod` and `destroyMethod`
* Singleton vs Prototype bean lifecycle
* Why Spring does not automatically destroy Prototype beans

## Lifecycle Flow

```text
Bean Creation
     ↓
Aware Interfaces
     ↓
@PostConstruct
     ↓
Bean Ready
     ↓
@PreDestroy
     ↓
Bean Destroyed
```

## Example

`CartService` uses `@PostConstruct` to initialize the map and `@PreDestroy` to clear it when the Spring context is closed.

```java
context.close();
```

This triggers the destruction callback for the singleton bean.

## Key Learning

Spring manages the complete lifecycle of **singleton beans**, while for **prototype beans**, Spring creates and initializes the object but does not automatically manage its destruction.
