package com.xala3pa.factoryMethod

import com.xala3pa.factoryMethod.academy.Academy
import com.xala3pa.factoryMethod.academy.NYAcademy
import com.xala3pa.factoryMethod.academy.SFAcademy
import com.xala3pa.factoryMethod.army.NYMarine
import com.xala3pa.factoryMethod.army.SFMarine
import com.xala3pa.factoryMethod.army.SFSniper
import com.xala3pa.factoryMethod.army.Soldier
import spock.lang.Specification

class BattleFieldSpec extends Specification {
    def "Should  received a trained NY marine soldier from the academy"() {
        given: "NY Academy"
        Academy nyAcademy = new NYAcademy();

        when: "we for training a soldier"
        Optional<Soldier> soldier = nyAcademy.trainSoldier("NY Marine");

        then: "we receive a trained NY marine soldier"
        soldier.get().class == NYMarine
    }

    def "Should  received a trained NY Sniper soldier from the academy"() {
        given: "NY Academy"
        Academy nyAcademy = new NYAcademy();

        when: "we for training a soldier"
        Optional<Soldier> soldier = nyAcademy.trainSoldier("NY Sniper");

        then: "we receive a trained NY Sniper soldier"
        soldier.get().class == NYSnipe
    }

    def "Should  received a trained SF marine soldier from the academy"() {
        given: "SF Academy"
        Academy sfAcademy = new SFAcademy();

        when: "we for training a soldier"
        Optional<Soldier> soldier = sfAcademy.trainSoldier("SF Marine");

        then: "we receive a trained SF marine soldier"
        soldier.get().class == SFMarine
    }

    def "Should  received a trained SF Sniper soldier from the academy"() {
        given: "SF Academy"
        Academy sfAcademy = new SFAcademy();

        when: "we for training a soldier"
        Optional<Soldier> soldier = sfAcademy.trainSoldier("SF Sniper");

        then: "we receive a trained SF Sniper soldier"
        soldier.get().class == SFSniper
    }
}
