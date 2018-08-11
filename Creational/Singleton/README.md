# Singleton
## Creational Pattern
- Only one instance is created
- Guarantees control of a resource
- Usually lazily loaded

## Examples:
- Runtime Environment
- Logger
- Spring Beans - by default
- Graphic Managers

## Design:

![alt text](https://i.imgur.com/HoSiiqh.png "Singleton UML Diagram")

- Singleton class contains private instance property
- Singleton class contains private constructor
- Singleton contains public getInstance method
- We use getInstance method when we need an instance of Singleton
- getInstance sets instance if it doesn't already exist by calling the constructor
- If instance is already set, getInstance returns the existing instance

- Needs to be Thread-Safe
- No parameters required for construction - if you require parameters, you need a Factory Pattern

## Pitfalls
- Difficult to Unit-Test
- If not careful, not Thread-Safe
- Sometimes confused for Factory
