package com.karan.practice.practice.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceOperations {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);

        if (productObj.isPresent()) {
            System.out.println(productObj.get());
        }

        int prod = myList.stream().reduce(1,(a,b) -> a*b);
        System.out.println(prod);

        int evenProduct = myList.stream().reduce(1,(a,b) -> {
           if (b%2 == 0) return a*b;
           else return a;
        });
        System.out.println(evenProduct);
    }
}
