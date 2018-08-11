# Prototype
## Creational Pattern
- Avoids costly creation
- Avoids subclassing, you create instance of the actual class you wanna work with
- Typically doesn't use the keyword new, only the first instance might use it
- Often utilizes Interface
- Usually implemented with Registry - original object is created and then kept in Registry. When another object is needed we create a clone of that object from the Registry.

## Examples:
- java.lang.Object.clone()

## Design:

![alt text](https://i.imgur.com/D6kXi0e.png "Prototype UML Diagram")

- Item class implements Cloneable
- Item class overrides clone method and returns super.clone() within
- Registry class contains items map
- Registry class contains loadItems method that loads some data to items map
- Registry class contains createItem method that takes itemName parameter. It uses itemName to find an Item object in items map, and it returns item.clone() thus creating a shallow copy of Item object

- If object is expensive to create but we can get what we need by copying the member variables
- Implements Clone/Cloneable - thus we avoid using keyword 'new'
- Although we are making a copy, each instance is unique
- Costly construction is not handled by client, unlike Builder
- Can utilize parameters for construction, typically you won't
- Only does shallow copy - primitive types are copied but object references point to the same objects, deep copy has to be implemented manually - object references point to different objects with same property values

## Pitfalls
- Used with other patterns (Registry?)
