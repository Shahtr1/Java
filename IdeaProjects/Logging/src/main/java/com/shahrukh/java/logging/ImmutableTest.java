package com.shahrukh.java.logging;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class ImmutableTest {

    @Test
    public void demonstrateImmutableBigInteger(){
        //BigInteger is similar to int, but better, it can work on ints of any langs, until you r memory is full
        BigInteger one = new BigInteger("1");
        BigInteger two = one.add(one);
        BigInteger zero = two.subtract(two);

        assertTrue(one.intValue() == 1);
        assertTrue(two.intValue() == 2);
        assertTrue(zero.intValue() == 0);

        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
    }

    @Test
    public void demonstrateImmutableString(){
        //Strings are by definition immutable, they will always return a new object, not infulence the original
        String s1 = "Hello";
        String s2 = "Hello";
        //s1 = "Hi";

        assertNotEquals(s1, s2);
        assertEquals("Hi", s1);
        assertEquals("Hello", s1);

        System.out.println(s1);
        System.out.println(s2);

    }
}
