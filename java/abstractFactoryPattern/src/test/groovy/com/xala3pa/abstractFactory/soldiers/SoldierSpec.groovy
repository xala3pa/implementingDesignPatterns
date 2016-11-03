package com.xala3pa.abstractFactory.soldiers

import com.xala3pa.abstractFactory.factories.SoldierWeaponFactory
import com.xala3pa.abstractFactory.weapons.BrunswickGrenade
import com.xala3pa.abstractFactory.weapons.ColtRifle
import com.xala3pa.abstractFactory.weapons.HamasGrenade
import com.xala3pa.abstractFactory.weapons.MarlinShotgun
import com.xala3pa.abstractFactory.weapons.RemingtonRifle
import com.xala3pa.abstractFactory.weapons.RetayShotgun
import spock.lang.Specification


class SoldierSpec extends Specification {

    def "should create all weapons from the proper NY factory"(){
        given: ""
        SoldierWeaponFactory nySoldierWeaponFactory = Mock()
        NYMarine nyMarine = new NYMarine(nySoldierWeaponFactory)

        when: ""
        nyMarine.train()

        then: ""
        1 * nySoldierWeaponFactory.createRifle() >>  new RemingtonRifle()
        1 * nySoldierWeaponFactory.createGrenade() >> new BrunswickGrenade()
        1 * nySoldierWeaponFactory.createShotguns() >> new RetayShotgun()
    }

    def "should create all weapons from the proper SF factory"(){
        given: ""
        SoldierWeaponFactory sfSoldierWeaponFactory = Mock()
        SFMarine sfMarine = new SFMarine(sfSoldierWeaponFactory)

        when: ""
        sfMarine.train()

        then: ""
        1 * sfSoldierWeaponFactory.createRifle() >>  new ColtRifle()
        1 * sfSoldierWeaponFactory.createGrenade() >> new HamasGrenade()
        1 * sfSoldierWeaponFactory.createShotguns() >> new MarlinShotgun()
    }
}
