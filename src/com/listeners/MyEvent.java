package com.listeners;

import com.modele.Materiel;
import org.springframework.context.ApplicationEvent;

public class MyEvent<T extends Materiel> extends ApplicationEvent {

    private final EventType eventType;

    public MyEvent(T source, EventType eventType) {
        super(source);
        this.eventType = eventType;
    }

    public EventType getEventType() {
        return eventType;
    }
}
