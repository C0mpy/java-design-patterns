# Factory Method
## Creational Pattern
- Doesn't expose instantiation logic - the client knows next to nothing
- Deffers creation logic to the subclass
- Client knows only about the inteface that the factory exposes
- Specified by architecture, implemented by user

## Examples:
- Calendar
- ResourceBundle
- NumberFormat

## Design

![alt text](https://i.imgur.com/JOAIqx6.png "Factory Method UML Diagram")

- Website class is superclass for Blog and Shop
- Client interacts with WebsiteFactory
- WebsiteFactory has getWebsite method that receives WebsiteType and returns appropriate website instance
- Client expects Website object but receives Website's subclass

- Factory is responsible for creating instances
- Objects created are referenced through the common inteface
- Factories will reference multiple concrete classes, but the client is unaware because he interact through the common interface
- Method to request an object is typically paramethrized, these parameters determine the concrete type

## Pitfalls
- Complexity
- Not refactored into, you need to decide in the start that you'll be using it

