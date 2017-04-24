package com.company;

/**
 * Created by gaurav on 23/4/17.
 */
public class TowerOfHanoi {
    void towerOfHanoi(int n, char fromRod, char auxRod, char toRod){
        if(n==1) {
            System.out.println("move disk 1 from " + fromRod + " to rod " + toRod);
            return;
        }
        towerOfHanoi(n-1, fromRod, toRod, auxRod);
        System.out.println("move disk "+n+" from "+fromRod+" to rod "+toRod);
        towerOfHanoi(n-1, auxRod,fromRod,toRod);
    }
}
