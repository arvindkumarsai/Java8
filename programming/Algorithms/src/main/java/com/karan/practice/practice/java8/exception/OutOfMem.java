package com.karan.practice.practice.java8.exception;

public class OutOfMem {


    public static void main(String[] args) {

        int a[] = {1,2,3};
        int count=0;
        while(count < a.length){
            System.out.println(a[count]);
        }
    }
}
