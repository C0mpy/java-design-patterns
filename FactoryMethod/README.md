# Factory Method
## Creational Pattern
- doesn't expose instantiation logic - the client knows next to nothing
- deffers creation logic to the subclass
- client knows only about the inteface that the factory exposes
- specified by architecture, implemented by user

## Examples:
- Calendar
- ResourceBundle
- NumberFormat


## Design
![alt text](https://i.imgur.com/JOAIqx6.png "Factory Method UML Diagram")

- Factory is responsible for creating instances
- Objects created are referenced through the common inteface
- Factories will reference multiple concrete classes, but the clien is unaware
- Method to request an object is typically paramethrized, these parameters determine the concrete type


