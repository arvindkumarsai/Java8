package com.karan.practice.practice.logical;

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;

public class Prime {

    public static boolean isPrime(int n) {

        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(2));


        for (int i = 1; i < 100; i++) {
            if (isPrime(i))
                System.out.print("  " + i);
        }
    }
}
