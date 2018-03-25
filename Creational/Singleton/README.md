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

- Singleton is responsible for creating itself and managing its lifecycle
- Static in nature but typically not implemented using static class
- Always returns the same instance
- Needs to be Thread-Safe
- Private instance within Singleton
- Private Constructor - we want Singleton to call the constructor and nobody else
- No parameters required for construction - if you require parameters, you need a Factory Pattern

## Pitfalls
- Difficult to Unit-Test
- If not careful, not Thread-Safe
- Sometimes confused for Factory - if getInstance needs parameters, its not a Singleton anymore

