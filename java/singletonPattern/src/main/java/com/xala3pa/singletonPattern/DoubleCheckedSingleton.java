package com.xala3pa.singletonPattern;

//With double-checked locking, we first check to see if an instance is created, and if not, THEN we synchronize.
//This way, we only synchronize the first time through, just what we want.
public class DoubleCheckedSingleton {
    private volatile static DoubleCheckedSingleton uniqueInstance;

    private DoubleCheckedSingleton() {
    }

    public static DoubleCheckedSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
