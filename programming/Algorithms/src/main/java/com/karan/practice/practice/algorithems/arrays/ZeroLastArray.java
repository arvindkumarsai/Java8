package com.karan.practice.practice.algorithems.arrays;

import java.util.Arrays;

public class ZeroLastArray {

    public  void zeroLast(int a[]) {

        System.out.println((Arrays.toString(a)));
        int count = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] != 0) {
                a[count++] = a[i];
            }

        }
        while (count < a.length - 1) {
            a[count++] = 0;
        }
        System.out.println((Arrays.toString(a)));

    }


    public  void firstZero(int a[]) {
        System.out.println((Arrays.toString(a)));

        int count = a.length - 1;

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 0) {
                a[count--] = a[i];
            }

        }
        while (count >= 0) {
            a[count--] = 0;
        }
        System.out.println((Arrays.toString(a)));

    }

    public static void main(String[] args) {

        int b[] = {1, 4, 0, 5, 8, 0, 7, 0};
        ZeroLastArray zeroLastArray = new ZeroLastArray();
        zeroLastArray.zeroLast(b);
        zeroLastArray.firstZero(b);
    }
}
