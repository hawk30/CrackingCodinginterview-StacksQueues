package com.company;

import java.util.Stack;

/**
 * Created by gaurav on 24/4/17.
 */
public class MyQueue {
  /* Stack<Integer> inbox= new Stack<>();
   Stack<Integer> outbox= new Stack<>();

   void enquue(int x){
       inbox.push(x);
   }
   int deQueue(){
       if(outbox.isEmpty()){
           while(!inbox.isEmpty())
               outbox.push(inbox.pop());
       }
       return outbox.pop();
   }*/

  Stack<Integer> sk= new Stack<>();
     void enQuue(int x) {
         int data = 0;
         if (!sk.isEmpty()) {
             data = sk.pop();
             enQuue(x);
             sk.push(data);
         } else
             sk.push(x);
     }
     int deQueue(){
        return sk.pop();
     }

}
