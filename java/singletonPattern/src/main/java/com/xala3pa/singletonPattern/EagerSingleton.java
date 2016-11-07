package com.xala3pa.singletonPattern;

public class EagerSingleton {

    //we create eagerly the instance, in order to avoid race conditions.
    //Only use this solution if your application always creates and uses an instance of the Singleton.
    private static EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return uniqueInstance;
    }
}
