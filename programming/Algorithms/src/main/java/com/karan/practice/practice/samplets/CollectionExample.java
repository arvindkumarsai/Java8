package com.karan.practice.practice.samplets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        List <Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        List <Integer> l1 = new ArrayList<>();;
        l1.add(4);
        l1.add(5);


        System.out.println(l);
        l.retainAll(l1);
        System.out.println(l);



        String s=null;
        System.out.println(s.length());
    }
}
