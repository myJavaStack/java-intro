## Abstract

- An abstract class is a class that can be inherited by other classes
but that **you can’t use to create an object**.
- To declare an abstract class, code the abstract keyword in the class
declaration.
- An abstract class can contain fields, constructors, and methods
just like other superclasses. It can also contain abstract methods.
- To create an abstract method, you code the abstract keyword in
the method declaration and you omit the method body.
- Abstract methods cannot have private access. However, they may
have protected or default access (no access modifier).
- When a subclass inherits an abstract class, all abstract methods in
the abstract class must be overridden in the subclass.
- Any class that contains an abstract method must be declared as
abstract.


### How to work with the final keyword
- To prevent a class from being inherited, you can create a **final
class.**
- To prevent subclasses from overriding a method of a superclass,
you can create a **final method.**
- To prevent a method from assigning a new value to a parameter,
you can create a **final parameter.**
- All methods in a final class are automatically final methods.
- Coding the final keyword for classes and methods can result in a
minor performance improvement because the compiler doesn’t
have to allow for inheritance and polymorphism

## Interface

#### What is an interface?
An interface is a classlike construct that contains only
constants and abstract methods. 

#### Why is an interface useful?
In many ways, an interface is similar to an abstract
class, but the intent of an interface is **to specify
common behavior for objects.**

• For example, you can specify that the objects are
comparable, edible, cloneable using appropriate
interfaces. 

#### How do you define an interface?
```
public interface InterfaceName {
constant declarations;
method signatures;
}
```
- An interface defines a set of public methods that can be
implemented by a class.
- The interface itself doesn’t provide any code to implement the
methods. Instead, it merely provides the method signatures.
- A class that implements an interface must provide an
implementation for each method defined by the interface.
- An interface can also define public constants. Then, those
constants are available to any class that implements the interface.

####  How do you use an interface?
***implements***

[comparison photo]

#### Advantages of an abstract class
- An abstract class can use instance variables and constants as well
as static variables and constants. Interfaces can only use static
constants.
- An abstract class can define regular methods that contain code as
well as abstract methods that don’t contain code. An interface can
only define abstract methods.
- An abstract class can define static methods. An interface can’t.
#### Advantages of an interface
- A class can only directly inherit one other class, but it can directly
implement multiple interfaces.
- Any object created from a class that implements an interface can
be used wherever the interface is accepted.

#### Interfaces of the Java API
- The Java API defines many interfaces that you can implement in
your classes.
- An interface that doesn’t contain any constants or methods and
that is primarily used to identify some aspect of the object is
known as a tagging interface.

#### How to code an interface
- Declaring an interface is similar to declaring a class except that
you use the interface keyword instead of the class keyword.
- In an interface, all methods are automatically declared public and
abstract, and all constants are automatically declared public, static,
and final, so the access modifiers are optional.
- Interface methods can’t be static.

### Omitting Modifiers in Interfaces
All data fields are public final static and all methods are public
abstract in an interface. For this reason, these modifiers can be
omitted

***“extends” precedes “implements” in class declaration***
