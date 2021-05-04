package com.karan.practice.practice.algorithems.arrays;

public class IsSorted {

    public static boolean isSort(int a[]) {

        int n = a.length;
        if ( n < 2)
        {
            return true;
        }
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i -1]) {
                return false;
            }
        }
        return true;
    }

    public static int minimum(int a[])
    {
        int min = a[0];
        for (int i=1;i<a.length;i++){
            if(a[i] < min)
            {
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int a [] = {3,4,6,8};
        int b[] = {5,2,6,7};
        System.out.println("Sorting " + isSort(a));
        System.out.println("Sorting " + isSort(b));
        System.out.println("Sorting " + minimum(b));

    }
}
