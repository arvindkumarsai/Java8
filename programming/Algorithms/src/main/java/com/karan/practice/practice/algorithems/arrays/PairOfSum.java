package com.karan.practice.practice.algorithems.arrays;

public class PairOfSum {

    public static void sumOfPair(int a[] , int sum){

        for (int i=0;i<a.length-1 ;i++){
            for (int j=i;j< a.length;j++){
                if(a[i] + a[j] == sum){
                    System.out.println("Pair of "+ sum + " is  [" + a[i] + " , " + a[j] +" ]");
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        sumOfPair(a,10);
    }
}
