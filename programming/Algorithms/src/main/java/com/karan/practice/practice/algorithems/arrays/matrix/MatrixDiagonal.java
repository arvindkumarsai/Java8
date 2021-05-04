package com.karan.practice.practice.algorithems.arrays.matrix;

import java.util.Scanner;

import static java.lang.Math.abs;

public class MatrixDiagonal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int matrix [][] = new int [size][size];

        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++){

                matrix[i][j] = scan.nextInt();
            }
        }
        scan.close();

        for(int i=0;i<size;i++)
        {
            for (int j=0; j <size;j++){

                System.out.print(matrix[i][j] + " " );
            }
            System.out.println("");
        }

         int c =0;
         int d = 0;
        for(int i=0;i<size;i++)

        {
             c=c + matrix[i][i];
             d= d+ matrix[i][size-1-i];
        }

        System.out.println("Difference of Diagonal is " + abs(c-d));


    }
}
