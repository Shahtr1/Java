package com.shahrukh.java.methods;

import org.junit.Test;
import org.junit.Assert; //regularly

import static org.junit.Assert.*; //statically

public class DemoTest {
    private byte myByte;
    private short myShort;
    private int myInt;
    private long myLong;
    private float myFloat;
    private double myDouble;
    private Object myObject; //null for object is default

    private boolean myBoolean ;//false for boolean is default// in some cases exceptions you should write it
    private char myChar;

    @Test
    public void shouldDemonstrateStaticImport(){
        org.junit.Assert.assertTrue(true); //long one
        Assert.assertTrue(true);
    }

    @Test
    public void shouldDemonstrateDataTypeDefaultValues(){
        boolean b; //this is not default

        System.out.println("byte default value: " + myByte);
        System.out.println("short default value: " + myShort);
        System.out.println("int default value: " + myInt);
        System.out.println("long default value: " + myLong);
        System.out.println("float default value: " + myFloat);
        System.out.println("double default value: " + myDouble);
        System.out.println("Object default value: " + myObject);
        System.out.println("boolean default value: " + myBoolean);
        System.out.println("char default value: " + myChar);
        System.out.println("char default value as int: " + (int) myChar);
        //char has a null character
        /*
        43.34 is a double
        43.34f OR 43.34F are a float
        short s = 43, int is converted into short
        long l = 43, int is converted into long

         */
    }

    @Test
    public void shouldDemonstrateNumberObjects(){
        //The all extract type Number, the abstract class Number.  Number.java
        //all number types in parallel also exist as an object

        Byte b = Byte.valueOf(myByte); //this converts a byte primitive to a Byte object
        //valueOf is a static method, also there is parseByte, it works on a string

        Byte a =Byte.parseByte("2");
        //Why these exist as Objects?
        //the reason is, there is something called Collections, similar to array, array with steriods, you can only throw in objects
        //the object will wrap around primitive type
        //Byte a =Byte.parseByte("2");    collection.add(a);  a.byteValue();
        //the above lines are a lot of work, now JAVA do it automatically and converts primitive to object
        //for primitive default is 0 but the object has false, so a.byteValue() this will throw a nullPointerException.
        //Be careful with these conversions
        //so each of the above number types have the same type as an object,
        //Integer for int, Long for long, Float for float,

        Boolean c = Boolean.FALSE;
        //Internally compiler will do Boolean c = Boolean.FALSE.booleanValue();
    }

    @Test
    public void shouldDemonstrateRanges(){
        //The JVM needs obe number to store the info whether its a + or -
        System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("char: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
    }

    @Test
    public void shouldDemonstrateBase2(){
        byte binary1 = 0B0; //B or b means it sis in binary format
        short binary2 = 0b1;
        int binary3 = 0b0100101_0101_0101_1100_0000;
        //printed out in base10
        System.out.println(binary1);
        System.out.println(binary3);
    }

    @Test
    public void shouldDemonstrateBase8(){
        byte octal1 = 07;
        short octal2 = 010;
        long octal3 = 017653100__________476L;
        //printed out in base10
        System.out.println(octal1);
        System.out.println(octal3);
    }

    @Test
    public void shouldDemonstrateBase16(){
        byte hex1 = 0x0;
        short hex2 = 0xF;
        long hex3 = 0x39__e49Fa___BCD10L;
        //printed out in base10
        System.out.println(hex1);
        System.out.println(hex3);
    }
}

























