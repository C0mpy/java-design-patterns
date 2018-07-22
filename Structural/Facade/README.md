# Facade
## Structural Pattern
- Provides a simplified interface to a complex system
- When we want to make an API easier to use
- When we encounter a poorly designed API, we can wrap a facade around it and hide the details from the client
- Simplify interface or client usage

## Examples:
- java.net.URL

## Design:

There is no standard UML diagram because Facade wrap whatever API we're working with.
We have a Facade class which does some operation and it contains through composition multple other APIs that it's providing a simpler interface

![alt text](https://i.imgur.com/MTY6YEe.png "Facade UML Diagram")

- Utilizes composition
- Shouldn't have a need for inheritance

## Pitfalls
- Used to clean up code, that is designed poorly to begin with
- Try to look at the design of your API and if another pattern will help solve the problem you are trying to solve with the facade
- Often misused or overlyused
