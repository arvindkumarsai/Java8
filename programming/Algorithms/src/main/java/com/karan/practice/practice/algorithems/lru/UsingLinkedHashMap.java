package com.karan.practice.practice.algorithems.lru;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UsingLinkedHashMap {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new LinkedHashMap<>();
        int final_size = 5;

        Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.println("Enter Number ");
            int val = sc.nextInt();
            if (map.size() < final_size) {
                if (map.containsKey(val)) {
                    map.remove(val);
                    map.put(val, val);
                } else {
                    map.put(val, val);
                }
            } else {
                if (map.containsKey(val)) {
                    map.remove(val);
                    map.put(val, val);
                } else {
                    map.remove(map.keySet().iterator().next());
                    map.put(val, val);
                }
            }
            System.out.println("==>" + map);
        }

    }
}
