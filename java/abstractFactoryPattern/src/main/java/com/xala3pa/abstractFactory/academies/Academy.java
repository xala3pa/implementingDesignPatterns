package com.xala3pa.abstractFactory.academies;

import com.xala3pa.abstractFactory.soldiers.Soldier;

public abstract class Academy {
    protected abstract Soldier recruitSoldier(String type);

    public Soldier trainSoldier(String type) {
        Soldier soldier = recruitSoldier(type);
        soldier.train();

        return soldier;
    }
}
