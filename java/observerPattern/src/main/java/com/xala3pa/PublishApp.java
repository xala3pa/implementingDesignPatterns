package com.xala3pa;

import com.xala3pa.com.xala3pa.events.*;

import java.time.Instant;

public class PublishApp {
    public static void main(String[] args) {
        EventPublisher eventPublisher = new EventPublisher();
        Event event = new Event("Java Unconference", Instant.now());

        SlackObserver slackObserver = new SlackObserver(eventPublisher);
        EmailObserver emailObserver = new EmailObserver(eventPublisher);
        AffiliateObserver affiliateObserver = new AffiliateObserver(eventPublisher);

        eventPublisher.setEvent(event);
    }
}
