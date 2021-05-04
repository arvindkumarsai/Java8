package com.karan.practice.practice.algorithems;

public class TailRecursion {

    public static int fact(int n)
    {
        if(n==0)
            return 1;
        return n*fact(n-1);

    }

    public static int tailFact(int n, int results)
    {
        if(n==0)
        {
            return results;
        }
        return tailFact(n-1, n* results);

    }
    public static void main(String[] args) {

        System.out.println(" Results:  "+fact(5));
        System.out.println(" Results:  "+tailFact(5,1));
    }
}
