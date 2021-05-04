package com.karan.practice.practice.threads;

import java.util.concurrent.*;

public class CallableExample {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> f = null;
        Future<Double> f2;
        Future<Integer> f3;

        System.out.println("Starting");


        f = es.submit(new Sum(100));


        f3 = es.submit(new Factorial(15));
        f2 = es.submit(new Hypot(3, 4));


        try {

            System.out.println("Integer Sum : " + f.get(10000, TimeUnit.MILLISECONDS));
            System.out.println("Integer Fact... : " + f3.get());
            System.out.println("Double Hypo: " + f2.get());
        } catch (InterruptedException exc) {
            System.out.println(exc);
        } catch (ExecutionException exc) {
            System.out.println(exc);
        } catch (Exception e) {
            System.out.println(e);
        }
        es.shutdown();
        System.out.println("Done");
    }

}

class Sum implements Callable<Integer> {
    int stop;

    Sum(int v) {
        stop = v;
    }

    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= stop; i++) {
            sum += i;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException in) {

        }
        return sum;
    }
}

class Hypot implements Callable<Double> {
    double side1, side2;

    Hypot(double s1, double s2) {
        side1 = s1;
        side2 = s2;
    }

    public Double call() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException in) {

        }
        return Math.sqrt((side1 * side1) + (side2 * side2));
    }

}

class Factorial implements Callable<Integer> {
    int stop;

    Factorial(int v) {
        stop = v;
    }

    public Integer call() {
        int fact = 1;
        for (int i = 2; i <= stop; i++) {
            fact *= i;
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException in) {

        }
        return fact;
    }
}


