package com.karan.practice.practice.java8.functions;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> isAudult = b -> (b > 18);

        System.out.println(" 21 -> " + isAudult.test(21));
        System.out.println(" 12 -> " + isAudult.test(12));
    }
}
