package com.xala3pa.factoryMethod

import com.xala3pa.factoryMethod.academy.Academy
import com.xala3pa.factoryMethod.academy.NYAcademy
import com.xala3pa.factoryMethod.academy.SFAcademy
import com.xala3pa.factoryMethod.army.NYMarine
import com.xala3pa.factoryMethod.army.SFMarine
import com.xala3pa.factoryMethod.army.Soldier
import spock.lang.Specification


class BattleFieldSpec extends Specification {
    def "Should  received a trained NY marine soldier from the academy"() {
        given: "NY Academy"
        Academy nyAcademy = new NYAcademy();

        when: "we for training a soldier"
        Optional<Soldier> soldier = nyAcademy.trainSoldier("NY Marine");

        then: "we receive a trained NY marine soldier"
        soldier.get().getClass() == NYMarine
    }

    def "Should  received a trained SF marine soldier from the academy"() {
        given: "SF Academy"
        Academy sfAcademy = new SFAcademy();

        when: "we for training a soldier"
        Optional<Soldier> soldier = sfAcademy.trainSoldier("SF Marine");

        then: "we receive a trained NY marine soldier"
        soldier.get().getClass() == SFMarine
    }
}
