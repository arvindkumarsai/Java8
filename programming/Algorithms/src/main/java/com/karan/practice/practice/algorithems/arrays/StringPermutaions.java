package com.karan.practice.practice.algorithems.arrays;

public class StringPermutaions {

    public static void permutaion(String str, int l, int r) {
        if (l == r) {
            System.out.println(":" + str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permutaion(str, l + 1, r);
                str = swap(str, l, i);

            }
        }
    }

    public static String swap(String str, int i, int j) {

        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String str = "ABC";
        permutaion(str, 0,  str.length() - 1);

    }

}
