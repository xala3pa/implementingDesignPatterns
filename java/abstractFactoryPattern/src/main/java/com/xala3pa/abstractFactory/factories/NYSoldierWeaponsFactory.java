package com.xala3pa.abstractFactory.factories;

import com.xala3pa.abstractFactory.weapons.*;

public class NYSoldierWeaponsFactory implements SoldierWeaponFactory {
    @Override
    public Rifle createRifle() {
        return new RemingtonRifle();
    }

    @Override
    public Grenade createGrenade() {
        return new BrunswickGrenade();
    }

    @Override
    public Shotguns createShotguns() {
        return new RetayShotgun();
    }
}
