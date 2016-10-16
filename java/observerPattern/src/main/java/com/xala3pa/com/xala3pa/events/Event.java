package com.xala3pa.com.xala3pa.events;

import java.time.Instant;

public class Event {
    private String name;
    private Instant eventDate;

    public Event(String name, Instant eventDate) {
        this.name = name;
        this.eventDate = eventDate;
    }

    public String getName() {
        return name;
    }

    public Instant getEventDate() {
        return eventDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (getName() != null ? !getName().equals(event.getName()) : event.getName() != null) return false;
        return getEventDate() != null ? getEventDate().equals(event.getEventDate()) : event.getEventDate() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getEventDate() != null ? getEventDate().hashCode() : 0);
        return result;
    }
}
