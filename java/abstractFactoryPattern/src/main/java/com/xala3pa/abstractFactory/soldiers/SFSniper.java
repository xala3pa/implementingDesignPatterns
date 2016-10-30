package com.xala3pa.abstractFactory.soldiers;

import com.xala3pa.abstractFactory.factories.SoldierWeaponFactory;

public class SFSniper extends Soldier {

    private static final String SNIPER = "SF Sniper";

    private SoldierWeaponFactory soldierWeaponFactory;

    public SFSniper(SoldierWeaponFactory soldierWeaponFactory) {
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
