package com.xala3pa.singletonPattern;

public class BasicSynchronizedSingleton {
    //Static variable to hold the instance of our BasicSynchronizedSingleton Class
    private static BasicSynchronizedSingleton uniqueInstance;

    //Our constructor has to be private, only BasicSynchronizedSingleton can instantiate this Class !!
    private BasicSynchronizedSingleton() {
    }

    //We will use this method in order to get an instance of the class. We will crate one if it doesn't exist yet.
    //Use of Synchronized add a overhead
    public static synchronized  BasicSynchronizedSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new BasicSynchronizedSingleton();
        }
        return uniqueInstance;
    }
}
