##Command Pattern

##Description

* Command Pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to perform an action or trigger an event at a later time.
* The client that creates a command is not the same client that executes it. This separation provides flexibility in the timing and sequencing of commands. 

##Check list

1. Define a Command interface with a method signature like execute().
2. Create one or more derived classes that encapsulate some subset of the following: a "receiver" object, the method to invoke, the arguments to pass.
3. Instantiate a Command object for each deferred execution request.
4. Pass the Command object from the creator (aka sender) to the invoker (aka receiver).
5. The invoker decides when to execute().

##Structure
![Command Pattern Structure](https://cdn.rawgit.com/xala3pa/implementingDesignPatterns/master/java/commandPattern/command.gif) 
