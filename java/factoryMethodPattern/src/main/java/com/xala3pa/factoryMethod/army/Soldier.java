package com.xala3pa.factoryMethod.army;

import java.util.ArrayList;

public abstract class Soldier {
    String type;
    ArrayList<String> weapons = new ArrayList<>();

    public String getType() {
        return type;
    }

    public void train() {
        System.out.println("Training a new " + type + " soldier in handling a: ");
        for (String weapon : weapons) {
            System.out.println("    * " + weapon);
        }
    }
}
