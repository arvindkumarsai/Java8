package com.karan.practice.practice.springcore.scopes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService service = context.getBean("accountService" , AccountService.class);
        service.setAccountHolder("Karan");
        System.out.println(service.getAccountHolder());


        AccountService service2 = context.getBean("accountService" , AccountService.class);
        System.out.println(service2.getAccountHolder());
        context.close();

    }
}
