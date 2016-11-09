package com.xala3pa.singletonPattern

import spock.lang.Specification

class EnumSingletonSpec extends Specification {

    def "Should get same EnumSingleton when we instantiate the class again"() {
        when: "we have an instance of the singleton"
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE

        and: "another instance of the singleton"
        EnumSingleton anotherEnumSingleton = EnumSingleton.INSTANCE

        then: "we get the same instance"
        enumSingleton.is(anotherEnumSingleton)
    }
}
