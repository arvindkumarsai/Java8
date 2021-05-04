package com.karan.practice.practice.java8.functions;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<Integer, Integer> sum = i -> {
            int cnt = 0;
            for (int a = 0; a <= i; a++) {
                cnt = cnt + a;
            }
            return cnt;
        };

        System.out.println(sum.apply(10));

    }
}
