package com.xala3pa.templatePattern

import spock.lang.Specification

class OpenNewSiteSpec extends Specification {

    def "should call every method defined in the algorithm except publish method"(){

        given:
        SpainSite spainSite = Mock()

        when:
        spainSite.publishSite()

        then:
        1 * spainSite.registerDomain()
        1 * spainSite.populateSiteData()
        1 * spainSite.uploadSiteInstance()
    }

    def "should call every method defined in the algorithm"(){

        given:
        UKSite ukSite = Mock()

        when:
        ukSite.publishSite()

        then:
        1 * ukSite.registerDomain()
        1 * ukSite.populateSiteData()
        1 * ukSite.publishEvents()
        1 * ukSite.uploadSiteInstance()
    }
}
