package com.xala3pa.abstractFactory.soldiers;

import com.xala3pa.abstractFactory.weapons.Grenade;
import com.xala3pa.abstractFactory.weapons.Rifle;
import com.xala3pa.abstractFactory.weapons.Shotguns;

public abstract class Soldier {
    String type;
    Rifle rifle;
    Grenade grenade;
    Shotguns shotguns;

    public abstract void train();

    protected void printTraining() {
        System.out.println("Training a new " + type + " soldier in handling a: ");
        System.out.printf("  * Rifle, model = %s%n", rifle.toString());
        System.out.printf("  * Grenade, model = %s%n", grenade.toString());
        System.out.printf("  * Shotgun, model = %s%n", shotguns.toString());
    }
}
