package com.karan.practice.practice.java8.streams;

import java.util.Arrays;
import java.util.List;

public class ExampleForEach {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        number.stream().map(x -> x * x).forEach(y -> System.out.println(y));
    }
}
