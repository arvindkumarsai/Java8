package com.karan.practice.practice.collections.failfast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFast_Example {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("xyz");
        list.add("rtf");

        Iterator it = list.iterator();
        while (it.hasNext()) {

            System.out.println(it.next());
            list.add("111");


        }
        System.out.println(list);
    }

}
