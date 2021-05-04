package com.karan.practice.practice.gc;

public class IslandOfIsolation
{
    IslandOfIsolation i;
    String obj_name;

    public IslandOfIsolation(String obj_name)
    {
        this.obj_name = obj_name;
    }
    public static void main(String[] args)
    {
        IslandOfIsolation t1 = new IslandOfIsolation("1");
        IslandOfIsolation t2 = new IslandOfIsolation("2");

        // Object of t1 gets a copy of t2
        t1.i = t2;

        // Object of t2 gets a copy of t1
        t2.i = t1;

        // Till now no object eligible
        // for garbage collection
        t1 = null;

        //now two objects are eligible for
        // garbage collection
        t2 = null;

        // calling garbage collector
        Runtime.getRuntime().gc();

    }

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println(this.obj_name + " successfully garbage collected");
    }
}

