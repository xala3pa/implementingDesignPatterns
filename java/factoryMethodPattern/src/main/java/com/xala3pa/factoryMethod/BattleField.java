package com.xala3pa.factoryMethod;

import com.xala3pa.factoryMethod.academy.Academy;
import com.xala3pa.factoryMethod.academy.NYAcademy;
import com.xala3pa.factoryMethod.academy.SFAcademy;
import com.xala3pa.factoryMethod.army.Soldier;

import java.util.Optional;

public class BattleField {
    public static void main(String[] args) {
        Academy nyAcademy = new NYAcademy();
        Academy sfAcademy = new SFAcademy();

        Optional<Soldier> soldier = nyAcademy.trainSoldier("NY Marine");
        soldier = sfAcademy.trainSoldier("SF Sniper");
    }
}
