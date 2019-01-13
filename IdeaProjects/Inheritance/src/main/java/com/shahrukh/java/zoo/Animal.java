package com.shahrukh.java.zoo;


public abstract class Animal {

    protected int age;
    //we only add in inheritance, instance and variables
    //if we have a static method
    public static void something(){

    }

    //as abstract doesnt have a body, but in inheritance we have to specifically use keyword abstract
    //if a method is abstract the whole class should be abstract, it changes the behaviour.

    public abstract void eat();

    //it is visible to package level, it is visible in any class that extends Animal
    protected void age() {
        //we cant say      new Animal(); we cant create instances from abstract classes, only from concrete ones
        System.out.println("age is calculated...");
    }
}
