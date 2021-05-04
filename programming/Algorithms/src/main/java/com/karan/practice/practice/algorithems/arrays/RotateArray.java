package com.karan.practice.practice.algorithems.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];

            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;

            }
            System.out.println(" ==============");
            for (int p : nums) {
                System.out.print(p+ "  ");
            }
        }
        return nums;
    }

    public static void retate1(int a[], int k) {

        int temp, prev;
        for (int i = 0; i < k; i++) {
            prev = a[a.length - 1];
            for (int j = 0; j < a.length; j++) {
                temp = a[j];
                a[j] = prev;
                prev = temp;

            }
        }
    }

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int rotations = scan.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        scan.close();

        for (int i : arr) {
       //     System.out.print(i + " ");
        }
      //  System.out.println("\n ====== ");
        arr = rotate(arr, rotations);

        for (int i : arr) {
       //     System.out.print(i + "  ");
        }


    }
}
