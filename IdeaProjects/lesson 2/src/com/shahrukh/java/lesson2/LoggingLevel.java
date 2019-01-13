package com.shahrukh.java.lesson2;

//enum was introduced in JAVA5

public enum  LoggingLevel {

    PENDING(1,""), PROCESSING(2,""), PROCESSED(3,"") ; //enumeration values

    private int i;
    private String s;
    //enum constructor the above values are calling the constructor
    private LoggingLevel(int i,String s){
        this.i = i;
        this.s = s;
    }
//enum allows us to have methods but it has static values that we can only choose from.
    public int code(){
        return i;
    }
/* only use when you need it
    public boolean isPending(){
        return this == PENDING;
    }
    public boolean isProcessing(){
        return this == PROCESSING;
    }
    */
}
