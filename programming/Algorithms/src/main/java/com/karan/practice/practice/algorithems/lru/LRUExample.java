package com.karan.practice.practice.algorithems.lru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LRUExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        int final_size = 5;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter value");

            int val = sc.nextInt();

            if (list.size() < final_size) {

                if (list.contains(val)) {
                    list.remove(list.indexOf(val));
                    list.add(val);
                } else {
                    list.add(val);
                }
            } else {
                if (list.contains(val)) {

                    list.remove(list.indexOf(val));
                    list.add(val);
                } else {
                    list.remove(0);
                    list.add(val);
                }
            }

            System.out.println("==> " + list);
        }
    }
}
