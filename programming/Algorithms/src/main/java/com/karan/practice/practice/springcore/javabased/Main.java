package com.karan.practice.practice.springcore.javabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello ... ");

        System.out.println(helloWorld.getMessage());


    }
}
