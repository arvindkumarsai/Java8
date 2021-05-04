package com.karan.practice.practice.threads.deadlock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test implements Runnable {

    First f = new First();
    Second s = new Second();

    Test(){
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RacingThread");
        t.start();
        f.show(s); // get lock on a in this thread.
        System.out.println("Back in main thread");
    }
    @Override
    public void run() {
        s.show(f); // get lock on b in other thread.
        System.out.println("Back in other thread");

    }

    public static void main(String[] args) {

        new Test();
    }
}
