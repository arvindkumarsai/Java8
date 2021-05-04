package com.karan.practice.practice.threads;

public class ThreadLocal_Example {

    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<String>(){
            @Override
            protected String initialValue() {
                return "Testing...";
            }
        };
        System.out.println(threadLocal.get());
        threadLocal.set("This is thread local value");

        System.out.println(threadLocal.get());
        threadLocal.remove();
        System.out.println(threadLocal.get());
    }
}
