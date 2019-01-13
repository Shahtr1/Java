package com.shahrukh.java.zoo;

public class Gorilla extends Animal {

    //overriding it
    public void age() {
        System.out.println("Gorilla is implementing the age by itself");
    }

    public void eat() {
        System.out.println("Gorilla is eating...");
    }
}
