package com.xala3pa.abstractFactory;

import com.xala3pa.abstractFactory.academies.NYAcademy;
import com.xala3pa.abstractFactory.academies.SFAcademy;
import com.xala3pa.abstractFactory.soldiers.Soldier;

public class BattleField {
    public static void main(String[] args) {
        NYAcademy nyAcademy = new NYAcademy();
        Soldier nyMarine = nyAcademy.recruitSoldier("NY Marine");
        nyMarine.train();

        Soldier nySniper = nyAcademy.recruitSoldier("NY Sniper");
        nySniper.train();

        SFAcademy sfAcademy = new SFAcademy();
        Soldier sfMarine = sfAcademy.recruitSoldier("SF Marine");
        sfMarine.train();

        Soldier sfSniper = sfAcademy.recruitSoldier("SF Sniper");
        sfSniper.train();
    }
}
