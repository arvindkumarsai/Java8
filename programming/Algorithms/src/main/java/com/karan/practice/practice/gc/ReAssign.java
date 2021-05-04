package com.karan.practice.practice.gc;

/* Java program to demonstrate gc
 when one object referred to other object */

class ReAssign
{
    // to store object name
    String obj_name;

    public ReAssign(String obj_name)
    {
        this.obj_name = obj_name;
    }

    // Driver method
    public static void main(String args[])
    {
        ReAssign t1 = new ReAssign("t1");
        ReAssign t2 = new ReAssign("t2");

        //t1 now referred to t2
        t1 = t2;

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
