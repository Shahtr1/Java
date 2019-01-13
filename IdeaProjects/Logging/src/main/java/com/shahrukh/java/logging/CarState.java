package com.shahrukh.java.logging;

import java.io.IOException;

public enum CarState {
    DRIVING, WAITING, PARKING;

    /*
    //JAVA has CHECKED EXCEPTIONS//
    a public state from method that converts a string to a CarState using a switch
    statement .AS its possible to use a string in a switch, but avoid it
    we assume input from the user coming from the console cannot be an enum, should be string
    throw exception only in the default case, is someone adds the enum
     */
   /* remove the from  as we dont need it in Exception because we can also do finally
   public static CarState from(String state)  {
        switch(state){
            case "DRIVING":
                return DRIVING;
            case "WAITING":
                return WAITING;
            case "PARKING":
                return PARKING;
            default:
                //Exception in JAVA is like any other class
 // NEVER THROW THE NullPointerException YOURSELF, JAVA WILL THROW IT FOR YOU, IT IS A VERY FAMOUS EXCEPTION

                //checked exception is Exception().
                //unchecked is RuntimeException(), runtime is used where you dont know what to do excatly

               throw new RuntimeException("unknown state:" + state);
        }
    }*/


}
