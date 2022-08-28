# GoF Design Patterns


## Introduction
This repository is collection of simple demos for each GoF design patterns.

Additional resources can be found at:
1. [Wikipedia](https://en.wikipedia.org/wiki/Design_Patterns)
2. [Refactoring Guru](https://refactoring.guru/design-patterns)
3. [Scaler Topics](https://www.scaler.com/topics/design-patterns/structural-design-pattern/)


## Setup
1. Java1.8 or above, preferably Java11
2. Tests with JUnit4


## Patterns

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

### [Behavioral Patterns](./BehavioralPatterns)
- TBD

### [Structural Patterns](./StructuralPatterns)
> Structural design pattern is a blueprint of how different objects and classes are combined to form a bigger structure for achieving multiple goals altogether. The patterns in structural designs show how unique pieces of a system can be combined in an extensible and flexible manner. So, with the help structural design pattern we can target and change a specific parts of the structure without changing the entire structure.

_Source: [Scaler Topics](https://www.scaler.com/topics/design-patterns/structural-design-pattern/)_


- [Adapter](./StructuralPatterns/Adapter/src/main/java/Main.java): allows objects with incompatible interfaces to collaborate
