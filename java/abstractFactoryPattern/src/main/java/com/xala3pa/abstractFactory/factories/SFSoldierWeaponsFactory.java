package com.xala3pa.abstractFactory.factories;

import com.xala3pa.abstractFactory.weapons.*;

public class SFSoldierWeaponsFactory implements SoldierWeaponFactory {
    @Override
    public Rifle createRifle() {
        return new ColtRifle();
    }

    @Override
    public Grenade createGrenade() {
        return new HamasGrenade();
    }

    @Override
    public Shotguns createShotguns() {
        return new MarlinShotgun();
    }
}
