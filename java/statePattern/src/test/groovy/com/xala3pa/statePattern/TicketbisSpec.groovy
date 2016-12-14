package com.xala3pa.statePattern

import spock.lang.Shared
import spock.lang.Specification

class TicketbisSpec extends Specification {
       @Shared Purchase purchase = new Purchase()

    def "should set pending state when handleAction is call"() {
        given:
        State pending = new Pending()

        when:
        pending.handleAction(purchase)

        then:
        purchase.state == pending
    }

    def "should set Confirmed state when handleAction is call"() {
        given:
        State confirmed = new Confirmed()

        when:
        confirmed.handleAction(purchase)

        then:
        purchase.state == confirmed
    }
}
