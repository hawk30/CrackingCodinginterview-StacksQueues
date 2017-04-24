package com.company;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by gaurav on 24/4/17.
 */
public class TowerOfHanoiUsingStack {
/*
    public static int N = 0;
    public static Stack<Integer>[] tower = new Stack[4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tower[1] = new Stack<>();
        tower[2] = new Stack<>();
        tower[3] = new Stack<>();
        System.out.println("enter no of disks");
        int n = sc.nextInt();
        N = n;
        for (int i = n; i > 0; i--)
            tower[1].push(i);
        move(n, 1, 2, 3);
    }

    public static void move(int n, int a, int b, int c) {
        if (n > 0) {
            move(n - 1, a, c, b);
            int data = tower[a].pop();
            tower[c].push(data);
            display();
            move(n - 1, b, a, c);
        }
    }

    public static void display() {
        for (int j = N - 1; j >= 0; j--) {
            String d1 = "", d2 = "", d3 = "";
            try {
                d1 = String.valueOf(tower[1].get(j));
                d2 = String.valueOf(tower[2].get(j));
                d3 = String.valueOf(tower[3].get(j));
            } catch (Exception e) {
            }
            System.out.println(" " + d1 + "|" + " " + d2 + "|" + " ");
        }
        System.out.println(" ");

    }*/
}