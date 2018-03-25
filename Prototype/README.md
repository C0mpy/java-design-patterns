# Prototype
## Creational Pattern
- avoids costly creation
- avoids subclassing, you create instance of the actual class you wanna work with
- typically doesn't use the keyword new, only the first instance might use it
- often utilizes Interface
- only does shallow copy, deep copy has to be implemented manually
- usually implemented with Registry - original object is created and then kept in Registry. When another object is needed we create a clone of that object from the Registry.

## Examples:
- java.lang.Object.clone()

![alt text](https://i.imgur.com/D6kXi0e.png "Prototype UML Diagram")

- If object is expensive to create but we can get what we need by copying the member variables
- Implements Clone/Cloneable 
- Although a copy, each instance is unique
- Costly construction is not handled by client
- Can utilize parameters for construction

## Pitfalls
- Used with other patterns (Registry?)
