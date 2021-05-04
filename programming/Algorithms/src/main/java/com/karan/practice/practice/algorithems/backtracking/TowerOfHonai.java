package com.karan.practice.practice.algorithems.backtracking;

public class TowerOfHonai {


    public static void towerOfHonai(int N, char fromPeg, char toPeg, char auxPeg) {

        if (N == 1) {
            System.out.println("Move Disk 1 fromPeg " + fromPeg + " toPeg " + toPeg);
            return;
        }
        // Move top n-1 from A to B using c aux
        towerOfHonai(N - 1, fromPeg, auxPeg, toPeg);
        System.out.println("Move Disk 1 fromPeg " + fromPeg + " toPeg " + toPeg);
        towerOfHonai(N - 1, auxPeg, toPeg, fromPeg);

    }

    public static void main(String[] args) {

        towerOfHonai(3, 'A', 'C', 'B');

    }

}
