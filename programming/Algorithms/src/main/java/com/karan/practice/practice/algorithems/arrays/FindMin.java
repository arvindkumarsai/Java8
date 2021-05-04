package com.karan.practice.practice.algorithems.arrays;

import java.util.Arrays;

public class FindMin {

    public static int getMin(int a[]) {

        if (a.length == 0) {
            return -1;
        }
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public static int getMinSort(int a[]){
        Arrays.sort(a);
        return a[0];
    }

    public static void main(String[] args) {

        int b[]={};
        int a[] = {3, 8, 9, 2, 6, 7};
        System.out.println(getMin(b));
        System.out.println(getMinSort(a));
    }
}
