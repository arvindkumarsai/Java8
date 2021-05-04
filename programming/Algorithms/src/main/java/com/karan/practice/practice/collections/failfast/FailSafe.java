package com.karan.practice.practice.collections.failfast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class FailSafe {
    public static void main(String[] args) {



        ConcurrentLinkedDeque list = new ConcurrentLinkedDeque<>();
        list.add("abc");
        list.add("xyz");
        list.add("rtf");

        Iterator it = list.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());
        }
        System.out.println(list);
    }
}
