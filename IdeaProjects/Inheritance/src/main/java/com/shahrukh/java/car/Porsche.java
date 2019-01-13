package com.shahrukh.java.car;

public class Porsche implements Car {

   // IOReader ioReader = new IOReader();

    public void drive(){
        System.out.println("Porsche driving...");
    }
/*
     //Alternative for finalize
    //Now override the finalize method
    @Override //this is actually a notation for compiler, which says i want to overrride some method
    public void finalize(){ //Totally in control of the JVM//if we give it a parameter, its not overwrite but overloading
        ioReader.close();//if within here there is an exception that is not caught, the process here will be stopped, and objects would be in zombie state, so the alternative is if we have a class, that uses resources that we want to be closed before its cleaned up, is we could provide some close method.
    }
*/
//use try finally instead

  /* public void close(){
       //clean up IO Resource;
   }*/
}
