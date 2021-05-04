package com.karan.practice.practice.algorithems.arrays;

import java.util.Arrays;

public class ReArrangeArray {

    public static int[] reArrange(int a[], int max) {

        int arr[] = new int[max];

        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                arr[a[i]] = a[i];
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int a[] = {-1, 1, 0, 1, -1, 5 ,9, 8};
        System.out.println(Arrays.toString(a));
        int b[] = reArrange(a, 9 + 1);

        for (int v : b) {
            if (v == 0)
                v = -1;
            System.out.print(v + "  ");
        }

    }
}
