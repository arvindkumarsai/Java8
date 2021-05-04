package com.karan.practice.practice.algorithems.arrays;

import java.util.Arrays;
import java.util.List;

public class ShiftSamples {

    public static void main(String[] args) {

        System.out.println("=====Power of N=====");

        for (int i = 1; i <= 8; i++) {

            System.out.println(i + " : " + (1 << i));
        }

        System.out.println("======Even or Odd====");

        for (int i = 1; i <= 8; i++) {
            if ((i & 1) == 0) {
                System.out.println("even.. " + i);
            }
        }


        System.out.println("======Find unique value using XOR ====");
        int a[] = {2, 4, 6, 9, 8, 2, 4, 6, 8, 9};
        /*int res = a[0];
        for (int i = 1; i < a.length; i++) {
            res = res ^ a[i];
        }
*/
        List l = Arrays.asList(a);
       l.forEach((i)->{
            int res = a[0];
           System.out.println(i);
            res = res ^ a[Integer.parseInt(i.toString())];

            System.out.println("Results.. " + res);
        });



    }
}
