package com.xala3pa.factoryMethod.academy;

import com.xala3pa.factoryMethod.army.Soldier;

import java.util.Optional;

public abstract class Academy {
    public Optional<Soldier> trainSoldier(String type) {
        Optional<Soldier> soldier = recruitSoldier(type);
        soldier.get().train();

        return soldier;
    }

    abstract Optional<Soldier> recruitSoldier(String type);
}
