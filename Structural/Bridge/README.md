# Bridge
## Structural Pattern
- Used to decouple abstraction and implementation
- Uses encapsulation, composition, inheritance
- Changes in the abstraction won't affect the Client
- If you are not sure what the end product will be, bridge is great for giving us flexibility without breaking things with change

## Examples:
- Drivers
- JDBC Drivers

## Design:

![alt text](https://i.imgur.com/jGPItcA.png "Bridge UML Diagram")

- Utilizes interfaces and abstract classes
- Composition over inheritance
- More than just composition
- Application can expect change from both sides

## Pitfalls
- Increases complexity
- Difficult to plan
