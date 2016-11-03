package com.xala3pa.abstractFactory.academies;

import com.xala3pa.abstractFactory.factories.SFSoldierWeaponsFactory;
import com.xala3pa.abstractFactory.factories.SoldierWeaponFactory;
import com.xala3pa.abstractFactory.soldiers.SFMarine;
import com.xala3pa.abstractFactory.soldiers.SFSniper;
import com.xala3pa.abstractFactory.soldiers.Soldier;

public class SFAcademy extends Academy {
    @Override
    public Soldier recruitSoldier(String type) {
        Soldier soldier = null;
        SoldierWeaponFactory soldierWeaponFactory = new SFSoldierWeaponsFactory();

        if (type.equals("SF Marine")){
            soldier = new SFMarine(soldierWeaponFactory);
        } else if (type.equals("SF Sniper")) {
            soldier = new SFSniper(soldierWeaponFactory);
        }

        return soldier;
    }

    @Override
    public String toString() {
        return "SF Academy";
    }
}
