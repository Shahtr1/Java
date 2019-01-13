//INTERFACE
    package com.shahrukh.java.logging;
    public interface Car{ //other classes now can implement the interface car, they can play the role of a car

        /*
        public static final int MAX_SPPED = 320; // but avoid it, because speeds can vary, so it isnt the part of the ineterface, or shouldnt be,it should be a part of the class
        //check SonaQube, where it says constants should not be used in interfaces
        //public static final is redundant , and should be removed
        */

        void drive(); //no body in interfaces// all methods in interfaces are always public, so dont use it
        //abstract implies here that the method is not implemented that it only consists of method signature
        //but this is also redundant so dont use it, it is still there like public
        //also there are marker methods, that have many methods
    }