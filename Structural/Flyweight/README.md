# Flyweight
## Structural Pattern

- Minimizes memory use by sharing data with similarly typed objects
- When we need to make a more efficient use of memory
- An optimization pattern
- When we have a large number of similar, IMMUTABLE objects

## Examples:
- java.lang.String
- java.lang.Integer#valueOf(int)

## Design:
- Utilizes other patterns inside of it
- Uses factory to retrieve flyweight objects after they've been created
- It has creation pattern inside structural pattern
- It often manages the entire lifecycle of the object

![alt text](https://i.imgur.com/4btnxPX.png "Flyweight UML Diagram")

- Client is requesting the Flyweight object, although it doesn't know it's a flyweight
- Client requests it from the FlyweightFactory
- Factory returns the cached object or it creates a new instance of the flyweight
- ConcreteFlyweight is what gets returned to the Client

## Pitfalls
- Premature optimization, you have to plan it upfront
- Pattern inside a pattern
