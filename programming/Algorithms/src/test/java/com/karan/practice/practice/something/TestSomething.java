package com.karan.practice.practice.something;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSomething {

    static List<Integer>  lst = getList();

    public static List<Integer> getList() {
        lst = new ArrayList<>();
        for (int i = 1; i < 1500; i++)
        {
         lst.add(i);
        }
        return lst;
    }


    @Test
    public void printForEach() throws Exception {

        lst.forEach(a -> System.out.println(a));
    }

    @Test
    public void printFor() throws Exception {

        for(Integer i: lst){
            System.out.println(i);
        }
    }


}
