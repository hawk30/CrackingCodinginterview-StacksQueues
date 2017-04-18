package com.company;

/**
 * Created by gaurav on 18/4/17.
 */
public class TwoStack {
    int size;
    int top1, top2;
    int arr[];

    public TwoStack(int size) {
        this.size = size;
        this.top1 = -1;
        this.top2 = size;
        this.arr = new int[size];
    }

    void push1(int x){ //method to push an element to stack 1
        //if there is atleast one space available
        if(top1<top2-1)
            arr[++top1]=x;
        else
            System.out.println("stack overflow");
    }
    void push2(int x){// method to push an element in stack 2
        //if there is at-least one space is available
        if(top1<top2-1)
            arr[--top2]=x;
        else
            System.out.println("satck overflow");
    }
    int pop1(){ //method to remove the top element from stack 1
        if(top1==-1)
            System.out.println("stack underflow");
        int data=arr[top1];
        top1--;
        return data;
    }

    int pop2(){// method to remove top element from satck 2
        if(top2==size)
            System.out.println("stack underflow");
        int data=arr[top2];
        top2--;
        return data;
    }
}
