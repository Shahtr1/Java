package com.shahrukh.java.logging;

public class Name implements Cloneable{

    private String firstName;
    private String lastName;
    //as Strings are also objects so why not need to copy them, actually
    //string is an immutable object, which means if we change the object, like
    //firstname marcus to peter, will not influence the object , there would be created a new object

    public static Name newInstance(Name name) {

        return new Name(name.firstName, name.lastName);
    }

    public Name(Name name){

    }

    public Name(String firstName, String lastName){}

    public String firstName(){return firstName;}
    public String lastName(){return lastName;}
    public String name(){return firstName + " " + lastName;}
    public void alterTo(String firstName, String lastName){}

    public Name clone(){
        try{
            return (Name) super.clone();
        }catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
