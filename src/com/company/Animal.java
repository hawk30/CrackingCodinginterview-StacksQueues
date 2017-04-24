package com.company;

import java.util.Date;

/**
 * Created by gaurav on 24/4/17.
 */
public class Animal {
    String name;
    Date arrivalTime;

    public Animal(String name, Date arrivalTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
    }
    static Cat c1;
    static Cat c2;
    static Cat c3;
    static Dog d1;
    static Dog d2;
    static Dog d3;
    static AnimalShelter shelter;
    Animal(){
        c1 = new Cat("Cat1", new Date(100));
        d1 = new Dog("Dog1", new Date(200));
        c2 = new Cat("Cat2", new Date(400));
        c3 = new Cat("Cat3", new Date(500));
        d2 = new Dog("Dog2", new Date(600));
        d3 = new Dog("Dog3", new Date(800));
        shelter = new AnimalShelter();
    }

}
