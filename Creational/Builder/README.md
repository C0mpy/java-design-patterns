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

- LunchOrder class contains some private final properties bread, condiments, meat, dressing
- LunchOrder class contains internal Builder class with the same private non-final properties: bread, condiments, meat, dressing
- LunchOrder class contains constructor that takes Builder object as a parameter
- LunchOrder class contains only getter methods, no setters are present
- Builder class contains setter methods so that we can change Builder's properties
- Builder class contains build method that returns LunchOrder's constructor and passes this as parameter
- LunchOrder's constructor takes Builder's properties and sets them as LunchOrder's final properties

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


