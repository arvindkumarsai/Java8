package com.karan.practice.practice.sorting;

public class BubbleSort {

    public static void bubbleSrt(int a[]) {

        int n = a.length;
        int k;
        for (int m = n; m >= 0; m--) {

            for (int i = 0; i < n - 1; i++) {

                k = i + 1;
                if (a[i] > a[k]) {
                    swap(i, k, a);
                }
            }
        }

        for (int i=0;i<a.length;i++){

            System.out.print( a[i] + "  ");
        }
    }

    public static void swap(int i, int j, int a[]) {

        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {

        int a[] = {9,4,6,1,24,4,5};
        bubbleSrt(a);
    }
}
