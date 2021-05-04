package com.karan.practice.practice.gc;

/* Java program to demonstrate gc
 of anonymous objects */

class AnnomousObject
{
    // to store object name
    String obj_name;

    public AnnomousObject(String obj_name)
    {
        this.obj_name = obj_name;
    }

    // Driver method
    public static void main(String args[])
    {
        //anonymous object without reference id
        new AnnomousObject("t1");

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