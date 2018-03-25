# Builder
## Creational Pattern
- handles complex constructors (lots of arguments for a constructor or lots of setters)
- immutability once the construction is finished
- no Inteface required, can be implemented if you want

## Examples:
- StringBuilder
- DocumentBuilder
- Locale.Builder

![alt text](https://i.imgur.com/OahUvHf.png "Builder UML Diagram")

- Solves having multiple constructors with different parameters (telescoping)
- Static inner Class - returns instance of the object that it is building
- Doesn't negate the need for Constructors, rather it calls appropriate constructor based off its state
- Negates the need for exposed Setters
- Inforces a contract - properties must have a value

## Things to Consider
- Objects created with Builder are typically designed to be immutable
- Adds complexity
- Designed first


