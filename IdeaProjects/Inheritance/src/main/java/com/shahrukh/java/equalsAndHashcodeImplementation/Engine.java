package com.shahrukh.java.equalsAndHashcodeImplementation;

public class Engine {
    private long type;
    private String optionalField;

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Engine other = (Engine) obj;

        if(type != other.type){
            return false;
        }
        if(optionalField == null){ //to prevent nullPointerException
            if(other.optionalField != null){
                return false;
            }
        }else if(!optionalField.equals(other.optionalField)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        int result = 1;
        result = 31 * result + (int) (type ^ (type >>> 32));//int hashCode from long
        // convert long to int, long has 64 bits and int has 32 bits,so you want to make the long half its size, in a away, that will resolve into least possible collisions
        // type >>> 32 is a shift by 32 bits,  ^ is an XOR where we can combine the field
        //and then casting to int where we throw away half of long.

        return 31 * result + ((optionalField == null) ? 0 : optionalField.hashCode());
        //code is like in a while loop going over each character of the string, and calculating the int value of the string
    }

}












