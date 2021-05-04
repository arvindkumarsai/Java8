package com.karan.practice.practice.queue;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueue_Example1 {
    public static void main(String[] args) {

        Comparator reverse = new Comparator(){

            public int compare(Object param1, Object param2) {
                return (Integer) param2 - (Integer) param1;
            }
        };
        PriorityQueue<Integer> qu = new PriorityQueue();
        qu.offer(24);
        qu.offer(9);
        qu.offer(15);
        qu.offer(45);
        qu.offer(8);


        System.out.println(qu);
        System.out.println(qu.poll());
        System.out.println(qu.poll());
        System.out.println(qu);
        PriorityQueue<Integer> p1 = new PriorityQueue (20,reverse);
        p1.offer(24);
        p1.offer(9);
        p1.offer(15);
        p1.offer(45);
        p1.offer(8);


        System.out.println("Values: "+ p1);

    }
}
