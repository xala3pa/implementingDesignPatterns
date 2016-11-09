package com.xala3pa.singletonPattern;


public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
        System.out.println(this.getClass());
    }
}

