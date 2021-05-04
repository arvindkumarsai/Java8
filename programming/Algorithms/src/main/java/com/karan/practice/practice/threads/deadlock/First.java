package com.karan.practice.practice.threads.deadlock;

public class First{



    public synchronized void show(Second second){
        String name = Thread.currentThread().getName();
        System.out.println(name + "Enter into first class");
        try{

            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println("First interupted");
        }

        System.out.println("Trying to call Second");
        second.show1();

    }
    synchronized void show1(){
        System.out.println("I am in First");
    }

}
