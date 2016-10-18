package com.xala3pa

import com.xala3pa.com.xala3pa.events.AffiliateObserver
import com.xala3pa.com.xala3pa.events.EmailObserver
import com.xala3pa.com.xala3pa.events.Event
import com.xala3pa.com.xala3pa.events.EventPublisher
import com.xala3pa.com.xala3pa.events.SlackObserver
import spock.lang.Shared
import spock.lang.Specification

import java.time.Instant

class PublishSimulatorSpec extends Specification {

    @Shared EventPublisher eventPublisher = new EventPublisher()

    def "Should notify a Slack Observer when it is attached"() {
        given: "a Slack Observer attached to the publisher"
        SlackObserver slackObserver = Mock()
        eventPublisher.attachObserver(slackObserver)

        and: "a new event on sale"
        Event event = new Event("Java Unconference", Instant.now());

        when: "a Publisher publish new event on sale"
        eventPublisher.setEvent(event)

        then: "Slack Observer is updated with the new event"
        1 * slackObserver.update(eventPublisher)
    }

    def "Should notify a Email Observer when it is attached"() {
        given: "a email Observer attached to the publisher"
        EmailObserver emailObserver = Mock()
        eventPublisher.attachObserver(emailObserver)

        and: "a new event on sale"
        Event event = new Event("Greach Conference", Instant.now());

        when: "a Publisher publish new event on sale"
        eventPublisher.setEvent(event)

        then: "Slack Observer is updated with the new event"
        1 * emailObserver.update(eventPublisher)
    }

    def "Should notify a Email Observer and  a affiliate Observer when they are attached"() {
        given: "a email Observer attached to the publisher"
        EmailObserver emailObserver = Mock()
        eventPublisher.attachObserver(emailObserver)

        and: "an affiliate Observer"
        AffiliateObserver affiliateObserver = Mock()
        eventPublisher.attachObserver(affiliateObserver)

        and: "a new event on sale"
        Event event = new Event("Greach Conference", Instant.now())

        when: "a Publisher publish new event on sale"
        eventPublisher.setEvent(event);

        then: "Email and affiliate Observers are updated with the new event"
        1 * emailObserver.update(eventPublisher)
        1 * affiliateObserver.update(eventPublisher)
    }

    def "Should NO notify to an Email Observer if it is not attached"() {
        given: "an email Observer"
        EmailObserver emailObserver = Mock()

        and: "a new event on sale"
        Event event = new Event("Greach Conference", Instant.now())

        when: "a Publisher publish new event on sale"
        eventPublisher.setEvent(event);

        then: "Email and affiliate Observers are updated with the new event"
        0 * emailObserver.update(eventPublisher)

    }

}
