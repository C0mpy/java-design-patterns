# Singleton
## Creational Pattern
- only one instance is created
- guarantees control of a resource
- usually lazily loaded

## Examples:
- Runtime Environment
- Logger
- Spring Beans - by default
- Graphic Managers

![alt text](https://i.imgur.com/HoSiiqh.png "Singleton UML Diagram")

- Class is responsible for lifecycle
- Static in nature
- Always returns the same instance
- Needs to be Thread-Safe
- Private instance
- Private Constructor
- No parameters required for construction
- No Interface

## Pitfalls
- Difficult to Unit-Test
- If not careful, not Thread-Safe
- Sometimes confused for Factory - if getInstance needs parameters, its not a Singleton anymore

