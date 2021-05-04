package com.karan.practice.practice.threads;


import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocal_Example2{



    public static void main(String[] args) {

        CustomerThread c1 = new CustomerThread("Thread-1");
        CustomerThread c2 = new CustomerThread("Thread-2");
        CustomerThread c3 = new CustomerThread("Thread-3");
        CustomerThread c4 = new CustomerThread("Thread-4");

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}

class CustomerThread extends Thread{

    static AtomicInteger custId= new AtomicInteger();


    ThreadLocal <Integer> tl = new ThreadLocal<Integer>(){

        @Override
        protected Integer initialValue() {
            return custId.getAndIncrement();
        }
    };

    CustomerThread(String name){
        super(name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() + " Customer Id   " +  tl.get());
    }

}