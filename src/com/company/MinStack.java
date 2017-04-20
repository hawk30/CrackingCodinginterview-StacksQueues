package com.company;

/**
 * Created by gaurav on 18/4/17.
 */
public class MinStack {
    int size;
    int arr[];
    int min;
    int top;
    MinStack(int size){
        top=-1;
        this.size=size;
        arr= new int[size];
    }

    void push(int x){
        if(top==size)
            System.out.println("stack overflow");
        if(top==-1){
            min=x;
            arr[++top]=x;
            return;
        }
        if(x<min){
            arr[++top]=2*x-min;
            min=x;
        }else
            arr[top]=x;
    }
    void pop(){
        if(top==-1)
            System.out.println("stack underflow");
        int y= arr[top];
        if(y<min)
            min=2*min-y;
        top--;


    }
    void getMin(){
        if(top==-1)
            System.out.println("stack is empty");
        else
            System.out.println("min element "+min);
    }

}
