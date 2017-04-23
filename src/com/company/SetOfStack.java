package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by gaurav on 20/4/17.
 */
public class SetOfStack {
    final static int threshhold=5;
    LinkedList<Stack<Integer>> setOfStacks= new LinkedList<Stack<Integer>>();

    void push(int x){
        if(setOfStacks.isEmpty() || setOfStacks.getLast().size()==threshhold){
            Stack<Integer> sk= new Stack<>();
            sk.push(x);
            setOfStacks.add(sk);
          }
          setOfStacks.getLast().push(x);
    }

    int pop(){
        if(setOfStacks.isEmpty())
            System.out.println("stacks underflow");
        Stack<Integer> last= setOfStacks.getLast();
        int data=last.pop();
        if(last.isEmpty())
            setOfStacks.removeLast();
        return data;
      }

      int popAt(int index){
        Stack<Integer> sk= setOfStacks.get(index);
        int data=sk.pop();
         Stack<Integer> curr, next;
         for(int i=index; i<setOfStacks.size()-1; i++){
             curr=setOfStacks.get(i);
             next=setOfStacks.get(i+1);
             curr.push(next.remove(0));
         }
         if(setOfStacks.getLast().isEmpty())
             setOfStacks.removeLast();
        return data;
      }



}
