package com.karan.practice.practice.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Example1 {

    public  static void process(Runnable r){
        r.run();
    }
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(10);
        l.add(20);
        l.add(25);
        l.add(45);
        System.out.println(l);

        // print the even numbers

        List<Integer> l2 = l.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(l2);

        List<Integer> l3 = l.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(l3);


        Runnable r1 = () -> System.out.println("Hello");
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from ...");
            }
        };

        process(r1);
        process(r2);

        process(()-> {});
        process(()-> System.out.println("hellooooo"));

    }

}
