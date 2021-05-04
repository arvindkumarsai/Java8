package com.karan.practice.practice.java8.stringjoiner;

import java.util.StringJoiner;

public class ExampleStringJoiner {

    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner("$");
        joiner.add("One");
        joiner.add("Two");
        joiner.add("Three");
        System.out.println(joiner.toString());
    }
}
