package com.karan.practice.practice.samplets;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Hashtable;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();


        set.add("cc");
        set.add("ff");
        set.add("bb");
        set.add("dd");
        set.add("aa");

        Deque <String> deque = new ArrayDeque<>();
        deque.offerLast("cc");
        deque.offer("ff");
        deque.add("bb");
        deque.offerFirst("dd");
        deque.add("aa");

        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
        deque.poll();
        System.out.println(deque);

        deque.forEach(k -> System.out.println(".... " + k));

        Hashtable t = new Hashtable();




    }
}
