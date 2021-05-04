package com.karan.practice.practice.java8.finterface;

public class Example1 {

    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread started .... Older version");
            }
        }).start();

        new Thread(() -> System.out.println("Thread started ... new version")).start();
    }
}
