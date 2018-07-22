# Decorator (wrapper)
## Structural Pattern
- Wrap an object to add functionality to it, original object can stay the same
- Add behaviour to an object without affecting other parts of the hierarchy
- Compose behaviour dynamically

## Examples:
- java.io.InputStream

## Design:

![alt text](https://i.imgur.com/BfZmWFE.png "Decorator UML Diagram")

- Inheritance based but utilizes composition and inheritance
- There is a common component but the common functionality is added in the subcomponents
- Alternative to subclassing
- Constructor requires instance from the hierarchy to build upon it

## Pitfalls
- New class for every feature added
- Multiple little objects
