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

- We add another layer to the Factory Pattern
- CreditCardFactory is abstract class and contains getCreditCardFactory method that takes creditScore parameter
- Depending of the credit score it returns one of the concrete CreditCardFactories - VisaFactory or AmexFactory
- VisaFactory and AmexFactory are a sipmple Factory Pattern implementations

- Group collection of Factories together
- Common interface 
- Factories will reference multiple concrete classes, but the client is unaware
- Method to request an object is typically paramethrized, these parameters determine the concrete type
- Typically built using composition

## Pitfalls
- Complexity - most complex of Design Patterns
- Pattern that contains other Patterns
- Problem specific
- It often starts as a Factory and is refactored into AbstractFactory

