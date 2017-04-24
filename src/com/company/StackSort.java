package com.company;

import java.util.Stack;

/**
 * Created by gaurav on 24/4/17.
 */
public class StackSort {
    Stack<Integer> input= new Stack<>();
    Stack<Integer> sorted= new Stack<>();

    void sortedStack(){
        while(!input.isEmpty()){
            int temp=input.pop();
            while(!sorted.isEmpty() && sorted.peek()>temp){
                input.push(sorted.pop());
            }
            sorted.push(temp);
        }
        System.out.println("original stack "+ input.toString());
        System.out.println("sorted stack "+ sorted.toString());
    }

}
