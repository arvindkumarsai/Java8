package com.karan.practice.practice.springcore.events;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;

public class AListenerBean {

    @EventListener
    public void handleContextStarted(ContextStartedEvent event)
    {
        System.out.print("context started event fired: ");
        System.out.println(event);
    }

    @EventListener
    public void handleContextStopped (ContextStoppedEvent event) {
        System.out.print("context stopped event fired: ");
        System.out.println(event);
    }
}
