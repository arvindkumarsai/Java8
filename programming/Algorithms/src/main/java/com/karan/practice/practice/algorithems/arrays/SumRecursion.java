package com.karan.practice.practice.algorithems.arrays;

public class SumRecursion {

    public static int sumOfArray(int a[], int n) {

        if (n <= 0) {
            return 0;
        } else {
            System.out.print(a[n - 1] + "  ");
            return sumOfArray(a, n - 1) + a[n - 1];
        }


    }

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sumOfArray(a, a.length));

    }
}
