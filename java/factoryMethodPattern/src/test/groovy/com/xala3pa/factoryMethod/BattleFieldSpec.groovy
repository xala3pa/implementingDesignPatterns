package com.xala3pa.factoryMethod

import com.xala3pa.factoryMethod.academy.Academy
import com.xala3pa.factoryMethod.academy.NYAcademy
import com.xala3pa.factoryMethod.academy.SFAcademy
import com.xala3pa.factoryMethod.army.NYMarine
import com.xala3pa.factoryMethod.army.NYSniper
import com.xala3pa.factoryMethod.army.SFMarine
import com.xala3pa.factoryMethod.army.SFSniper
import com.xala3pa.factoryMethod.army.Soldier
import spock.lang.Specification

class BattleFieldSpec extends Specification {

    Academy academy;
    Optional<Soldier> soldier;

    def "Should  received a trained NY marine soldier from the academy"() {
        given: "NY Academy"
        academy = new NYAcademy();

        when: "we for training a soldier"
        soldier = academy.trainSoldier("NY Marine");

        then: "we receive a trained NY marine soldier"
        soldier.get().class == NYMarine
    }

    def "Should  received a trained NY Sniper soldier from the academy"() {
        given: "NY Academy"
        academy = new NYAcademy();

        when: "we for training a soldier"
        soldier = academy.trainSoldier("NY Sniper");

        then: "we receive a trained NY Sniper soldier"
        soldier.get().class == NYSniper
    }

    def "Should  received a trained SF marine soldier from the academy"() {
        given: "SF Academy"
        academy = new SFAcademy();

        when: "we for training a soldier"
        soldier = academy.trainSoldier("SF Marine");

        then: "we receive a trained SF marine soldier"
        soldier.get().class == SFMarine
    }

    def "Should  received a trained SF Sniper soldier from the academy"() {
        given: "SF Academy"
        academy = new SFAcademy();

        when: "we for training a soldier"
        soldier = academy.trainSoldier("SF Sniper");

        then: "we receive a trained SF Sniper soldier"
        soldier.get().class == SFSniper
    }
}
