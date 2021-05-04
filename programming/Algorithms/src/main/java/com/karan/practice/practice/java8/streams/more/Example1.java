package com.karan.practice.practice.java8.streams.more;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("bbb", "ccc", "aaa", "ddd");
        List<String> list1 = Arrays.asList("eee", "fff", "ggg", "hhh");
        Stream.concat(list.stream(), list1.stream()).forEach(s -> System.out.println(s));


    }
}
