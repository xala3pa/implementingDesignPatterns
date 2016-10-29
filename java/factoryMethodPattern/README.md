##Intent

* Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
* Factory Method relies on inheritance: object creation is delegated to subclasses, which implement the factory method to create objects
* The intent of Factory Method is to allow a class to defer instantiation to its subclasses.
* Factories are a powerful technique for coding to abstractions, not concrete classes.
* Defining a "virtual" constructor.
* The `new` operator considered harmful. We get more coupled classes.

##Structure
![Observer Pattern Structure](https://cdn.rawgit.com/xala3pa/implementingDesignPatterns/master/java/factoryMethodPattern/factory_pattern_uml_diagram.jpg)

