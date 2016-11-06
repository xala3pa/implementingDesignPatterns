package com.xala3pa.singletonPattern;

//Don't use this solution , it is not thread safe !!
public class BasicSingletonPattern {
    //Static variable to hold the instance of our BasicSingletonPattern Class
    private static BasicSingletonPattern uniqueInstance;

    //Our constructor has to be private, only BasicSingletonPattern can instantiate this Class !!
    private BasicSingletonPattern() {
    }

    //We will use this method in order to get an instance of the class. We will crate one if it doesn't exist yet.
    public static BasicSingletonPattern getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new BasicSingletonPattern();
        }
        return uniqueInstance;
    }
}
