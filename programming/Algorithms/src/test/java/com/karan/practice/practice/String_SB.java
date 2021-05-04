package com.karan.practice.practice;

import org.junit.Test;

public class String_SB {

    @Test
    public void printRepeat(){
        int n=128;
        char c = 'c';
        String ans =" ";
        for (int i=0;i<n;i++){
            ans+=c;
        }
        System.out.println(ans);
    }
    @Test
    public void printRepeatSB(){
        int n=128;
        char c = 'c';
        StringBuffer ans = new StringBuffer();
        for (int i=0;i<n;i++){
            ans.append(c);
        }
        System.out.println(ans.toString());
    }

    @Test
    public void printRepeatSBi(){
        int n=128;
        char c = 'c';
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<n;i++){
            ans.append(c);
        }
        System.out.println(ans.toString());
    }

    @Test
    public void prefixSum(){

        int c=0;
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<=i;j++){
                c=c+a[j];
            }
        }
        System.out.println(c);
    }
}
