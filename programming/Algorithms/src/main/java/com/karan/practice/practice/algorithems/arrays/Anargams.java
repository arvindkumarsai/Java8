package com.karan.practice.practice.algorithems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Anargams {

    public static boolean isAnagram(String str1, String str2) {

        boolean flag = false;
        if (str1.length() == str2.length()) {
            char s1AsChar[] = str1.toCharArray();
            char s2AsChar[] = str2.toCharArray();
            Arrays.sort(s1AsChar);
            Arrays.sort(s2AsChar);
            flag = Arrays.equals(s1AsChar, s2AsChar);
        }
        return flag;
    }

    public static boolean isAnagram1(String str1, String str2) {

        boolean flag = false;
        if (str1.length() == str2.length()) {
            flag = Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());
        }
        return flag;
    }


    public static boolean isAnagramHashing(String str1, String str2) {

        int charInt[] = new int[256];

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            charInt[str1.charAt(i)]++;
            charInt[str2.charAt(i)]--;
        }
        for (int i = 0; i < charInt.length; i++) {
            if (charInt[i] != 0) {
                return false;
            }
        }
        return true;

    }

    public static boolean isAnagram2(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {

            if (map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            } else {
                map.put(str1.charAt(i), new Integer(1));
            }

            if (map.containsKey(str2.charAt(i))) {
                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
            } else {
                map.put(str2.charAt(i), new Integer(-1));
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("***Hashing technique ***");
        System.out.println(isAnagramHashing("abc", "acb"));
        System.out.println(isAnagramHashing("abc", "acd"));
        System.out.println("\n***Array sort technique ***");
        System.out.println(isAnagram("abc", "cba"));
        System.out.println(isAnagram("abc", "cbd"));
        System.out.println("\n***Map  technique ***");
        System.out.println(isAnagram2("abc", "cba"));
        System.out.println(isAnagram2("abc", "cbs"));
        System.out.println("\n***Array Sort  technique ***");
        System.out.println(isAnagram1("abc", "cba"));
        System.out.println(isAnagram1("abc", "cbd"));
    }
}
