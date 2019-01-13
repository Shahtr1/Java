package com.shahrukh.java.logging;

import org.junit.Test;

import static org.junit.Assert.*;

public class PorscheTest {

    @Test
    public void shouldCloneStringArray(){
        String[] array = {"one","two","three"};
        String[] copiedArray = array.clone();
        assertNotSame(array, copiedArray); //this check if we have a refrence, as they arent the same reference, different objects
        assertSame(array, array);

        for(String str: copiedArray) {
            System.out.println(str);
        }
    }

    @Test
    public void shouldClonePorsche(){
        Porsche porsche = new Porsche("Marcus");
        Porsche petersPorsche = porsche.clone();

        assertNotSame(porsche, petersPorsche);
        petersPorsche.sellTo("Peter");

        assertEquals("Porsche of Peter", petersPorsche.asString());

        assertEquals("Porsche of Marcus", porsche.asString());
    }
}
