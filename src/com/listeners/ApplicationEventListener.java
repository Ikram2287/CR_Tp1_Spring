package com.listeners;

import com.modele.Materiel;
import org.springframework.context.ApplicationListener;

public class ApplicationEventListener<T extends Materiel> implements ApplicationListener<MyEvent<T>> {
    @Override
    public void onApplicationEvent(MyEvent<T> event) {
        System.out.println("Event triggered");
        System.out.println("event.getEventType() = " + event.getEventType());
        System.out.println("event.getSource() = " + event.getSource());
    }
}