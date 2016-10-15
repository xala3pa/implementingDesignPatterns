package com.xala3pa.com.xala3pa.events;

import com.xala3pa.Observer;
import com.xala3pa.Subject;

import java.util.ArrayList;

public class EventPublisher implements Subject {
    private ArrayList<Observer> subscribers;
    private Object event;

    public EventPublisher() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void attachObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        int index = subscribers.indexOf(observer);
        if (index >= 0){
            subscribers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void setEvent(Object event){
        this.event  = event;
        notifyObservers();
    }
}
