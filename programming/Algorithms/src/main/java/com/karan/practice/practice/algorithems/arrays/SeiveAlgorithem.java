package com.karan.practice.practice.algorithems.arrays;

public class SeiveAlgorithem {

    private static final int SIZE = 1000;
    private static boolean[] isPrime = new boolean[SIZE];

    private static void initialiseSeive() {
        for (int i = 2; i < SIZE; i++) {
            isPrime[i] = true;
        }

        for (int n = 2; 2 * n < SIZE; n++) {
            if (isPrime[n]) {
                for (int m = n; m * n < SIZE; m++) {
                    isPrime[m * n] = false;
                }
            }
        }
    }

    private static void printPrime() {
        int n = 0;
        for (int i = 2; i < SIZE; i++) {
            if (isPrime[i]) {
                System.out.printf("%5d%s", i, ++n % 16 == 0 ? "\n" : "");
            }
        }
        System.out.printf("%n%d primes less than %d%n", n, SIZE);
    }

    public static void main(String[] args) {

        initialiseSeive();
        printPrime();
    }
}
