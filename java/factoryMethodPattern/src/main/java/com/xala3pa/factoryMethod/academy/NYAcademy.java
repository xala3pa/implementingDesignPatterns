package com.xala3pa.factoryMethod.academy;

import com.xala3pa.factoryMethod.army.NYMarine;
import com.xala3pa.factoryMethod.army.NYSniper;
import com.xala3pa.factoryMethod.army.Soldier;

import java.util.Optional;

public class NYAcademy extends Academy {
    @Override
    Optional<Soldier> recruitSoldier(String type) {

        Soldier soldier = null;

        if (type.equals("NY Marine")) {
            soldier = new NYMarine();
        } else if (type.equals("NY Sniper")) {
            soldier = new NYSniper();
        }
        return Optional.ofNullable(soldier);
    }
}
