package com.karan.practice.practice.algorithems.arrays;

import java.util.Arrays;

public class MaxOccurenceCharector {

    public static void maxCount(String str) {

        int a[] = new int[256];
        for (int i = 0; i < str.length(); i++) {

            a[str.charAt(i)] = a[str.charAt(i)] + 1;
        }

        int max = -1;
        int c = -1;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                c = i;
            }
        }
        System.out.println((char) c + " " + max);
        char d = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (max < a[str.charAt(i)]) {
                max = a[str.charAt(i)];
                d = str.charAt(i);
            }
        }
        System.out.println( d + " " + max);

    }

    public static void main(String[] args) {

        maxCount("abbecdee");
    }
}
