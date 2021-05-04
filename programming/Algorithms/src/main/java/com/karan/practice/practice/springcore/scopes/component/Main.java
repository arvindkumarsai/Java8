package com.karan.practice.practice.springcore.scopes.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service1 = context.getBean(UserService.class);
        service1.setUserName("Karan");
        System.out.println("Return ----> " + service1.getUserName());

        UserService service2 = context.getBean(UserService.class);
        System.out.println("Return ----> " + service2.getUserName());
    }
}
