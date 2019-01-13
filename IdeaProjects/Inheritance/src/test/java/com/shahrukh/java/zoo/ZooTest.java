package com.shahrukh.java.zoo;


////////////////INHERITANCE////////////////
//java doesn't support multiple inheritance
import org.junit.Test;

public class ZooTest {

    @Test
    public void shouldFeedAllAnimals(){
        Zoo zoo = new Zoo();
        //this is polymorphism, which means on the left side we have a reference variable of a variable of a parent class, and on right, an animal can be anything, different things can be assigned to animals
        Animal[] animals = {new Dog(), new Gorilla(), new Lion(), new Tiger()};
        zoo.feedAnimals(animals);
    }
}
