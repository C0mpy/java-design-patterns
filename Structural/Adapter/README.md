# Adapter
## Structural Pattern
- When we want a client to talk to an existing interface
- Usually when one part of system is a legacy app or module that we can't change
- Translates requests from client to the code we are adapting to
- Client -> Adapter -> Adaptee

## Examples:
- Arrays to Lists conversions
- Streams

## Design:

![alt text](https://i.imgur.com/3N6dxxF.png "Adapter UML Diagram")

- We have three different Employee Beans: EmployeeDB, EmployeeLegacy, EmployeeCSV, all sharing the same interface: Employee
- We use EmployeeLegacyAdapter to convert EmployeeLegacy's properties to EmployeeDB's properties
- We use EmployeeCSVAdapter to convert EmployeeCSV's properties to EmployeeDB's properties
- We want only to work with EmployeeDB beans in our application

- Client-centric, its implemented so that new client can be integrated to legacy code
- Often implemented to an interface, but not required

## Pitfalls
- Don't overcomplicate
- Don't add functionality - you probably need Decorator Pattern
