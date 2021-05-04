package com.karan.practice.practice.java8.functions;

import java.util.function.Consumer;

public class ConsumerExample1 {
    public static void main(String[] args) {

        Consumer<Integer> print = i -> System.out.println(i);

        print.accept(125);
        print.accept(132);
        print.accept(156);
    }
}
