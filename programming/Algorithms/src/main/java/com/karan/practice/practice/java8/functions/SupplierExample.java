package com.karan.practice.practice.java8.functions;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Integer> s = () -> {
            int a[] = {2, 5, 8};
            int s1 = (int) (Math.random() * 2) + 1;
            return a[s1];
        };

        for (int i = 0; i < 15; i++) {
            System.out.println(i + " Time " + s.get());
        }

    }
}
