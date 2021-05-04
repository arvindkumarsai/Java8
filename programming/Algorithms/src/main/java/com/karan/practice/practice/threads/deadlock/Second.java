package com.karan.practice.practice.threads.deadlock;

import java.lang.reflect.Field;

public class Second extends Thread {
    public synchronized void show(First first){
        String name = Thread.currentThread().getName();
        System.out.println(name + "Enter into Second class");
        try{

            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println("Second interupted");
        }

        System.out.println("Trying to call First");
        first.show1();
    }
    synchronized void show1(){
        System.out.println("I am in Second");
    }
}
