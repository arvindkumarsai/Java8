package com.karan.practice.practice.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleMap {

    public static void main(String[] args) {

        List <Integer> l = Arrays.asList(2,3,4,5);

        List<Integer> square = l.stream().map(x-> x*x ).collect(Collectors.toList());

        System.out.println(square);
    }
}
