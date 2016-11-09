package com.xala3pa.singleton

import spock.lang.Specification

class GroovySingletonSpec extends Specification {
    def "should return always an unique instance"() {
        expect:
        GroovySingleton.instance.is(GroovySingleton.instance)
    }

    def "Should throw an exception when we try to instantiate a singleton"() {
        when:
        new GroovySingleton()

        then:
        def runtimeException = thrown RuntimeException
        runtimeException.message == "Can't instantiate singleton com.xala3pa.singleton.GroovySingleton. " +
                "Use com.xala3pa.singleton.GroovySingleton.instance"
    }

    def "Should increase the counter"() {
        expect:
        GroovySingleton.instance.increaseCounter() == 1
    }
}
