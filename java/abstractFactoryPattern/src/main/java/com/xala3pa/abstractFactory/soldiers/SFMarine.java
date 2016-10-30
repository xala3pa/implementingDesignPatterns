package com.xala3pa.abstractFactory.soldiers;

import com.xala3pa.abstractFactory.factories.SoldierWeaponFactory;

public class SFMarine extends Soldier {

    private static final String MARINE = "SF Marine";

    private SoldierWeaponFactory soldierWeaponFactory;

    public SFMarine(SoldierWeaponFactory soldierWeaponFactory) {
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
