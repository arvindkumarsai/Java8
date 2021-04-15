package com.arvind.interviewqs.basic;



public class Recursion {

    public static void main(String[] args) {
       System.out.println(fac(5));
        System.out.println(tailRecFac(1,5));
    }

    public  static int fac(int a) {
        if(a==0 || a==1) return 1 ;
        else return a * fac( a-1);
    }

    public static int tailRecFac(int a, int n) {
        if(n==0) return a ;
        else
            return tailRecFac(a*n ,n-1);
    }

    public static int recFib(int n , int prev, int next) {
        if(n==0)
            return prev;
        else
        if(n==1)
            return next;
        else
            return recFib(n-1, next, prev+ next );
    }

    public static int gcd(int a, int b) {
        if (b==0) return a;
        else
            return gcd(b,a%b);
    }

}
