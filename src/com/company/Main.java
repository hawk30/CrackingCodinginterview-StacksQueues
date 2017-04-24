package com.company;

import java.util.Scanner;
import java.util.Stack;

import static com.company.Animal.*;

public class Main {

    public static void main(String[] args) {
        /*TwoStack ts = new TwoStack(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from" +
                " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from" +
                " stack2 is " + ts.pop2());*/
       /* MinStack s = new MinStack(5);
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();*/
        //TowerOfHanoi t= new TowerOfHanoi();
        //t.towerOfHanoi(3,'A','B','C');
        /*StackSort st= new StackSort();
        st.input.add(34);
        st.input.add(3);
        st.input.add(31);
        st.input.add(98);
        st.input.add(92);
        st.input.add(23);
        st.sortedStack();*/
        Animal q = new Animal();
        Animal animal;

        shelter.enQuue(c1);
        shelter.enQuue(d1);
        shelter.enQuue(c2);
        shelter.enQuue(c3);
        shelter.enQuue(d2);
        shelter.enQuue(d3);

        while (!shelter.isEmpty()) {
            animal = shelter.deQueueAny();
            System.out.println(animal == null ? "NULL" : animal.name);
        }

    }
}
