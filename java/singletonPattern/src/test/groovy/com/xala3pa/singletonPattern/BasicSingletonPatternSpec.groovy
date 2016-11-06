package com.xala3pa.singletonPattern

import spock.lang.Shared
import spock.lang.Specification


class BasicSingletonPatternSpec extends Specification {
    @Shared
    BasicSingletonPattern uniqueInstance = BasicSingletonPattern.getInstance()


    def "Should get same BasicSingletonPattern when we instantiate the class again"() {
        when: "we instantiate the class again"
        BasicSingletonPattern otherInstance = BasicSingletonPattern.getInstance()

        then: "we get the same instance"
        otherInstance.is(uniqueInstance)
    }
}
