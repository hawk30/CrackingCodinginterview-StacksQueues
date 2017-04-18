package com.company;

/**
 * Created by gaurav on 18/4/17.
 */
public class ThreeStack {
    int size, first,last, mid;
    int arr[];
 final int midPosition=mid;

    public ThreeStack(int size) {
        this.size = size;
        first=-1;
        last=size;
        mid=(first+size)>>1;
        arr=new int[size];
    }
    void push1(int x){// method to push an element on stack 1
        if(first<mid-1)
            arr[++first]=x;
        else
            System.out.println("stack overflow");

    }

    void push2(int x){
        if(mid<last-1)
            arr[++mid]=x;
        else
            System.out.println("stack overflow");
    }
    void push3(int x){
        if(last>mid+1)
            arr[--last]=x;
        else
            System.out.println("stack overflow");
    }
    int pop1(){
        if(first==-1)
            System.out.println("stack underflow");
        int data=arr[first];
        first++;
        return data;
    }
    int pop2(){
        if(mid<midPosition)
            System.out.println("stack underflow");
        int data=arr[mid];
        mid++;
        return data;
    }
    int pop3(){
        if(last==size)
            System.out.println("stack underflow");
        int data=arr[last];
        last--;
        return data;
    }
}
