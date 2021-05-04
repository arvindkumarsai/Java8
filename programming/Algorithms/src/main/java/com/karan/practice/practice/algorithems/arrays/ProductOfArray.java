package com.karan.practice.practice.algorithems.arrays;

public class ProductOfArray {

    public static void prod(int a[], int b[]) {

   /*     for (int i=0;i<a.length;i++){
            System.out.print(a[i] * b[i] + " ");
        }*/

        int count = 0;
        while (count < a.length && count < b.length) {
            System.out.println(a[count] * b[count]);
            count++;
        }

        while (count < a.length) {
            System.out.println(a[count]);
            count++;
        }

        while (count < b.length) {
            System.out.println(b[count]);
            count++;
        }
    }

    public static int prod1(int a[], int b[]) throws Exception {
        if (a.length != b.length) {
            throw new IllegalStateException();
        }
        return 1;
    }


    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 7, 8};
        int b[] = {4, 5, 6, 25};

        try {
            prod1(a, b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
