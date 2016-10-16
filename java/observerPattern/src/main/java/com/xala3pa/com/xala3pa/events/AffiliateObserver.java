package com.xala3pa.com.xala3pa.events;

import com.xala3pa.Observer;
import com.xala3pa.Subject;

public class AffiliateObserver implements Observer {
    private Subject eventPublisher;

    public AffiliateObserver(Subject eventPublisher) {
        this.eventPublisher = eventPublisher;
        eventPublisher.attachObserver(this);
    }

    @Override
    public void update(Subject eventPublisher) {
        Event event;

        if (eventPublisher instanceof EventPublisher) {
            EventPublisher publisher = (EventPublisher) eventPublisher;
            event = publisher.getEvent();
            displayEvent(event);
        }
    }

    private void displayEvent(Event event) {
        System.out.println("Publish the event to the affiliate portal: " + event.getName());
    }
}
