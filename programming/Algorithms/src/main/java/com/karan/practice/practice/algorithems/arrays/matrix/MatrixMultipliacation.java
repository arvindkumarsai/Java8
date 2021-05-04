package com.karan.practice.practice.algorithems.arrays.matrix;

public class MatrixMultipliacation {
    public static void main(String[] args) {

        //creating two matrices
        int a[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int b[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        System.out.println("Matrix 1");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("Matrix 2");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println(" ");
        }
        //creating another matrix to store the multiplication of two matrices
        int c[][] = new int[3][3];  //3 rows and 3 columns

        System.out.println("Matrix multiplication ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {

                    c[i][j] += a[i][k] + b[k][j];

                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();//new line
        }

        System.out.println("Matrix Adition ");
        int sum[][]= new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print( a[i][j] + b[i][j]  + " ");
            }
            System.out.println();//new line
        }

    }
}
