package com.karan.practice.practice.algorithems.arrays.matrix;

import java.util.Scanner;

public class UpperTrangleMatrix {
    public static void main(String[] args) {

        int i, j;
        System.out.println("Enter total rows and columns: ");
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int column = s.nextInt();
        int array[][] = new int[row][column];

        System.out.println("Enter matrix:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                array[i][j] = s.nextInt();
                System.out.print(" ");
            }
        }
        System.out.println("The above matrix before  is ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("The Upper traingle is ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (i <= j) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("The Lower traingle is ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (i >= j) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println(" ");
        }

    }
}
