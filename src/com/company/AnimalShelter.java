package com.company;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

/**
 * Created by gaurav on 24/4/17.
 */
public class AnimalShelter {
    LinkedList<Animal> catList;
    LinkedList<Animal> dogList;

    public AnimalShelter() {
        catList=new LinkedList<>();
        dogList= new LinkedList<>();
    }
    public void enQuue(Animal animal){
        if(animal instanceof Cat)
            catList.addLast(animal);
        else
            dogList.addLast(animal);
        System.out.println("arival time "+animal.arrivalTime);
    }
    public Animal deQueueAny(){
        if(dogList.size()==0 ||
           catList.size()!=0 && catList.peekFirst().arrivalTime.before(dogList.peekFirst().arrivalTime))
            return deQueueCat();
        else
            return deQueuedog();
    }

    public Animal deQueueCat(){
        return catList.size()==0 ? null: catList.removeFirst();
    }

    public Animal deQueuedog(){
        return dogList.size()==0? null: dogList.removeFirst();
    }
    public boolean isEmpty() {
        return catList.size() == 0 && dogList.size() == 0;
    }
}
