package com.xala3pa.abstractFactory

import com.xala3pa.abstractFactory.academies.Academy
import com.xala3pa.abstractFactory.academies.NYAcademy
import com.xala3pa.abstractFactory.academies.SFAcademy
import com.xala3pa.abstractFactory.soldiers.NYMarine
import com.xala3pa.abstractFactory.soldiers.NYSniper
import com.xala3pa.abstractFactory.soldiers.SFMarine
import com.xala3pa.abstractFactory.soldiers.SFSniper
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class BattleFieldSpec extends Specification {

    @Shared
    Academy nyAcademy = new NYAcademy()
    @Shared
    Academy sfAcademy = new SFAcademy()

    @Unroll
    def "Should  received  #soldierType soldier from the #academy"() {
        expect:
        academy.recruitSoldier(soldierType).class == soldierClass

        where:
        academy   | soldierType || soldierClass
        nyAcademy | "NY Marine" || NYMarine
        nyAcademy | "NY Sniper" || NYSniper
        sfAcademy | "SF Marine" || SFMarine
        sfAcademy | "SF Sniper" || SFSniper
    }

}