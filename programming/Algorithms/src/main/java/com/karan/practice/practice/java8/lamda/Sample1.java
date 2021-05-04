package com.karan.practice.practice.java8.lamda;

interface interf {
    void method1();
}

public class Sample1 {

    void method2() {
        int x = 300;
        interf i = () -> {
            System.out.println("" + x);
        };
        i.method1();

    }

    public static void main(String[] args) {
        Sample1 s = new Sample1();
        s.method2();
    }
}
