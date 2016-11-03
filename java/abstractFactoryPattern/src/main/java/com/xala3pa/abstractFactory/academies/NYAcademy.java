package com.xala3pa.abstractFactory.academies;

import com.xala3pa.abstractFactory.factories.NYSoldierWeaponsFactory;
import com.xala3pa.abstractFactory.factories.SoldierWeaponFactory;
import com.xala3pa.abstractFactory.soldiers.NYMarine;
import com.xala3pa.abstractFactory.soldiers.NYSniper;
import com.xala3pa.abstractFactory.soldiers.Soldier;

public class NYAcademy extends Academy {
    @Override
    public Soldier recruitSoldier(String type) {
        Soldier soldier = null;
        SoldierWeaponFactory soldierWeaponFactory = new NYSoldierWeaponsFactory();

        if (type.equals("NY Marine")){
            soldier = new NYMarine(soldierWeaponFactory);
        } else if (type.equals("NY Sniper")) {
            soldier = new NYSniper(soldierWeaponFactory);
        }

        return soldier;
    }

    @Override
    public String toString() {
        return "NY Academy";
    }
}
