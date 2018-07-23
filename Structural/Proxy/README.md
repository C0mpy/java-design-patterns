# Proxy
## Structural Pattern
- Acts as an interface to something else
- When we want to wrap a real object with a proxy
- You create an interface to an object by wrapping it with a class
- Can also add more functionality to the wrapped object, but it is not its main purpose
- Can be used for: Security, simplifying an interface, Remote Service Call, Expensive object to create
- Proxy is called to access the real object
 
## Examples:
- java.lang.reflect.Proxy
- java.rmi.*
 
## Design:
- Interface and an Implementation class, Proxy resides in between
 
![alt text](https://i.imgur.com/gyUkG3Z.png "Proxy UML Diagram")
 
- Client makes a reference call to Subject
- Subject rather than retrieving the real Subject that we want, it's going to be intercepted with proxy
- Subject is an interface to the implementation class we want to retrieve
- Proxy intercepts that call and makes the call to the RealSubject
 
## Pitfalls
- We only have one proxy, if we want security and auditing, we have to do it in that one proxy, we cant separate these out
- Adds another abstraction
