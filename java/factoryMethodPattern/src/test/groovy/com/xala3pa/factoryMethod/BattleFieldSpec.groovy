package com.xala3pa.factoryMethod

import com.xala3pa.factoryMethod.academy.Academy
import com.xala3pa.factoryMethod.academy.NYAcademy
import com.xala3pa.factoryMethod.academy.SFAcademy
import com.xala3pa.factoryMethod.army.NYMarine
import com.xala3pa.factoryMethod.army.NYSniper
import com.xala3pa.factoryMethod.army.SFMarine
import com.xala3pa.factoryMethod.army.SFSniper
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class BattleFieldSpec extends Specification {

    @Shared
    Academy nyAcademy = new NYAcademy()
    @Shared
    Academy sfAcademy = new SFAcademy()

    @Unroll
    def "Should  received a trained #soldierType soldier from the #academy"() {
        expect:
        academy.trainSoldier(soldierType).get().class == soldierClass

        where:
        academy   | soldierType || soldierClass
        nyAcademy | "NY Marine" || NYMarine
        nyAcademy | "NY Sniper" || NYSniper
        sfAcademy | "SF Marine" || SFMarine
        sfAcademy | "SF Sniper" || SFSniper
    }
}
