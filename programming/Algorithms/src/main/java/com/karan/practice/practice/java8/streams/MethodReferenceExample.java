package com.karan.practice.practice.java8.streams;

import java.util.function.Consumer;

public class MethodReferenceExample {

    public static void main(String[] args) {

        Consumer<String> exp = p -> System.out.println(p);

        showMethodReference(exp);

        showMethodReference(System.out::println);
    }

    public static void showMethodReference(Consumer<String> consumer) {
        consumer.accept("String value ....");
    }

}
