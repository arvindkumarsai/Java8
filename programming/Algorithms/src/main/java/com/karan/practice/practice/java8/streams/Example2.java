package com.karan.practice.practice.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Example2 {

    public static void main(String[] args) {

        Consumer<String> c = (i) -> System.out.println("Hello " + i);

        c.accept("Karan");

        List<String> l = new ArrayList<>();
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");

        Supplier<String> sup = () -> {

            int val = (int) (Math.random() * 3) + 1;
            return l.get(val);
        };

        System.out.println(sup.get());
        System.out.println(sup.get());
        System.out.println(sup.get());
        System.out.println(sup.get());
    }
}
