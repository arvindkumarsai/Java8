package com.arvind.basic.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Array_leetCode {

    public static void main(String[] args) {
       System.out.println(isValid("{}"));

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

}




class Solution {

}