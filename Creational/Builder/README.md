# Builder
## Creational Pattern
- Handles complex constructors (lots of arguments for a constructor or lots of setters)
- Immutability once the construction is finished

## Examples:
- StringBuilder
- DocumentBuilder
- Locale.Builder

## Design:

![alt text](https://i.imgur.com/OahUvHf.png "Builder UML Diagram")

- Solves having multiple constructors with different parameters (telescoping) - multiple constructors are hard to manage
- Solves telescoping by handling an Object in constructor instead of multiple parameters
- Static inner Class - for holding temporary data, until build() is called
- Doesn't negate the need for Constructors, rather it calls appropriate constructor based off its state
- Negates the need for exposed Setters
- Inforces a contract

## Things to Consider
- Objects created with Builder are typically designed to be immutable
- Adds complexity
- Designed first


