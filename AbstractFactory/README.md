# AbstractFactory
## Creational Pattern
- Factory of Factories
- Factory of related objects
- Common interface implemented by AbstractFactory and its underlying factories
- deffers creation logic to the subclass

## Examples:
- DocumentBuilder
- Frameworks

## Design
![alt text](https://i.imgur.com/oytdD6t.png "AbstractFactory UML Diagram")

- Group collection of Factories together
- Common interface 
- Factories will reference multiple concrete classes, but the clien is unaware
- Method to request an object is typically paramethrized, these parameters determine the concrete type
- Typically built using composition

## Pitfalls
- Complexity - most complex of Design Patterns
- Pattern that contains other Patterns
- Problem specific
- It often starts as a Factory and is refactored into AbstractFactory

