package com.xala3pa.abstractFactory.soldiers;

import com.xala3pa.abstractFactory.factories.SoldierWeaponFactory;

public class NYMarine extends Soldier {

    private static final String MARINE = "NY Marine";

    private SoldierWeaponFactory soldierWeaponFactory;

    public NYMarine(SoldierWeaponFactory soldierWeaponFactory) {
        this.soldierWeaponFactory = soldierWeaponFactory;
        type = MARINE;
    }

    @Override
    public void train() {
        rifle = soldierWeaponFactory.createRifle();
        grenade = soldierWeaponFactory.createGrenade();
        shotguns = soldierWeaponFactory.createShotguns();

        printTraining();
    }

}
