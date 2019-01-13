package com.shahrukh.java.logging;

import com.sun.javaws.exceptions.InvalidArgumentException;
import sun.plugin.dom.exception.InvalidStateException;

import java.io.IOException;

public class CarSelector {
    //static becoz we want to run the method without having an object of CarSelector
    //we dont need further instances, thats why method is static
    //void as it doesnt return anything and main so it would be noticed by java or compiler
    //compiler would bring it into an executable code
    //brackets should contain something, arguments that program might need to run
    //String is a class and arguments is a a variable
  /*remove below main for logback*/
    //  public static void main(String[] arguments){
        //the whole program is setup in here
        /*
        for each loop .....bla bla bla.. as array is an argument
        CarService carService = new CarService();
        carService.process();
        //we can do all this on the fly as shown below
        */
        /*for(String argument : arguments) {
            new CarService().process("argument");
        }
        but it would be smarter if we assign it to a variable
        */
 //       CarService carService = new CarService();
 //         for(String argument : arguments) {
 //           carService.process(argument);
 //       }
        //we can also pass String... arguments , when VM calls our main, this would have the ability
        //to directly put in strings, that will be converted by the compiler to an array.
        //more convenient. but lets keep it as it is
        /*
        we can even change the method , from void to int. but it would not be recognised
        as a main method then, but during test, we dont need that, we can call main whenever we want
         */
 //   }

    /*For unchecked exception below main*/
 /*   public static void main(String[] arguments){
        CarService carService = new CarService();
        for (String argument : arguments){
            //handling exceptions
            try {
                carService.process(argument);
            }catch(RuntimeException e){
                // we can log it LOG.error(e.getMessage()),e);
                System.err.println(e.getMessage()); //Unknown states would be printed out
                // or
                System.out.println(e.getMessage());// not red
                //but in 90% cases use logging, so we can configure it
            }
        }
    }
}*/

 /*For checked exceptions below main*/
     public static void main(String[] arguments){
         CarService carService = new CarService();
         for (String argument : arguments){
             // instead of try catch say validate argument
                if(isValid(argument)) {
                    carService.process(argument);
                }else{
                    System.err.println("ignoring invalid argument:" + argument);
                }
         }
     }

   /*//not for finally
    private static boolean isValid(String argument) {

         //valueOf comes with enum class
         try {
             CarState.valueOf(argument);
         }catch (IllegalArgumentException e){
             return false;
         }
         return true;
    }*/

   //for finally
   private static boolean isValid(String argument){
       try {
           CarState.valueOf(argument);

           System.out.println("This line will not be printed after exception " +argument);
       }catch (RuntimeException e){
           e.printStackTrace();
           //if we have an old library that will still throw a checked exception
           //like an IO exception, we can wrap a checked exception into a runtime exception
            IOException e2 =new IOException("my IOException");
            throw new RuntimeException(e2);// this means it we are wrapping check one in a runtime,so comment below print line
          // System.out.println("Hello again " + e.getMessage());
       }
       finally { //no matter even exception happened or not this would always be called
           //it is very important when we deal with IO operations that might fail
          //we can clean up resources here, we can do anything
           System.out.println("I am still running");
       }
       return true;
       //we see the stack trace
   }
}
























