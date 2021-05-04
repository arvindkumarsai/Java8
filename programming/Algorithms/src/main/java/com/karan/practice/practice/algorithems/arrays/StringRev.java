package com.karan.practice.practice.algorithems.arrays;

public class StringRev {

    public static void stringReverse(String str) {


        char ch[] = str.toCharArray();
        System.out.println(ch);
        int left = 0;
        int right = str.length() - 1;
        char temp;

        for (left = 0; left < right; left++, right--) {

            temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

        }

        System.out.println(ch);


    }


    public static boolean isPolin(String str) {

        int mid = str.length() / 2;
        boolean flag = true;
        for (int i = 0; i < mid; i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        return flag;


    }

    public static void stringReverse1(String str) {
        System.out.println(str);
        char temp = ' ';
        char a[] = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        String str = "HelloA";
        stringReverse1(str);

        //System.out.println(isPolin("lirril"));
    }
}
