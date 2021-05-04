package com.karan.practice.practice.sorting;

public class Insertion {

    public static void insertionSort(int a[]) {
        int temp;
        for (int i = 0; i < a.length; i++) {

            for (int j = i; j > 0; j--) {

                if (a[j] < a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }

    public static void main(String[] args) {

        int a[] = {9, 4, 6, 1, 24, 4, 5};
        insertionSort(a);

    }
}
