package com.karan.practice.practice.java8.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerExample {


    static void addList(List<Integer> list) {
        int result = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of list values: " + result);
    }

    static int addList1(List<Integer> list) {
        int result = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return result;
    }
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        Consumer<List<Integer>> consumer = ConsumerExample::addList;
        consumer.accept(list);

        Function<List<Integer>, Integer> function = ConsumerExample::addList1;
        System.out.println(function.apply(list));

    }
}
