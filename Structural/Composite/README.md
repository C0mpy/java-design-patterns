# Composite
## Structural Pattern
- Treats components the same whether it is part of the structure or whole structure
- Composes components into tree structures
- Individual object treated as composite
- Same operations applied on individual and composites

## Examples:
- java.awt.Component
- JSF widgets
- RESTful GETs

## Design:

![alt text](https://i.imgur.com/Es2lhAX.gif "Composite UML Diagram")

- Tree structured
- Contains: Component, Leaf, Composite
- Root is component
- Component is either a leaf or a composite of objects
- Leaf has only operation and Composite has operations that leaf has and also contains leaf objects

## Pitfalls
- Can overly simplify system
- Implementation can be costly
