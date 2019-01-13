package com.shahrukh.java.utils;

import org.junit.Test;

import java.util.*;
import java.util.ArrayList;

public class ArrayListTest {
    private final int INITIAL_CAPACITY = 5;

    @Test  //Collection interface
    public void shouldDemonstrateArrayList(){
        Collection<String> elements = new ArrayList<>(INITIAL_CAPACITY);
        System.out.println(elements.size());
        System.out.println(elements.isEmpty());
        elements.add("A");
        elements.add("B");
        elements.add("A");
        elements.add("C");
        elements.add("E");
        elements.add("E");

        System.out.println(elements.isEmpty());

        elements.remove("A");//the first A is removed
        System.out.println(elements.size());

        for(String str : elements){
            /*
            iteration will be done by the compiler for us internally, there is an iterator method which
            will be used, iterator and iterable both will be used
             */
            System.out.println(str);
        }
        //System.out.println(elements);
    }

    @Test  //List interface
    public void DemonstrateArrayList(){
        List<String> elements = new ArrayList<>(INITIAL_CAPACITY);
        elements.add("A");
        elements.add("B");
        elements.add("A");
        elements.add("C");
        elements.add("E");
        elements.add("E");
        elements.add(0,"T");
        elements.remove(1);

        System.out.println(elements);
    }
}
