package com.xala3pa.singletonPattern

import spock.lang.Shared
import spock.lang.Specification


class DoubleCheckedSingletonSpec extends Specification {
    @Shared
    DoubleCheckedSingleton uniqueInstance = DoubleCheckedSingleton.getInstance()


    def "Should get same DoubleCheckedSingleton when we instantiate the class again"() {
        when: "we instantiate the class again"
        DoubleCheckedSingleton otherInstance = DoubleCheckedSingleton.getInstance()

        then: "we get the same instance"
        otherInstance.is(uniqueInstance)
    }
}
