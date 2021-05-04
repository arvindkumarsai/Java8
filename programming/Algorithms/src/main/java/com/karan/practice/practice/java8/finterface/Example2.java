package com.karan.practice.practice.java8.finterface;

@FunctionalInterface
interface Square {
    int calculate(int x);

    default int mm() {
        return 1;
    }
    ;
}

public class Example2 {

    public static void main(String[] args) {

        Square s = x -> x * x;
        System.out.println(s.calculate(5));

    }

}
