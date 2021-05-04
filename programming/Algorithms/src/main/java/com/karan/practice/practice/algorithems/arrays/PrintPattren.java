package com.karan.practice.practice.algorithems.arrays;

public class PrintPattren {

    public static void print(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < (n - i) - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        print(10);
    }
}
