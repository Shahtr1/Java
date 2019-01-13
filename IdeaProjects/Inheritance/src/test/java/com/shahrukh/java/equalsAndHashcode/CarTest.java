package com.shahrukh.java.equalsAndHashcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void primitivesShouldBeEqual(){
        int i = 4;
        int j = 4;
        assertTrue(i == j);
    }

    @Test
    public void stringShouldBeEqual(){
        String hello1 = "Hello";
        String hello2 = "Hello";
        /*
        with the string there is some optimization going on in the background,
        for constant values there is actually one, and both variables point to the same object in the memory
        variable is stored in stack, object is stored in Heap.
        but if we add a new string variable
        its not equal, so we should not use equal on objects and strings, as strings a objects too, so we should use equals method
         */
        String hello3 = "H";
        hello3 = hello3 + "ello";
        System.out.println(hello3);

       /* assertTrue(hello1 == hello2);
        assertTrue(hello1 == hello3); //its not equal
        */
       assertTrue(hello1.equals(hello3));
    }

    @Test
    public void porscheShouldBeEqual(){
        Car myPorsche1 = new Car("Marcus", "Porsche", "Silver");
        Car myPorsche2 = new Car("Marcus", "Porsche", "Silver");
        //assertTrue(myPorsche1 == myPorsche2);

       // myPorsche2 = myPorsche1; //Assignment line
        assertTrue(myPorsche1.equals(myPorsche1)); //working
        assertTrue(myPorsche1.equals(myPorsche2));//not working without the assignment line
        /*
        As we are in the class Object,  because in our Car class we have not overwritten the
         the equals method, so what happens is the original method of the class Object is used which is

         public boolean equals(Object obj){
            return (this == obj);
         }
         //we compares this which is the object itself, we compare it using equal operator, to the object that is coming into the method
         which is porsche2, it == only compares the reference variables not the objects,
         so this is false, as we have two different reference variables
         we can make this true again, by assigning myPorsche2 the reference variable of porsche1
         myPorsche2 = myPorsche1;
         which means the object myPorsche is somewhere in memory , and there is this one
         object in this line
         new Car("Marcus", "Porsche", "silver");
         and both the variables point to it
         but this is not what we want, we actually want to compare both objects
         */


    }
}
