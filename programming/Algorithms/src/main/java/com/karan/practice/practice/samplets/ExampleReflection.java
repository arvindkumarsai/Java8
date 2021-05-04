package com.karan.practice.practice.samplets;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ExampleReflection {

    public static void main(String[] args) throws Exception {

        Class c = Class.forName("com.epam.practice.practice.samplets.Student");

        Method[] m = c.getDeclaredMethods();

        for (Method m1 : m) {
            System.out.println(m1);
        }

        Field[] f = c.getDeclaredFields();
        for (Field f1 : f) {
            System.out.println(f1);
        }
    }
}
