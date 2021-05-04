package com.karan.practice.practice.java8.ececuters;

import java.util.concurrent.CountDownLatch;

public class CountdownTest {
    public static void main(String[] args) {

        CountDownLatch cd = new CountDownLatch(5);
        System.out.println("Starting");
        new MyThread(cd);
        try {
            cd.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Done..");

    }


}

class MyThread implements Runnable {
    CountDownLatch latch;

    MyThread(CountDownLatch c) {
        latch = c;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            latch.countDown();
        }

    }
}