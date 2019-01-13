package com.shahrukh.java.zoo;

//use extends first then implements

public class Zoo {
    public void feedAnimals(Animal[] animals) {

        Animal.something(); //this will not be inherited, we cant override it, as it is static
        for (Animal animal: animals){
            animal.eat();//abstract method as in interfaces, abstract keyword not needed
            animal.age();//concrete method in Animal
        }
    }
}
