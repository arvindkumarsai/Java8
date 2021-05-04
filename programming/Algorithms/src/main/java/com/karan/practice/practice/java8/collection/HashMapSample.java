package com.karan.practice.practice.java8.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSample {

    public static void main(String[] args) {

        Map<Employee, Employee> map = new HashMap<>();

        map.put(new Employee(1,"abc"),new Employee(1,"abc"));
        map.put(new Employee(2,"xyz"),new Employee(2,"abc"));
        map.put(new Employee(1,"abc"),new Employee(1,"abc"));
        map.put(new Employee(3,"abc"),new Employee(3,"abc"));

        System.out.println("Size; "+ map.size());
        System.out.println(map.toString());
    }

}
