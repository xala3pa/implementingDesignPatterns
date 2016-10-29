package com.xala3pa.factoryMethod.academy;

import com.xala3pa.factoryMethod.army.SFMarine;
import com.xala3pa.factoryMethod.army.SFSniper;
import com.xala3pa.factoryMethod.army.Soldier;

import java.util.Optional;

public class SFAcademy extends Academy {
    @Override
    Optional<Soldier> recruitSoldier(String type) {
        Soldier soldier = null;

        if (type.equals("SF Marine")) {
            soldier = new SFMarine();
        } else if (type.equals("SF Sniper")) {
            soldier = new SFSniper();
        }
        return Optional.ofNullable(soldier);
    }
}
