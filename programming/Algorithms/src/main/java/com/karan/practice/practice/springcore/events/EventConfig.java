package com.karan.practice.practice.springcore.events;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventConfig {

    @Bean
    AListenerBean listenerBean()
    {
        return new AListenerBean();
    }

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        System.out.println("-- starting context --");
        context.start();
        System.out.println("-- stop context --");
        context.stop();

    }
}
