package com.xala3pa.singletonPattern

import spock.lang.Shared
import spock.lang.Specification


class EagerSingletonSpec extends Specification {
    @Shared
    EagerSingleton uniqueInstance = EagerSingleton.getInstance()


    def "Should get same EagerSingleton when we instantiate the class again"() {
        when: "we instantiate the class again"
        EagerSingleton otherInstance = EagerSingleton.getInstance()

        then: "we get the same instance"
        otherInstance.is(uniqueInstance)
    }
}
