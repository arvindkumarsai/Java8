package com.karan.practice.practice.sorting;

import java.util.Arrays;

public class CountSort {


    public static void countingSort(int[] input, int k) {
        // create buckets
        int counter[] = new int[k + 1];

        // fill buckets
        for (int i : input) {
            counter[i] =counter[i] + 1;
        }
        System.out.println("Count array values");
        System.out.println(Arrays.toString(counter));

        // sort array
        int ndx = 0;
        for (int i = 0; i < counter.length; i++) {
            while (0 < counter[i]) {
                input[ndx++] = i;
                counter[i] = counter[i] - 1;
            }
        }
    }


    public static void countingSortForChar(char ch [], int size) {

        int counter[] = new int[256];

        int indx = 0;

        // fill the buckets

        for (char c : ch){
         //   counter[()]
        }
        for (int i=0;i<counter.length;i++){


        }
    }

    public static void main(String[] args) {
        System.out.println("Counting sort in Java");
        int[] input = {60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40};

        // Max element
        int k = 60;

        System.out.println("integer array before sorting");
        System.out.println(Arrays.toString(input));

        countingSort(input, k);

        System.out.println("integer array after sorting using counting sort algorithm");
        System.out.println(Arrays.toString(input));

    }
}
