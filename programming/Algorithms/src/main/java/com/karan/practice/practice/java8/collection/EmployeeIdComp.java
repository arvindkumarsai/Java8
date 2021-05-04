package com.karan.practice.practice.java8.collection;

import java.util.Comparator;

public class EmployeeIdComp implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee emp1 = (Employee) o1;
        Employee emp2 = (Employee) o2;

        return emp2.getEname().compareTo(emp1.getEname());
    }



}
