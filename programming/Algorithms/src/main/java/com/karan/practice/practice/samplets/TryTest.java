package com.karan.practice.practice.samplets;

import java.util.HashSet;
import java.util.TreeSet;

public class TryTest {

    public int add() {


        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    static void m1(){
        System.out.println("Hi");

    };

    public static void main(String[] args) {
        TryTest t = new TryTest();
        //System.out.println(t.add());
        t=null;
        t.m1();

        HashSet ts = new HashSet();

        ts.add("1234");
        ts.add(new StringBuilder("2223"));
        ts.add(null);

        //System.out.println(ts);
    }
}
