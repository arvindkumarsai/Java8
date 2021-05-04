package com.karan.practice.practice.algorithems.stack;

import java.util.Stack;

public class UseStackPrintQueue {

    static Stack<Integer> stk = new Stack<>();

    public static void printStackValues(Stack<Integer> stk){

        while(!stk.isEmpty())
        System.out.println(stk.pop());

    }

    public static void addValues(int val){
        stk.push(val);

    }

    public static void main(String[] args) {

        addValues(15);
        printStackValues(stk);
        addValues(25);
        addValues(25);
        printStackValues(stk);
    }
}
