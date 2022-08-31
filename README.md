# GoF Design Patterns

[![Java CI with Maven](https://github.com/baonguyen96/DesignPatterns/actions/workflows/maven.yml/badge.svg?branch=master)](https://github.com/baonguyen96/DesignPatterns/actions/workflows/maven.yml)

## Introduction
This repository is collection of simple demos for each GoF design patterns.

Additional resources can be found at:
1. [Wikipedia](https://en.wikipedia.org/wiki/Design_Patterns)
2. [Refactoring Guru](https://refactoring.guru/design-patterns)
3. [Scaler Topics](https://www.scaler.com/topics/design-patterns)
4. [Source Making](https://sourcemaking.com/design_patterns)


## Setup
1. Java 1.8 or above, preferably Java 11
2. Maven, preferably Maven 3
3. Tests with JUnit4, Jacoco, Surefire


## Patterns

### [Behavioral Patterns](./BehavioralPatterns)
> Behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication.

_Source: [Source Making](https://sourcemaking.com/design_patterns/behavioral_patterns#:~:text=In%20software%20engineering%2C%20behavioral%20design,in%20carrying%20out%20this%20communication.)_

- [Chain of Responsibility](#): object that can fulfill a request
- [Command](#): when and how a request is fulfilled
- [Interpreter](#): grammar and interpretation of a language
- [Iterator](#): how an aggregate's elements are accessed and traversed
- [Mediator](#): how and which objects interact with each other
- [Memento](#): what and when private information is stored outside an object
- [Observer](#): number of objects that depend on another object, how the dependent objects stay up-to-date
- [State](#): states of an object
- [Strategy](#): implementation of different algorithms at runtime
- [Template Method](#): steps of an algorithm
- [Visitor](#): operations that can be applied to object(s) without changing their class(es)


### [Creational Patterns](./CreationalPatterns)

<blockquote>
Creational patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or in added complexity to the design. Creational design patterns solve this problem by somehow controlling this object creation.

Creational design patterns are composed of two dominant ideas. One is encapsulating knowledge about which concrete classes the system uses. Another is hiding how instances of these concrete classes are created and combined.

Creational design patterns are further categorized into object-creational patterns and class-creational patterns, where object-creational patterns deal with object creation and class-creational patterns deal with class-instantiation. In greater details, object-creational patterns defer part of its object creation to another object, while class-creational patterns defer its object creation to subclasses
</blockquote>

_Source: [Wikipedia](https://en.wikipedia.org/wiki/Creational_pattern)_

- [Abstract Factory](./CreationalPatterns/AbstractFactory/src/main/java/Main.java): interface for creating families of related/dependent objects without specifying their concrete implementations
- [Builder](./CreationalPatterns/Builder/src/main/java/Main.java): how a composite object gets created 
- [Factory Method](./CreationalPatterns/FactoryMethod/src/main/java/Main.java): subclass of object that is instantiated
- [Prototype](./CreationalPatterns/Prototype/src/main/java/Main.java): class of object that is instantiated 
- [Singleton](./CreationalPatterns/Singleton/src/main/java/Main.java): the sole instance of a class 


### [Structural Patterns](./StructuralPatterns)
> Structural design pattern is a blueprint of how different objects and classes are combined to form a bigger structure for achieving multiple goals altogether. The patterns in structural designs show how unique pieces of a system can be combined in an extensible and flexible manner. So, with the help structural design pattern we can target and change a specific parts of the structure without changing the entire structure.

_Source: [Scaler Topics](https://www.scaler.com/topics/design-patterns/structural-design-pattern/)_

- [Adapter](./StructuralPatterns/Adapter/src/main/java/Main.java): allows objects with incompatible interfaces to collaborate
- [Bridge](./StructuralPatterns/Bridge/src/main/java/Main.java): split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other
- [Composite](./StructuralPatterns/Composite/src/main/java/Main.java): composition of an object in a tree-like structure
- [Decorator](./StructuralPatterns/Decorator/src/main/java/Main.java): responsibilities of an object without subclassing
- [Facade](./StructuralPatterns/Facade/src/main/java/Main.java): interface to a subsystem
- [Flyweight](./StructuralPatterns/Flyweight/src/main/java/Main.java): optimize storage costs of similar objects
- [Proxy](#): how object is accessed
