package com.xala3pa.singletonPattern

import spock.lang.Shared
import spock.lang.Specification


class BasicSynchronizedSingletonSpec extends Specification {
    @Shared
    BasicSynchronizedSingleton uniqueInstance = BasicSynchronizedSingleton.getInstance()


    def "Should get same BasicSynchronizedSingleton when we instantiate the class again"() {
        when: "we instantiate the class again"
        BasicSynchronizedSingleton otherInstance = BasicSynchronizedSingleton.getInstance()

        then: "we get the same instance"
        otherInstance.is(uniqueInstance)
    }
}
