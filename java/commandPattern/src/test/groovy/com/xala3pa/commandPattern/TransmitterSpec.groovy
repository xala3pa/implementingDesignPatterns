package com.xala3pa.commandPattern

import com.xala3pa.commandPattern.command.FlightPower
import com.xala3pa.commandPattern.command.StrengthPower
import com.xala3pa.commandPattern.superHeros.Batman
import com.xala3pa.commandPattern.superHeros.Superman
import com.xala3pa.commandPattern.superHeros.WonderWoman
import spock.lang.Shared
import spock.lang.Specification

class TransmitterSpec extends Specification {

    @Shared
    PowersTransfer powersTransfer = new PowersTransfer()
    @Shared
    FlightPower flightPower = new FlightPower()
    @Shared
    StrengthPower strengthPower = new StrengthPower()

    def "should transfers flight power from Superman"() {
        given:
        Superman superman = Mock()

        when: "when we transfer power from Superman"
        flightPower.setSuperHero(superman)
        powersTransfer.setSuperPower(flightPower)
        powersTransfer.transfer()

        then: "we can fly using superman power"
        1 * superman.flight()
    }

    def "should transfers flight power from Wonderwoman"() {
        given:
        WonderWoman wonderWoman = Mock()

        when: "when we transfer power from Wonderwoman"
        flightPower.setSuperHero(wonderWoman)
        powersTransfer.setSuperPower(flightPower)
        powersTransfer.transfer()

        then: "we can fly using wonderwoman power"
        1 * wonderWoman.flight()
    }

    def "should transfers strength power from Batman"() {
        given:
        Batman batman = Mock()

        when: "when we transfer power from Batman"
        strengthPower.setSuperHero(batman)
        powersTransfer.setSuperPower(strengthPower)
        powersTransfer.transfer()

        then: "we can move mountains using Batman power"
        1 * batman.superStrength()
    }
}
