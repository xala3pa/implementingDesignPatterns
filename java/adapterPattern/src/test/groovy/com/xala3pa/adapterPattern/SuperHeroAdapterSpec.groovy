package com.xala3pa.adapterPattern

import com.xala3pa.adapterPattern.dc.Dc
import com.xala3pa.adapterPattern.dc.MarvelAdapter
import com.xala3pa.adapterPattern.marvel.Hulk
import spock.lang.Specification

class SuperHeroAdapterSpec extends Specification {

    def "should adapt Marvel power to Dc ones"(){
        given: "Marvel superhero"
        Hulk hulk = Mock()

        and: "Marvel power adapter"
        Dc hulkWithDcPowers = new MarvelAdapter(hulk);

        when: "Hulk fly"
        hulkWithDcPowers.flight()

        then: "Hulk jump 8 times to fly like a Dc superHero"
        8 *  hulk.jump()
    }
}
