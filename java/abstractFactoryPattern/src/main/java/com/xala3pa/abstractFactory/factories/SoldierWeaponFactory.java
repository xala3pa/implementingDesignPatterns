package com.xala3pa.abstractFactory.factories;

import com.xala3pa.abstractFactory.weapons.Grenade;
import com.xala3pa.abstractFactory.weapons.Rifle;
import com.xala3pa.abstractFactory.weapons.Shotguns;

public interface SoldierWeaponFactory {
    public Rifle createRifle();
    public Grenade createGrenade();
    public Shotguns createShotguns();
}
