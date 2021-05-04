package com.karan.practice.practice.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleSort {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

        List<String> results = names.stream().sorted().collect(Collectors.toList());

        System.out.println(results);
    }
}
