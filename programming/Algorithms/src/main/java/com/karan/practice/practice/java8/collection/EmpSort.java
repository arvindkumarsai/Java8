package com.karan.practice.practice.java8.collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmpSort {

    public static void main(String[] args) {

        ArrayList<Employee> eList = new ArrayList<>();
        eList.add(new Employee(1,"abc"));
        eList.add(new Employee(2,"xyz"));
        eList.add(new Employee(3,"AXZ"));
        eList.add(new Employee(4,"CCC"));
        eList.add(new Employee(5,"AAA"));

        System.out.println("before" +  eList);
        Collections.sort(eList);
        System.out.println("Comparable: " +  eList);

        Collections.sort(eList,new EmployeeIdComp());
        System.out.println("Comparator : " +  eList);

    }
}
