package com.karan.practice.practice.gc;

public class InSideMethod {
    // to store object name
    String obj_name;

    public InSideMethod(String obj_name)
    {
        this.obj_name = obj_name;
    }

    static void show()
    {
        //object t1 inside method becomes unreachable when show() removed
        InSideMethod t1 = new InSideMethod("t1");
        display();

    }
    static void display()
    {
        //object t2 inside method becomes unreachable when display() removed
        InSideMethod t2 = new InSideMethod("t2");
    }

    // Driver method
    public static void main(String args[])
    {
        // calling show()
        show();

        // calling garbage collector
        Runtime.getRuntime().gc();
    }

    @Override
    /* Overriding finalize method to check which object
    is garbage collected */
    protected void finalize() throws Throwable
    {
        // will print name of object
        System.out.println(this.obj_name + " successfully garbage collected");
    }
}
