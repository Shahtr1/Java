package com.shahrukh.java.equalsAndHashcodeImplementation;

public class SomeClass {

    private byte myByte;
    private short myShort;
    private int myInt;
    private long myLong;
    private float myFloat;
    private double myDouble;
    private char myChar;
    private boolean myBoolean;
    private String myString;

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj ==null){
            return false;
        }
        SomeClass other = (SomeClass) obj;

        if(myByte != other.myByte){
            return false;
        }
        if(myShort != other.myShort){
            return false;
        }
        if(myInt != other.myInt){
            return false;
        }
        if(myLong != other.myLong){
            return false;
        }
        if(Float.floatToIntBits(myFloat) != Float.floatToIntBits(other.myFloat)){
            return false;
        }
        if(Double.doubleToLongBits(myDouble) != Double.doubleToLongBits(other.myDouble)){
            return false;
        }
        if(myBoolean != other.myBoolean){
            return false;
        }
        if(myChar != other.myChar){
            return false;
        }
        return myString.equals(other.myString);
    }

    @Override
    public int hashCode(){
        int result = 0;
        result = 31 * result + myByte;
        result = 31 * result + myShort;
        result = 31 * result + myInt;

        result = 31 *result + (int) (myLong ^ (myLong >>> 32));
        result = 31 *result + Float.floatToIntBits(myFloat); //native function

        long temp = Double.doubleToLongBits(myDouble); //native function
        result = 31 *result + (int) (temp ^ (temp >>> 32));

        result = 31 * result + (myBoolean ? 1231 : 1237);
        result = 31 * result + myChar;
        return 31 * result + myString.hashCode();
    }
}














