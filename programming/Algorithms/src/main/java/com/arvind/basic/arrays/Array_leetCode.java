package com.arvind.basic.arrays;

import java.util.*;

public class Array_leetCode {

    public static void main(String[] args) {
       System.out.println(isValid("{}"));
       reverseString("This  is   a   test ");

    }
    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<Character>();
        for (char e : s.toCharArray()) {
            if (map.containsKey(e)) {
                System.out.println("e");
                stack.push(e);
            } else if (stack.isEmpty() || e != map.get(stack.pop())) {
                System.out.println("e");
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static String reverseString(String s) {

        char[] c1 = s.toCharArray();
        for (int i =0; i< c1.length ; i++) {
            System.out.print(c1[i]);
        }
        String placeHolder = "";
        StringBuffer s1 = new StringBuffer();

        for(int i = c1.length; i >=0 ; i++) {
            placeHolder += placeHolder;
            if(c1[i]== ' ') {
                List reverse = new ArrayList<String>();
                reverse.add(reverse);
                //s1.append(Collections.reverse(reverse));
                placeHolder = "";
            }
        }
        System.out.println(s1);


        return "";
    }

    /**
     * new_index = (i + no_of_left_rotation) % length_of_array
     *   # new_arr[i] = array[new_index]
     * @param arr
     * @param numOfRotations
     * @return
     */
    public static int[] rotate(int [] arr , int numOfRotations) {

        int [] returnArr =new  int[10];

        for(int i=0; i<=numOfRotations; i++) {

            //returnArr = arr[i];
        }

        return returnArr;

    }

}

