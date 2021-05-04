package com.arvind.basic.sort;

public class QuickSort {


    public static void main(String[] args) {
        int a[] = new int[]{10,16,8,12,15,6,3,9,5};
        quickSort(a,0, a.length-1);
        for(int i =0 ; i< a.length-1 ; i ++)
            System.out.print(a[i] + ",");


    }

    public static void  quickSort(int a[],int l,int h) {
        if(l<h) {
            int j = partition(a, l, h);
            quickSort(a,l , j);
            quickSort(a,j+1, h);


        }
    }

    public static int partition(int a[], int low, int high) {

        int pivot = a[low];

        int i=low, j = high;

        while (i < j) {

            while(a[i] <= pivot)
                i++;
            while(a[j] > pivot)
                j--;
            if( i < j)
            swap(a , i , j);
        }
        swap(a, low, j);
        return j;

    }

    private static int[] swap(int[] a, int i, int j) {

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
}
