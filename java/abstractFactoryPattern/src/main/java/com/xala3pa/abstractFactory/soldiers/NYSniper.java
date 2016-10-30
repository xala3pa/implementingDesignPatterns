package com.xala3pa.abstractFactory.soldiers;

import com.xala3pa.abstractFactory.factories.SoldierWeaponFactory;

public class NYSniper extends Soldier {

    private static final String SNIPER = "NY Sniper";

    private SoldierWeaponFactory soldierWeaponFactory;

    public NYSniper(SoldierWeaponFactory soldierWeaponFactory) {
        this.soldierWeaponFactory = soldierWeaponFactory;
        type = SNIPER;
    }

    @Override
    public void train() {
        rifle = soldierWeaponFactory.createRifle();
        grenade = soldierWeaponFactory.createGrenade();
        shotguns = soldierWeaponFactory.createShotguns();

        printTraining();
    }
}
