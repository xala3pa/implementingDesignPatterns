##Singleton Pattern

##Description

* The **singleton pattern** is a design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system like for example caches, logging, etc... 
* There are some who are critical of the singleton pattern and consider it to be an anti-pattern in that it is frequently used in scenarios where it is not beneficial, introduces unnecessary restrictions in situations where a sole instance of a class is not actually required, and introduces global state into an application.
* **Check list:**
  * Define a private static attribute in the "single instance" class.
  * Define a public static accessor function in the class.
  * Do "lazy initialization" (creation on first use) in the accessor function.
  * Define all constructors to be private.
  * Clients may only use the accessor function to manipulate the Singleton.
  
* How to deal with multithreading?

  * If performace is not an issue, we can solve it adding the synchronized keyword to the `getInstance()`, in order to force every thread to wait its turn.
  * Move to an eagerly created instance rather than a lazily created one.
  * Use “double-checked locking” to reduce the use of synchronization in getInstance()
  
  
##Structure
![Singleton Pattern Structure](https://cdn.rawgit.com/xala3pa/implementingDesignPatterns/master/java/singletonPattern/singl014.gif)   
